package advanced;


import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import runner.CalculatorAssert;
import runner.TestRunner;

public class SquareTest extends TestRunner {

    @Test(
            dataProvider = "squareDoubleData",
            description = "Verify square root calculation."
    )
    @Epic("Advanced Operations")
    @Feature("Square")
    @Story("Calculates the square root of a number")
    public void squareDoubleTest(double a,double expected) {
        logger.info("SQRT test started for value: {}", a);

        double actual = calculator.sqrt(a);

        logger.info("SQRT result: actual={}, expected={}", actual, expected);

        CalculatorAssert.assertSqrt(actual, expected);

        logger.info("SQRT test PASSED for value: {}", a);
    }

    @DataProvider(name = "squareDoubleData")
    public Object[][] squareDoubleData(){
        return new Object[][]{
                {4, 2.0},
                {9, 3.0},
                {0, 0.0},
                {1, 1.0}
        };
    }
}






















