
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SumTests extends TestRunner{


    @Test(dataProvider = "sumLongData" ,groups = "smoke")
    public void sumLongTest(long a, long b, long expected) {
        Assert.assertEquals(calculator.sum(a,b), expected,
                "Incorrect value of sum excepted: " + expected);
    }

    @Test(dataProvider = "sumDoubleData",groups = "smoke")
    public void sumDoubleTest(double a, double b, double expected) {
        Assert.assertEquals(calculator.sum(a, b), expected, 0.0001,
                "Incorrect value of sum excepted: " + expected);
    }

    @DataProvider(name = "sumDoubleData")
    public Object[][] sumDoubleData(){
        return new Object[][]{
                {3.50, 3.50, 7.0},
                {-3.50, -3.50, -7.0},
                {0.0, 7.0, 7.0},
                {-2.0, 4.0, 2.0},
                {0.0037, 0.0027, 0.0064},
                {0.4, 0.037, 0.437}
        };
    }


    @DataProvider(name = "sumLongData")
    public Object [][] sumLongData() {
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




































