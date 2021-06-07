package com.ria.mobile.testing.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Inbox extends BasePage{

    @AndroidFindBy(id="mail_toolbar")
    private MobileElement mailToolBar;
    public MobileElement getMailToolBar() { return mailToolBar; }


    @AndroidFindBy(xpath = "(//android.view.View)[1]")
    MobileElement newReceivedLetterItem;
    @AndroidFindBy(id="subject_and_folder_view")
    MobileElement subjectReceived;
    @AndroidFindBy(xpath = "//android.view.View[@resource-id]//android.view.View")
    MobileElement textReceived;

    public MobileElement getNewReceivedLetterItem() {
        return newReceivedLetterItem;
    }

    public void clickNewReceivedLetterItem(){
        newReceivedLetterItem.click();
    }
    public MobileElement getSubjectReceived() {
        return subjectReceived;
    }

    public MobileElement getTextReceived() {
        return textReceived;
    }

    public String getReceivedSubject(){
       return subjectReceived.getText();
    }
    public String getReceivedEmailText(){
        return textReceived.getText();
    }
}
