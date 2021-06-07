package com.ria.mobile.tests;

import com.ria.mobile.testing.businesslayer.ComposeAction;
import com.ria.mobile.testing.businesslayer.LoginAction;
import com.ria.mobile.testing.businesslayer.VerifyAction;
import com.ria.mobile.testing.driver.DriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    LoginAction loginAction = new LoginAction();
    ComposeAction composeAction = new ComposeAction();
    VerifyAction verifyAction = new VerifyAction();

    @BeforeClass
    public void createSession(){
        DriverManager.getDriver();
    }
    @AfterMethod
    public void resetApp(){
        DriverManager.getDriver().resetApp();
    }
    @AfterClass
    public void closeSession(){
        DriverManager.closeDriver();
        DriverManager.closeAppium();
        DriverManager.closeEmulator();
    }
}