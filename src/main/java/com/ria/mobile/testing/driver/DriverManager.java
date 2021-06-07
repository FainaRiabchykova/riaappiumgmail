package com.ria.mobile.testing.driver;

import com.ria.mobile.testing.configuration.AppiumConfigurator;
import com.ria.mobile.testing.configuration.CapabilitiesConfigurator;
import com.ria.mobile.testing.configuration.ConfigurationReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import static java.lang.String.format;

public class DriverManager {
    private static final Logger LOG = LogManager.getRootLogger();
    private static AppiumDriver<MobileElement> driver;

    private DriverManager(){
    }

    public static AppiumDriver<MobileElement> getDriver(){
        if (driver == null){
            driver = createDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        return driver;
    }
    public static AppiumDriver<MobileElement> createDriver(){
        driver = new AppiumDriver<MobileElement>
        (AppiumConfigurator.getAppiumDriverLocalService(ConfigurationReader.get().appiumPort()),
        CapabilitiesConfigurator.getLocalCapabilities());
        LOG.info("Driver is created");
        return driver;
    }

    public static void closeDriver(){
        Optional.ofNullable(getDriver()).ifPresent(driverInstance -> {
            driverInstance.quit();
            driver = null;
            LOG.info("Driver is closed");
        });
    }

    public static void closeAppium() {
        AppiumConfigurator.stopService();
    }

    public static void closeEmulator(){
        try {
            Runtime.getRuntime().exec(format("adb -s %s emu kill",ConfigurationReader.get().udid()));
            LOG.info("AVD is closed");
        } catch (IOException e) {
            LOG.info("AVD was NOT closed, message: {}", e.getMessage());
        }
    }
}