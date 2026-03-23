import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtTests extends TestRunner {

    @Test(dataProvider = "sqrtDoubleData")
    public void sqrtDoubleTest(double a,double expected) {
        Assert.assertEquals(calculator.sqrt(a), expected, 0.0001,
                "Incorrect value of sqrt excepted: " + expected);
    }

    @DataProvider(name = "sqrtDoubleData")
    public Object[][] sqrtDoubleData(){
        return new Object[][]{
                {4, 2.0},
                {9, 3.0},
                {0, 0.0},
                {1, 1.0}
        };
    }
}






















