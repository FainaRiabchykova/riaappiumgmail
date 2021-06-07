package com.ria.mobile.testing.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Login extends BasePage {
    //qariatest@gmail.com
    //Aaaa!111

    @AndroidFindBy(id = "welcome_tour_got_it")
    private MobileElement gotItButton;
    @AndroidFindBy(id="setup_addresses_add_another")
    private MobileElement setupAddress;
    @AndroidFindBy(xpath="//android.widget.TextView[@text='Google']")
    private MobileElement googleSetupCTA;
    @AndroidFindBy(id="identifierId")
    private MobileElement emailField;
    @AndroidFindBy(id="//android.widget.Button[@text='Next']")
    private MobileElement nextCTA;
    @AndroidFindBy(xpath = "//android.widget.EditText")
    private MobileElement passwordField;
    @AndroidFindBy(id="passwordNext")
    private MobileElement passwordNextCTA;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='I agree']")
    private MobileElement iAgreeCTA;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='ACCEPT']")
    private MobileElement acceptCTA;
    @AndroidFindBy(id="action_done")
    private MobileElement takeMeToGmail;


    public void clickGotIt(){
        gotItButton.click();
    }
    public Login clickSetupAddress(){
        setupAddress.click();
        return this;
    }
    public Login clickGoogleSetupCTA(){
        googleSetupCTA.click();
        return this;
    }
    public void submitEmail(String email){
        emailField.sendKeys(email);
    }
    public Login clickNext(){
        nextCTA.click();
        return this;
    }
    public void submitPassword(String password){
        passwordField.sendKeys(password);
    }
    public Login clickPasswordNextCTA(){
        passwordNextCTA.click();
        return this;
    }
    public Login clickIAgreeCTA(){
        iAgreeCTA.click();
        return this;
    }
    public Login clickAcceptCTA(){
        acceptCTA.click();
        return this;
    }
    public void clickTakeMeToGmail(){
        takeMeToGmail.click();
    }

}
