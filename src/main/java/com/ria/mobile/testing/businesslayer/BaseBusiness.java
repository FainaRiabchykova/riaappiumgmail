package com.ria.mobile.testing.businesslayer;

import com.ria.mobile.testing.pages.Compose;
import com.ria.mobile.testing.pages.Inbox;
import com.ria.mobile.testing.pages.Login;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseBusiness {
    protected static final Logger LOG = LogManager.getRootLogger();
    Login login = new Login();
    Compose compose = new Compose();
    Inbox inbox = new Inbox();
}
