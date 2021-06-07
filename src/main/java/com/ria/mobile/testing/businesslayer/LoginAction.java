package com.ria.mobile.testing.businesslayer;

public class LoginAction extends BaseBusiness{
    public void loginToGmail(){
        LOG.info("Login to Gmail stats");
        login.clickGotIt();
        login.clickTakeMeToGmail();
        LOG.info("Login was success");
    }
}
