package com.seleniumsimplified.junit.suites;

import com.seleniumsimplified.webdriver.basics.manipulate.ManipulateExercisesSubmitFileTest;
import com.seleniumsimplified.webdriver.basics.manipulate.alerts.AlertHandlingExampleTest;
import com.seleniumsimplified.webdriver.basics.manipulate.alerts.AlertHandlingExercisesTest;
import com.seleniumsimplified.webdriver.basics.manipulate.windows.WindowManageExerciseTest;
import com.seleniumsimplified.webdriver.basics.manipulate.windows.WindowsManageExampleTest;
import com.seleniumsimplified.webdriver.cookies.CookiesExercisesTest;
import com.seleniumsimplified.webdriver.javascript.JavaScriptExecutorTest;
import com.seleniumsimplified.webdriver.javascript.JavascriptAsyncExecutorTest;
import com.seleniumsimplified.webdriver.javascript.JavascriptExecuteAsyncExerciseTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Used to copy and paste to create a new suite!
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        AlertHandlingExampleTest.class,
        AlertHandlingExercisesTest.class,
        WindowManageExerciseTest.class,
        WindowsManageExampleTest.class,

        // Unsupported Operation Exception
        JavascriptAsyncExecutorTest.class,
        JavascriptExecuteAsyncExerciseTest.class,

        ManipulateExercisesSubmitFileTest.class,
        CookiesExercisesTest.class,

        // Intermittent tests on Opera
        JavaScriptExecutorTest.class
})
public class FailOnOperaSuiteTest {
}
