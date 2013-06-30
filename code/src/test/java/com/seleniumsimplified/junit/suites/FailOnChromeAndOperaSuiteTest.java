package com.seleniumsimplified.junit.suites;

import com.seleniumsimplified.webdriver.basics.manipulate.frames.FramesExampleTest;
import com.seleniumsimplified.webdriver.basics.manipulate.frames.FramesExercisesRefactoredDeleteTest;
import com.seleniumsimplified.webdriver.basics.manipulate.frames.FramesExercisesRefactoredTest;
import com.seleniumsimplified.webdriver.basics.manipulate.frames.FramesExercisesTest;
import com.seleniumsimplified.webdriver.basics.manipulate.windows.WindowsExampleTest;
import com.seleniumsimplified.webdriver.basics.manipulate.windows.WindowsExercisesTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * For tests which fail on Chrome and Opera only
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({

        // chrome seems to hate the frameset examples
        FramesExampleTest.class,
        FramesExercisesRefactoredDeleteTest.class,
        FramesExercisesRefactoredTest.class,
        FramesExercisesTest.class,

        // a frame again
        WindowsExampleTest.class,
})
public class FailOnChromeAndOperaSuiteTest {
}
