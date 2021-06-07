package com.ria.mobile.testing.businesslayer;

public class ComposeAction extends BaseBusiness{

    public void composeLetter(String email, String subject, String emailText){
        LOG.info("Composing Letter starts");
        compose.waitVisibilityOfElement(30, compose.getMailToolBar());
        compose.waitVisibilityOfElement(30, compose.getFirstLetterItem());
        compose.clickComposeButton();
        compose.fillToField(email);
        compose.fillSubjectField(subject);
        compose.fillComposeEmailArea(emailText);
        compose.clickSendCTA();
        LOG.info("Letter was sent successfully with subject {} and text {}", subject, emailText);
    }
}
