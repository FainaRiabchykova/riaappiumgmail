package com.ria.mobile.testing.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import static org.openqa.selenium.Keys.ENTER;


public class Compose extends BasePage{


    @AndroidFindBy(id="mail_toolbar")
    private MobileElement mailToolBar;
    public MobileElement getMailToolBar() { return mailToolBar; }
    @AndroidFindBy(xpath = "(//android.view.View)[1]")
    MobileElement firstLetterItem;
    public MobileElement getFirstLetterItem() { return firstLetterItem; }

    @AndroidFindBy(id = "compose_button")
    private MobileElement composeButton;
    @AndroidFindBy(id = "to")
    private MobileElement toField;
    @AndroidFindBy(id = "subject")
    private MobileElement subjectField;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Compose email']")
    private MobileElement composeEmailArea;
    @AndroidFindBy(id = "send")
    private MobileElement sendCTA;
    @AndroidFindBy(id = "send")
    private MobileElement x;


    public void clickComposeButton(){
        composeButton.click();
    }
    public  void fillToField(String email){
        toField.sendKeys(email);
    }
    public  void fillSubjectField(String subject){
        subjectField.click();
        subjectField.sendKeys(subject);
    }

    public  void fillComposeEmailArea(String emailText){
        composeEmailArea.sendKeys(emailText);
    }
    public void clickSendCTA(){
        sendCTA.click();
    }

}
