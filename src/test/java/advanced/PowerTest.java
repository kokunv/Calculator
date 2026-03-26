package advanced;


import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import runner.CalculatorAssert;
import runner.TestRunner;

public class PowerTest extends TestRunner {

    @Test(
            dataProvider = "powerDoubleData",
            description = "Verify power function with positive, negative and fractional exponents"
    )
    @Epic("Advanced Operations")
    @Feature("Power")
    @Story("Calculates the power of a number")
    public void powerDoubleTest(double a, double b, double expected) {
        logger.info("Power test started for values: {} ^ {}", a, b);

        double actual = calculator.pow(a, b);

        logger.info("Power result: actual={}, expected={}", actual, expected);

        CalculatorAssert.assertPower(actual, expected);

        logger.info("Power test PASSED for values: {} ^ {}", a, b);
    }

    @DataProvider(name = "powerDoubleData")
    public Object[][] powerDoubleData(){
        return new Object[][]{
                {2, 3, 8.0},
                {5, 0, 1.0},
                {2, -1, 0.5},
                {-2, 3, -8.0},
                {9, 0.5, 3.0}
        };
    }
}





































