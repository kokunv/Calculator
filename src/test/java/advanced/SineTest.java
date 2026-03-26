package advanced;


import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import runner.CalculatorAssert;
import runner.TestRunner;

public class SineTest extends TestRunner {

    @Test(
            dataProvider = "sineDoubleData",
            description = "Verify sine function for key angles (0, π/2, π)"
    )
    @Epic("Advanced Operations")
    @Feature("Sine")
    @Story("Calculates the sine of an angle")
    public void sineDoubleTest(double a, double expected) {
        logger.info("Sine test started for value: {}", a);

        double actual = calculator.sin(a);

        logger.info("Sine result: actual={}, expected={}", actual, expected);

        CalculatorAssert.assertSine(actual, expected);

        logger.info("Sine test PASSED for value: {}", a);
    }

    @DataProvider(name = "sineDoubleData")
    public Object[][] sineDoubleData(){
        return new Object[][]{
                {0, 0.0},
                {Math.PI / 2, 1.0},
                {Math.PI, 0.0}
        };
    }
}


















