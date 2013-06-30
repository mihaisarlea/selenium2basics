package com.seleniumsimplified.junit.suites;

import com.seleniumsimplified.webdriver.drivermanager.DriverManagerTest;
import com.seleniumsimplified.webdriver.drivers.*;
import com.seleniumsimplified.webdriver.screenshots.CanWeTakeScreenshotsTest;
import com.seleniumsimplified.webdriver.screenshots.PersistScreenshotsTest;
import com.seleniumsimplified.webdriver.seleniumapi.WebDriverBackedSeleniumTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * This is for tests that are browser specific and control their browser setup to run
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        DriverManagerTest.class,
        ChromeDriverTest.class,
        FirefoxDriverTest.class,
        HtmlUnitDriverTest.class,
        IEDriverTest.class,
        OperaDriverTest.class,
        CanWeTakeScreenshotsTest.class,
        PersistScreenshotsTest.class,
        WebDriverBackedSeleniumTest.class,
})
public class DriverSanityCoursePackSuiteTest {

}
