import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveNumTests extends TestRunner {

    @Test(dataProvider = "positiveNumData")
    public void positiveNumTest(long a,boolean expected) {
        Assert.assertEquals(calculator.isPositive(a), expected,
                "Incorrect value of positive excepted: " + expected);
    }

    @DataProvider(name = "positiveNumData")
    public Object[][] positiveNumData(){
        return new Object[][]{
                {5, true},
                {1, true},
                {0, false},
                {-5, false}
        };
    }
}




























