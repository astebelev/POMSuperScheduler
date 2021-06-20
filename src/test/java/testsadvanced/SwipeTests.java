package testsadvanced;

import advancedobjects.DragScreen;
import config.ConfigAdvancedPages;
import org.testng.annotations.Test;

public class SwipeTests extends ConfigAdvancedPages {

    @Test
    public void test() {
        new DragScreen(driver)
                .gotoSwipe()
                .gotoSwipeBasic()
                .swipeLeftToRight()
                .swipeRightToLeft();

    }

    @Test
    public void verticalSwipe() {
        new DragScreen(driver)
                .gotoSwipe()
        .gotoSwipeVertical().swipeDown().swipeUp();
    }
}

