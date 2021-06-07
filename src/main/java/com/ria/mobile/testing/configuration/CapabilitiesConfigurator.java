package com.ria.mobile.testing.configuration;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.*;
import static io.appium.java_client.remote.MobileCapabilityType.*;
import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

public class CapabilitiesConfigurator {
    private CapabilitiesConfigurator() {
    }
    public static DesiredCapabilities getLocalCapabilities(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(PLATFORM_NAME, ConfigurationReader.get().platformName());
        capabilities.setCapability(PLATFORM_VERSION, ConfigurationReader.get().platformVersion());
        capabilities.setCapability(UDID,ConfigurationReader.get().udid());
        capabilities.setCapability(AVD,ConfigurationReader.get().localDeviceName());
        capabilities.setCapability(APP_PACKAGE,ConfigurationReader.get().appPackage());
        capabilities.setCapability(APP_ACTIVITY,ConfigurationReader.get().appActivity());
        return capabilities;
    }
}
