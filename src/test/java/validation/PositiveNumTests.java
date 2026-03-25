package validation;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import runner.CalculatorAssert;
import runner.TestRunner;

public class PositiveNumTests extends TestRunner {

    @Test(
            dataProvider = "positiveNumData",
            description = "Verify that method correct determines positive number."
    )
    @Epic("Advanced Operations")
    @Feature("Validation")
    @Story("Check that number is positive")
    public void positiveNumTest(long a,boolean expected) {
        logger.info("Positive test started for value: {}", a);

        boolean actual = calculator.isPositive(a);

        logger.info("Result for {}: actual={}, expected={}", a, actual, expected);

        CalculatorAssert.assertValidationOfNumber(actual, expected);

        logger.info("Positive test PASSED for value: {}", a);
    }

    @DataProvider(name = "positiveNumData")
    public Object[][] positiveNumData(){
        return new Object[][]{
                {5, true},
                {1, true},
                {0, false},
                {-5, false}
        };
    }
}




























