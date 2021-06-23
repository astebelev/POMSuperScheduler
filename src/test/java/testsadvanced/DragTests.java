package testsadvanced;

import advancedobjects.DragScreen;
import config.ConfigAdvancedPages;
import org.testng.annotations.Test;

public class DragTests extends ConfigAdvancedPages {
    @Test
    public void dragTest(){
        new DragScreen(driver)
                .gotoDragableBasic()
                .dragDown()
                .dragDownCount(3);
    }
}
