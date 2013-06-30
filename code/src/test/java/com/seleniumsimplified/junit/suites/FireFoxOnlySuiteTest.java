package com.seleniumsimplified.junit.suites;


import com.seleniumsimplified.webdriver.basics.driver.FirstFirefoxTest;
import com.seleniumsimplified.webdriver.basics.driver.FundamentalWhatHappensIfTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        FirstFirefoxTest.class,
        FundamentalWhatHappensIfTest.class
})
public class FireFoxOnlySuiteTest {
}
