package advanced;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import runner.CalculatorAssert;
import runner.TestRunner;

public class CotangentTest extends TestRunner {

    @Test(
            dataProvider = "cotangentDoubleData",
            description = "Verify cotangent function for common angles"
    )
    @Epic("Advanced Operations")
    @Feature("Cotangent")
    @Story("Calculating the trigonometric cotangent.")
    public void cotangentDoubleTest(double a,double expected) {
        logger.info("CTG test started for value: {}", a);

        double actual = calculator.ctg(a);

        logger.info("CTG result: actual={}, expected={}", actual, expected);

        CalculatorAssert.assertCtg(actual, expected);

        logger.info("CTG test PASSED for value: {}", a);
    }

    @DataProvider(name = "cotangentDoubleData")
    public Object[][] cotangentDoubleData(){
        return new Object[][]{
                {Math.PI / 4, 1.0},
                {Math.PI / 2, 0.0}
        };
    }
}
































