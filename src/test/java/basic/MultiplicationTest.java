package basic;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import runner.CalculatorAssert;
import runner.TestRunner;

public class MultiplicationTest extends TestRunner {

    @Test(
            dataProvider = "multiplicationLongData",
            description = "Verify multiplication for long values"
    )
    @Epic("calculator.Calculator Operations")
    @Feature("Multiplication")
    @Story("Multiplication of long values")
    public void multiplicationLongTest(long a, long b, long expected){
        logger.info("Multiplication test for long started: {} / {} = {}", a, b, expected);

        long result = calculator.mult(a,b);

        logger.info("Actual result: {}", result );

        CalculatorAssert.assertMultiplication(result, expected);
    }

    @Test(
            dataProvider = "multiplicationDoubleData",
            description = "Verify multiplication for double values with precision"
    )
    @Epic("calculator.Calculator Operations")
    @Feature("Multiplication")
    @Story("Multiplication of double values")
    public void multiplicationDoubleTest(double a, double b, double expected) {
        logger.info("Multiplication test for double started: {} / {} = {}", a, b, expected);

        double result = calculator.mult(a,b);

        logger.info("Actual result: {}", result );

        CalculatorAssert.assertMultiplication(result, expected);
    }

    @DataProvider(name = "multiplicationLongData")
    public Object[][] multiplicationLongData(){
        return new Object[][]{
                {2, 3, 6},
                {-2, 3, -6},
                {-2, -3, 6},
                {0, 100, 0},
                {1, Long.MAX_VALUE, Long.MAX_VALUE}
        };
    }


    @DataProvider(name = "multiplicationDoubleData")
    public Object[][] multiplicationDoubleData(){
        return new Object[][]{
                {2.0, 3.0, 6.0},
                {-2.0, 3.0, -6.0},
                {-2.0, -3.0, 6.0},
                {0.0, 5.0, 0.0},
                {1.5, 2.0, 3.0},
                {2.5, 2.5, 6.25},
                {-1.5, 2.0, -3.0},
                {0.1, 0.2, 0.02}
        };
    }



}






































