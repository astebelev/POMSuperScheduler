package advancedobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DraggableBasic extends BaseScreenADV {

    public DraggableBasic(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='com.h6ah4i.android.example.advrecyclerview:id/drag_handle']")
    List<MobileElement> list;

    public DraggableBasic dragDown() {
        MobileElement el = list.get(0);
        Rectangle rect = el.getRect();
        int x = rect.getX()+ rect.getWidth()/2;
        int y = rect.getY()+ rect.getHeight()/2;
        Dimension window = driver.manage().window().getSize();
        TouchAction<?> touchAction = new TouchAction<>(driver);
            touchAction.longPress(PointOption.point(x,y)).moveTo(PointOption.point(x, window.getHeight()- rect.getHeight()/2))
                    .release()
                    .perform();


        return this;
    }
    public DraggableBasic dragDown() {
        MobileElement el = list.get(0);
        Rectangle rect = el.getRect();
        int x = rect.getX()+ rect.getWidth()/2;
        int y = rect.getY()+ rect.getHeight()/2;
        Dimension window = driver.manage().window().getSize();
        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(x,y)).moveTo(PointOption.point(x, window.getHeight()- rect.getHeight()/2))
                .release()
                .perform();


        return this;
    }
}


