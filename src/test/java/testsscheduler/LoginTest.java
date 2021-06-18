package testsscheduler;

import config.ConfigBase;
import dto.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import screenobjects.SplashScreen;

public class LoginTest extends ConfigBase {
    @Test
    public void loginTest(){
        boolean isLogged=
                new SplashScreen(driver)
                        .checkVersion("0.0.3")
                        .fillEmail("john12@gmail.com")
                        .fillPassword("Jkh123hjh$")
                        .clickLogin()
                .skipWizard()
                        .isFabAddPresent();
        Assert.assertTrue(isLogged);
    }
    @Test
    public void completeLoginTest(){
        boolean isLogged =
                new SplashScreen(driver)
                .checkVersion("0.0.3")
                .completeLogin(Credentials.builder()
                        .email("john12@gmail.com")
                        .password("Jkh123hjh$")
                                .build())
                .skipWizard()
                .isFabAddPresent();
        Assert.assertTrue(isLogged);

    }

        @Test
        public void negativeLogin(){

            String error =
                    new SplashScreen(driver)
                    .checkVersion("0.0.3")
                    .completeLoginNeg(Credentials.builder()
                            .email("john12@gmail.com")
                            .password("Jkh123hjh")
                            .build())
                    .errorMessage();
            Assert.assertEquals(error,"Wrong email or password");
    }
}
