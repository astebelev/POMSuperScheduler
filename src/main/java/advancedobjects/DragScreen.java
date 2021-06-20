package advancedobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.FindBy;

public class DragScreen extends BaseScreenADV{
    public DragScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @AndroidFindBy(accessibility = "Swipe")
    MobileElement swipe;

    @FindBy(xpath = "//*[@resource-id='com.h6ah4i.android.example.advrecyclerview:id/button'][2]")
    MobileElement dragBasic;

    public SwipeScreen gotoSwipe(){
        swipe.click();
        return new SwipeScreen(driver);


    }
    public DraggableBasic gotoDragableBasic(){
        dragBasic.click();
        return new DraggableBasic(driver);

    }
}
