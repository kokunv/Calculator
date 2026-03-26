package advanced;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import runner.CalculatorAssert;
import runner.TestRunner;

public class TangentTest extends TestRunner {

    @Test(
            dataProvider = "tangentDoubleData",
            description = "Verify tangent function for common angles using radians"
    )
    @Epic("Advanced Operations")
    @Feature("Tangent")
    @Story("Calculate the tangent of an angle")
    public void tangentDoubleTest(double a, double expected) {

        logger.info("Tangent test started for value: {}", a);

        double actual = calculator.tg(a);

        logger.info("Tangent result: actual={}, expected={}", actual, expected);

        CalculatorAssert.assertTangent(actual, expected);

        logger.info("Tangent test PASSED for value: {}", a);
    }

    @DataProvider(name = "tangentDoubleData")
    public Object[][] tangentDoubleData() {
        return new Object[][]{
                {0, 0.0},
                {Math.PI / 4, 1.0}
        };
    }
}













