package com.ria.mobile.testing.datasuplier;

import org.testng.annotations.DataProvider;

public class DataManager {
    private DataManager() {
    }
    @DataProvider(name = "gmailData")
    public static Object[][] gmailData() {
        return new Object[][]{
                { "qariatest@gmail.com",
                 "Test subject" + System.currentTimeMillis(),
                 "This is emailText" + System.currentTimeMillis()}
        };
    }
}
