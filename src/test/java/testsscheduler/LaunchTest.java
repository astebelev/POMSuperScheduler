package testsscheduler;

import config.ConfigBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import screenobjects.SplashScreen;

public class LaunchTest extends ConfigBase {
    @Test
    public void launchTest(){
        String version = new SplashScreen(driver).getCurrentVersion();
        Assert.assertEquals(version,"0.0.3");
    }
}
