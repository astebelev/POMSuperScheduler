package advancedobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.util.List;

public class SwipeableBasic extends BaseScreenADV{
    public SwipeableBasic(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy (id = "com.h6ah4i.android.example.advrecyclerview:id/container")
    List<MobileElement>list;
    
    public SwipeableBasic swipeLeftToRight(){
        MobileElement el = list.get(0);

        Rectangle rect = el.getRect();
        //rect.getWidth();
        int xfrom = rect.getX()+20;
        int y = rect.getY()+ rect.getHeight()/2;
        int xto = rect.getX()+ rect.getWidth()-20;

        TouchAction<?>touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(xfrom,y))
                .moveTo(PointOption.point(xto,y))
                .release().perform(); //собрать и запусти!!!

        return this;
    }
    public SwipeableBasic swipeRightToLeft(){
        MobileElement el = list.get(4);
        Rectangle rect = el.getRect();
        int xfrom = rect.getX()+ rect.getWidth()-20;
        int y = rect.getY()+ rect.getHeight()/2;
        int xto = rect.getX()+20;

        TouchAction<?>touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(xfrom,y))
                .moveTo(PointOption.point(xto,y))
                .release().perform();

        return this;
    }
    public SwipeableBasic pause(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }
}
