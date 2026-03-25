package basic;


import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import runner.CalculatorAssert;
import runner.TestRunner;


public class AdditionTest extends TestRunner {


    @Test(
            dataProvider = "additionLongData",
            description = "Verify addition of two long values"
    )
    @Epic("Calculator Operations")
    @Feature("Addition")
    @Story("Addition of long values")
    public void additionLongTest(long a, long b, long expected) {
        logger.info("Sum test for long started: {} / {} = {}", a, b, expected);

        long result = calculator.sum(a,b);

        logger.info("Actual result: {}", result );

        CalculatorAssert.assertSum(result,expected);
    }

    @Test(
            dataProvider = "additionDoubleData",
            description = "Verify addition of two double values with precision"
    )
    @Epic("Calculator Operations")
    @Feature("Addition")
    @Story("Addition of long values")
    public void additionDoubleTest(double a, double b, double expected) {
        CalculatorAssert.assertSum(calculator.sum(a,b),expected);
    }

    @DataProvider(name = "additionDoubleData")
    public Object[][] additionDoubleData(){
        return new Object[][]{
                {3.50, 3.50, 7.0},
                {-3.50, -3.50, -7.0},
                {0.0, 7.0, 7.0},
                {-2.0, 4.0, 2.0},
                {0.0037, 0.0027, 0.0064},
                {0.4, 0.037, 0.437},
                {0,0,0}
        };
    }


    @DataProvider(name = "additionLongData")
    public Object [][] additionLongData() {
            return new Object[][] {
                    {1, 9, 10},
                    {323, 77, 400},
                    {3, 0, 3},
                    {0, 0, 0},
                    {-9, 10, 1},
                    {-5, -3, -8},
                    {15634, 37546,53180},
                    {Long.MAX_VALUE, 0, Long.MAX_VALUE}
            };
    }
}




































