import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowTests extends TestRunner {

    @Test(dataProvider = "powDoubleData")
    public void powDoubleTest(double a, double b, double expected) {
        Assert.assertEquals(calculator.pow(a,b), expected, 0.0001,
                "Incorrect value of pow excepted: " + expected);
    }

    @DataProvider(name = "powDoubleData")
    public Object[][] powDoubleData(){
        return new Object[][]{
                {2, 3, 8.0},
                {5, 0, 1.0},
                {2, -1, 0.5},
                {-2, 3, -8.0},
                {9, 0.5, 3.0}
        };
    }
}





































