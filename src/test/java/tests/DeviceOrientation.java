package tests;

import io.appium.java_client.AppiumBy;
import jpvu.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class DeviceOrientation extends BaseTest {

    @Test
    public void switchToLandscape() throws MalformedURLException {
        scrollToEleByText("Preference");
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        driver.findElement(By.id("android:id/checkbox")).click();

        DeviceRotation landscape = new DeviceRotation(0, 0, 90);
//        driver.rotate(ScreenOrientation.LANDSCAPE);
//        driver.getOrientation();

        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "WiFi settings", "Alert title should be 'WiFi settings");

    }
}
