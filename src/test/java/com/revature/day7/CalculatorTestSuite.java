package com.revature.day7;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {CalculatorAddTestWithParams.class,
        CalculatorSubtractTestWithParams.class,
        CalculatorTest.class}
)
public class CalculatorTestSuite {
}
