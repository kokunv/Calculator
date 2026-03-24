package basic;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import runner.TestRunner;

public class MultTests extends TestRunner {

    @Test(dataProvider = "multLongData")
    public void multLongTest(long a, long b, long expected){
        Assert.assertEquals(calculator.mult(a,b), expected,
                "Incorrect value of mult excepted: " + expected);
    }

    @Test(dataProvider = "multDoubleData")
    public void multDoubleTest(double a, double b, double expected) {
        Assert.assertEquals(calculator.mult(a,b), expected, 0.0001,
                "Incorrect value of mult excepted: " + expected);
    }

    @DataProvider(name = "multLongData")
    public Object[][] multLongData(){
        return new Object[][]{
                {2, 3, 6},
                {-2, 3, -6},
                {-2, -3, 6},
                {0, 100, 0},
                {1, Long.MAX_VALUE, Long.MAX_VALUE}
        };
    }


    @DataProvider(name = "multDoubleData")
    public Object[][] multDoubleData(){
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






































