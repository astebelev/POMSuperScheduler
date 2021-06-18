package testsscheduler;

import config.ConfigBase;
import dto.Credentials;
import dto.Event;
import org.testng.Assert;
import org.testng.annotations.Test;
import screenobjects.SplashScreen;

public class EventTest extends ConfigBase {

    @Test
    public void eventCreationTest(){
        boolean isEventAdded = new SplashScreen(driver)
                .checkVersion("0.0.3")
                .completeLogin(Credentials.builder()
                        .email("john12@gmail.com")
                        .password("Jkh123hjh$")
                        .build())
                .skipWizard()
                .initCreateNew()
                .fillCreationFormEvent(Event.builder()
                        .title("new Event")
                        .type("Event")
                        .breaks(2)
                        .ammount(50)
                        .build())
                .confirmCreationEvent()
                .isFabAddPresent();
        Assert.assertTrue(isEventAdded);
    }
}
