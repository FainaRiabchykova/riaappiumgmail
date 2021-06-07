package com.ria.mobile.testing.businesslayer;

import org.testng.Assert;

public class VerifyAction extends BaseBusiness{

    public void verifyLetterWasSent(String subject, String emailText){
        LOG.info("Verification is starting");
        inbox.waitVisibilityOfElement(20, inbox.getMailToolBar());
        inbox.clickNewReceivedLetterItem();
        Assert.assertEquals(inbox.getReceivedSubject(), subject + " Inbox ");
        Assert.assertEquals(inbox.getReceivedEmailText(), emailText);
        LOG.info("Verification is finished: subject is {}, emailText is {}", inbox.getReceivedSubject(), inbox.getReceivedEmailText());
    }
}
