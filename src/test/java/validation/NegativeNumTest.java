package validation;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import runner.CalculatorAssert;
import runner.TestRunner;

public class NegativeNumTest extends TestRunner {

    @Test(
            dataProvider = "negativeNumData",
            description = "Verify that method correct determines negative number."
    )
    @Epic("Advanced Operations")
    @Feature("Validation")
    @Story("Check that number is negative")
    public void negativeNumTest(long a,boolean expected) {
        logger.info("Negative test started for value: {}", a);

        boolean actual = calculator.isNegative(a);

        logger.info("Result for {}: actual={}, expected={}", a, actual, expected);

        CalculatorAssert.assertValidationOfNumber(actual, expected);

        logger.info("Negative test PASSED for value: {}", a);
    }

    @DataProvider(name = "negativeNumData")
    public Object[][] negativeNumData(){
        return new Object[][]{
                {-5, true},
                {-1, true},
                {0, false},
                {5, false}
        };
    }
}



















