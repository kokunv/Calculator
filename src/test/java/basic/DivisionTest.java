package basic;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import runner.CalculatorAssert;
import runner.TestRunner;

public class DivisionTest extends TestRunner {

    @Test(
            dataProvider = "divisionLongData",
            description = "Verify division for long values"
    )
    @Epic("Calculator Operations")
    @Feature("Division")
    @Story("Division of long values")
    public void divLongTest(long a, long b, long expected){
        logger.info("Div test for long started: {} / {} = {}", a, b, expected);

        long result = calculator.div(a,b);

        logger.info("Actual result: {}", result );

        CalculatorAssert.assertDiv(result, expected);
    }

    @Test(
            dataProvider = "divisionDoubleData",
            description = "Verify division for double values with precision"
    )
    @Epic("Calculator Operations")
    @Feature("Division")
    @Story("Division of double values")
    public void divDoubleTest(double a, double b, double expected) {
        logger.info("Div test for double started: {} / {} = {}", a, b, expected);

        double result = calculator.div(a,b);

        logger.info("Actual result: {}", result );

        CalculatorAssert.assertDiv(result, expected);
    }

    @Test(description = "Verify division by zero throws NumberFormatException")
    @Epic("Calculator Operations")
    @Feature("Division")
    @Story("Division of long to null")
    public void divisionLongOnNull(){
        logger.info("Checking division by zero");

       NumberFormatException ex = Assert.expectThrows(NumberFormatException.class, () ->
                                   calculator.div(2, 0));

        logger.error("Exception message: {}", ex.getMessage());

       Assert.assertEquals(ex.getMessage(), "Attempt to divide by zero",
               "Message is not the same.");
    }

    @DataProvider(name = "divisionLongData")
    public Object[][] divisionLongData(){
        return new Object[][]{
                {10, 2, 5},
                {9, 3, 3},
                {-10, 2, -5},
                {10, -2, -5},
                {0, 5, 0}
        };
    }


    @DataProvider(name = "divisionDoubleData")
    public Object[][] divisionDoubleData(){
        return new Object[][]{
                {10.0, 2.0, 5.0},
                {-10.0, 2.0, -5.0},
                {10.0, -2.0, -5.0},
                {5.0, 2.0, 2.5}
        };
    }
}
























