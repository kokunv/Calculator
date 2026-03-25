package advanced;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import runner.CalculatorAssert;
import runner.TestRunner;

public class CosineTest extends TestRunner {

    @Test(
            dataProvider = "cosineDoubleData",
            description = "Verify cosine function for key angles (0, π/2, π)"
    )
    @Epic("Advanced Operations")
    @Feature("Cosine")
    @Story("Calculates the cosine of an angle")
    public void cosineDoubleTest(double a,double expected) {
        logger.info("COS test started for value: {}", a);

        double actual = calculator.cos(a);

        logger.info("COS result: actual={}, expected={}", actual, expected);

        CalculatorAssert.assertCos(actual, expected);

        logger.info("COS test PASSED for value: {}", a);
    }

    @DataProvider(name = "cosineDoubleData")
    public Object[][] cosineDoubleData(){
        return new Object[][]{
                {0, 1.0},
                {Math.PI, -1.0},
                {Math.PI / 2, 0.0}
        };
    }
}


























