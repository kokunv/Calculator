package basic;


import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import runner.CalculatorAssert;
import runner.TestRunner;

public class SubtractionTest extends TestRunner {


    @Test(
            dataProvider = "subtractionLongData",
            description = "Verify subtraction for long values using different combinations"
    )
    @Epic("Calculator Operations")
    @Feature("Subtraction")
    @Story("Subtraction of long values")
    public void subtractionLongTest(long a, long b, long expected) {
        logger.info("Sub test for long started: {} / {} = {}", a, b, expected);

        long result = calculator.sub(a,b);

        logger.info("Actual result: {}", result );

        CalculatorAssert.assertSub(result, expected);
    }

    @Test(
            dataProvider = "subtractionDoubleData",
            description = "Verify subtraction for double values with precision"
    )
    @Epic("Calculator Operations")
    @Feature("Subtraction")
    @Story("Subtraction of double values")
    public void subDoubleTest(double a, double b, double expected) {
        logger.info("Sub test for double started: {} / {} = {}", a, b, expected);

        double result = calculator.sub(a,b);

        logger.info("Actual result: {}", result );

        CalculatorAssert.assertSub(result, expected);
    }

    @DataProvider(name = "subtractionDoubleData")
    public Object[][] subtractionDoubleData(){
        return new Object[][]{
                {3.50, 3.50, 0.0},
                {-3.0, -1.50, -1.50},
                {7.0, 0.0, 7.0},
                {-2.0, 4.0, -6.0},
                {0.0037, 0.0027, 0.0010},
                {0.4, 0.037, 0.363}
        };
    }

    @DataProvider(name = "subtractionLongData")
    public Object[][] subtractionLongData(){
        return new Object[][]{
                {0, 0, 0},
                {7, 3, 4},
                {-36, -4, -32},
                {-10, 8, -18},
                {45278612, 891235, 44387377}
        };
    }


}















































