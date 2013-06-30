package com.seleniumsimplified.junit.suites;

import com.seleniumsimplified.junit.JUnitBeforeAndAfterTest;
import com.seleniumsimplified.junit.JUnitExampleTest;
import com.seleniumsimplified.junit.JUnitExercisesTest;
import com.seleniumsimplified.webdriver.basics.driver.FirstTest;
import com.seleniumsimplified.webdriver.basics.interrogate.DriverInterrogateRefactoredTest;
import com.seleniumsimplified.webdriver.basics.interrogate.DriverInterrogateTest;
import com.seleniumsimplified.webdriver.basics.interrogate.GetTitleReplacementExerciseTest;
import com.seleniumsimplified.webdriver.basics.interrogate.WebElementInterrogationTest;
import com.seleniumsimplified.webdriver.basics.interrogate.findby.*;
import com.seleniumsimplified.webdriver.basics.manipulate.*;
import com.seleniumsimplified.webdriver.basics.manipulate.alerts.AlertHandlingExampleTest;
import com.seleniumsimplified.webdriver.basics.manipulate.alerts.AlertHandlingExercisesTest;
import com.seleniumsimplified.webdriver.basics.manipulate.frames.*;
import com.seleniumsimplified.webdriver.basics.manipulate.selectSupport.SelectSupportTest;
import com.seleniumsimplified.webdriver.basics.manipulate.windows.WindowManageExerciseTest;
import com.seleniumsimplified.webdriver.basics.manipulate.windows.WindowsManageExampleTest;
import com.seleniumsimplified.webdriver.basics.navigation.NavigationBasicsTest;
import com.seleniumsimplified.webdriver.basics.navigation.NavigationExampleTest;
import com.seleniumsimplified.webdriver.cookies.CookiesExampleTest;
import com.seleniumsimplified.webdriver.cookies.CookiesExercisesTestWorkOnOpera;
import com.seleniumsimplified.webdriver.datadriven.BasicDataDrivenTest;
import com.seleniumsimplified.webdriver.datadriven.CsvDataDrivenTest;
import com.seleniumsimplified.webdriver.javascript.JavaScriptExecutorTest;
import com.seleniumsimplified.webdriver.javascript.JavascriptAsyncExecutorTest;
import com.seleniumsimplified.webdriver.javascript.JavascriptExecuteAsyncExerciseTest;
import com.seleniumsimplified.webdriver.javascript.JavascriptExecutorExampleTest;

import com.seleniumsimplified.webdriver.synchronisation.conditions.*;
import com.seleniumsimplified.webdriver.synchronisation.fluentWait.FluentWaitExampleTest;
import com.seleniumsimplified.webdriver.synchronisation.fluentWait.FluentWaitExercisesTest;
import com.seleniumsimplified.webdriver.synchronisation.fluentWait.FluentWaitForWebElementExampleTest;
import com.seleniumsimplified.webdriver.synchronisation.fluently.UseWebDriverWaitFluentlyTest;
import com.seleniumsimplified.webdriver.synchronisation.implicitWait.ImplicitWaitTest;
import com.seleniumsimplified.webdriver.synchronisation.refactored.MakeYourWaitsReadableTest;
import com.seleniumsimplified.webdriver.synchronisation.webDriverWaitBasics.*;
import com.seleniumsimplified.webdriver.userinteractions.UserInteractionsExercisesTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Tests which should run, and pass, across any of the non-headless browsers without amendment
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(value = {
        JUnitBeforeAndAfterTest.class,
        JUnitExampleTest.class,
        JUnitExercisesTest.class,
        // Basics Driver
        FirstTest.class,

        // Interrogate FindBy
        AFirstFindByExampleTest.class,
        ChainingFindByExampleTest.class,
        FindByCSSSelectorBasicExercisesFullAnswersTest.class,
        FindByCSSSelectorBasicExercisesTest.class,
        FindByCssSelectorExampleTest.class,
        FindByCSSSelectorPathsExampleTest.class,
        FindByIDOrNameExampleTest.class,
        FindByXpathExampleTest.class,
        FindByXPathSelectorBasicExercisesFullAnswersTest.class,
        FindElementsExampleTest.class,
        FindElementsExercisesTest.class,
        FirstFindByExercisesTest.class,

        // Interrogate
        DriverInterrogateRefactoredTest.class,
        DriverInterrogateTest.class,
        GetTitleReplacementExerciseTest.class,
        WebElementInterrogationTest.class,

        // Manipulate Alerts
        // Alerts fail in Opera
        //AlertHandlingExampleTest.class,
        //AlertHandlingExercisesTest.class,

        // Manipulate Frames
        FrameFaqTest.class,

        // the following tests removed from all browser because they fail in Googlechrome
        //FramesExampleTest.class,
        //FramesExercisesRefactoredDeleteTest.class,
        //FramesExercisesRefactoredTest.class,
        //FramesExercisesTest.class,

        // Manipulate select Support
        SelectSupportTest.class,

        // Manipulate Windows
        // removed next two because they fail in Opera
        // WindowManageExerciseTest.class,
        // WindowsManageExampleTest.class,
        // removed next 2 because they fail in chrome
        // WindowsExampleTest.class,
        // WindowsExercisesTest.class,



        // Manipulate
        ManipulateExampleSelectDropDownFiveTest.class,
        ManipulateExampleTest.class,
        ManipulateExercisesCheckboxTest.class,
        ManipulateExercisesCommentsTest.class,
        ManipulateExercisesSelectRadio2Test.class,
        // Submit file does not work in Opera
        // ManipulateExercisesSubmitFileTest.class,
        ManipulateExercisesSubmitFormTest.class,
        ManipulatetExampleMultiSelectTest.class,
        ManipulateWhatHappensIfTest.class,
        ManipulationFirstTryExampleTest.class,
        SendKeysExamplesTest.class,

        // Navigation
        NavigationBasicsTest.class,
        NavigationExampleTest.class,

        // cookies
        CookiesExampleTest.class,
        CookiesExercisesTestWorkOnOpera.class,

        // Javascript
        // Opera does not support Async Java Executor
        // JavascriptAsyncExecutorTest.class,
        // JavascriptExecuteAsyncExerciseTest.class,
        JavascriptExecutorExampleTest.class,

        // Intermittent on Opera
        // JavaScriptExecutorTest.class,

        // Page Objects
        com.seleniumsimplified.webdriver.pageobjects.loadablecomponent.BasicTestsRefactored.class,
        com.seleniumsimplified.webdriver.pageobjects.refactorExampleOne.BasicTestsRefactored.class,
        com.seleniumsimplified.webdriver.pageobjects.refactorExampleOneExercise.BasicTestsRefactored.class,
        com.seleniumsimplified.webdriver.pageobjects.slowloadablecomponent.BasicTestsRefactored.class,
        com.seleniumsimplified.webdriver.pageobjects.usingpagefactory.BasicTestsRefactored.class,
        com.seleniumsimplified.webdriver.pageobjects.WithoutPageObjectsTest.class,

        //Synchronisation
        CustomExpectedConditionsExampleTest.class,
        InlineExpectedConditionExampleTest.class,
        WaitingExercisesTest.class,
        WaitingExercisesUsingPredicateTest.class,
        WebDriverWaitFunctionAndExpectedConditionsExampleTest.class,
        UseWebDriverWaitFluentlyTest.class,
        FluentWaitExampleTest.class,
        FluentWaitExercisesTest.class,
        FluentWaitForWebElementExampleTest.class,
        ImplicitWaitTest.class,
        MakeYourWaitsReadableTest.class,
        MyFailingWebDriverWaitTest.class,
        SynchronisationWithWebDriverWaitTest.class,
        WebDriverWaitExampleTest.class,
        WebDriverWaitExampleTestRefactored.class,
        WebDriverWaitFaqTest.class,
        // fail on IE
        //UserInteractionsExercisesTest.class

        // add data driven tests
        BasicDataDrivenTest.class,
        CsvDataDrivenTest.class

})
public class AllBrowserSuiteTest {
}
