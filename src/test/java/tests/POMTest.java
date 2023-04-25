package tests;

import io.appium.java_client.pagefactory.AndroidFindBy;
import jpvu.BaseTest;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class POMTest extends BaseTest {
    @AndroidFindBy(accessibility = "Views")
    public WebElement viewsBtn;
    @AndroidFindBy(accessibility = "Gallery")
    public WebElement galleryBtn;

    @Test
    public void swipeTest(){
        viewsBtn.click();
        galleryBtn.click();

//        ScreenOrientation orientation = driver.getOrientation();
//        DeviceRotation landscape = new DeviceRotation(0, 0, 90);
//        driver.rotate(landscape);

        ScreenOrientation orientation = ScreenOrientation.valueOf(System.getProperty("webdriver.android.screenOrientation", "landscape").toUpperCase());

        ScreenOrientation landscape = ScreenOrientation.LANDSCAPE;
//        driver.rotate(landscape);

        try{
//            ((Rotatable) driver).rotate(orientation);
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println(landscape);
    }
}
