import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubTests extends TestRunner {


    @Test(dataProvider = "subLongData")
    public void subLongTest(long a, long b, long expected) {
        Assert.assertEquals(calculator.sub(a,b), expected,
                "Incorrect value of sub excepted: " + expected);
    }

    @Test(dataProvider = "subDoubleData")
    public void subDoubleTest(double a, double b, double expected) {
        Assert.assertEquals(calculator.sub(a,b), expected, 0.0001,
                "Incorrect value of sub excepted: " + expected);
    }

    @DataProvider(name = "subDoubleData")
    public Object[][] subDoubleData(){
        return new Object[][]{
                {3.50, 3.50, 0.0},
                {-3.0, -1.50, -1.50},
                {7.0, 0.0, 7.0},
                {-2.0, 4.0, -6.0},
                {0.0037, 0.0027, 0.0010},
                {0.4, 0.037, 0.363}
        };
    }

    @DataProvider(name = "subLongData")
    public Object[][] subLongData(){
        return new Object[][]{
                {0, 0, 0},
                {7, 3, 4},
                {-36, -4, -32},
                {-10, 8, -18},
                {45278612, 891235, 44387377}
        };
    }


}















































