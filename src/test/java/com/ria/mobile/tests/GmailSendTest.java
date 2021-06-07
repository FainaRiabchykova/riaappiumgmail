package com.ria.mobile.tests;

import com.ria.mobile.testing.datasuplier.DataManager;
import org.testng.annotations.Test;

public class GmailSendTest extends  BaseTest{

    @Test(dataProvider = "gmailData", dataProviderClass = DataManager.class)

    public void verifyEmailIsSent(String email, String subject, String emailText){
        loginAction.loginToGmail();
        composeAction.composeLetter(email, subject, emailText);
        verifyAction.verifyLetterWasSent(subject, emailText);
    }
}
