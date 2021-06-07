package com.ria.mobile.testing.pages;

import com.ria.mobile.testing.driver.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class BasePage {
    AppiumDriver<MobileElement> driver = DriverManager.getDriver();

    public BasePage(){
        PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()),this);
    }

    public void waitVisibilityOfElement(long timeToWaite, final MobileElement element) {
       
        WebDriverWait wait = new WebDriverWait(driver, timeToWaite);
        wait.until(visibilityOf(element));
    }
}
