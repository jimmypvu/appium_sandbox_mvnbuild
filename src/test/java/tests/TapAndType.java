package tests;

import io.appium.java_client.AppiumBy;
import jpvu.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TapAndType extends BaseTest {

    @Test
    public void tapElementsAndInputText(){
        //mobile locators supported: xpath, id, classname, androidUIautomator (AppiumBy), accessibilityId (AppiumBy)
        //find elements with appium inspector, need to pass app path, deviceName, platformName, automationName (driver), server ip and port

//        driver.findElement(By.);
// By just like selenium, can use for xpath, id, classname locators
// xpath generic syntax: //tagName[@attribute='value'] or //tagName
        scrollToEleByText("Preference");
        driver.findElement(AppiumBy.accessibilityId("Preference")).click(); // AppiumBy only for mobile locators accessibilityId / androidUiAutomator

        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();

        driver.findElement(By.id("android:id/checkbox")).click();

        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "WiFi settings", "Alert title should be 'WiFi settings");

        driver.findElement(By.id("android:id/edit")).sendKeys("ShyGuyWifi");

        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
    }

}
