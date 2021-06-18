package advancedobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SwipeableVertical extends BaseScreenADV{
    public SwipeableVertical(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy( id = "com.h6ah4i.android.example.advrecyclerview:id/container")
    List<MobileElement>list;

    public SwipeableVertical swipeDown(){
        MobileElement el = list.get(0);

        Rectangle rect = el.getRect();


        int yfrom = (int) (rect.getY()*0.8);
        int x = rect.getX() + rect.getWidth()/2;
        int yto = (int) (rect.getY() + rect.getHeight()*1);


        TouchAction<?>touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(yfrom,x))
                .moveTo(PointOption.point(yfrom,yto))
                .release().perform();

        return this;
    }
    public SwipeableVertical swipeUp(){
        MobileElement el = list.get(1);
        Rectangle rect = el.getRect();

        int yfrom = (int) (rect.getY()*1.8);
        int x = rect.getX() + rect.getWidth()/2;
        int yto = (int) (rect.getY()/4);

        TouchAction<?>touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(yfrom,x))
                .moveTo(PointOption.point(yfrom,yto))
                .release().perform();

        return this;
    }
    public SwipeableVertical pause(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }
}
