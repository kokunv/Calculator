import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivTests extends TestRunner {

    @Test(dataProvider = "divLongData")
    public void divLongTest(long a, long b, long expected){
        Assert.assertEquals(calculator.div(a,b), expected,
                "Incorrect value of div excepted: " + expected);
    }

    @Test(dataProvider = "divDoubleData")
    public void divDoubleTest(double a, double b, double expected) {
        Assert.assertEquals(calculator.div(a,b), expected, 0.0001,
                "Incorrect value of div excepted: " + expected);
    }

    @Test
    public void divLongOnNull(){
       NumberFormatException ex = Assert.expectThrows(NumberFormatException.class, () ->
                                   calculator.div(2, 0));
       Assert.assertEquals(ex.getMessage(), "Attempt to divide by zero",
               "Message is not the same.");
    }

    @DataProvider(name = "divLongData")
    public Object[][] divLongData(){
        return new Object[][]{
                {10, 2, 5},
                {9, 3, 3},
                {-10, 2, -5},
                {10, -2, -5},
                {0, 5, 0}
        };
    }


    @DataProvider(name = "divDoubleData")
    public Object[][] divDoubleData(){
        return new Object[][]{
                {10.0, 2.0, 5.0},
                {-10.0, 2.0, -5.0},
                {10.0, -2.0, -5.0},
                {5.0, 2.0, 2.5}
        };
    }
}
























