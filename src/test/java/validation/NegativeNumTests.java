package validation;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import runner.TestRunner;

public class NegativeNumTests extends TestRunner {

    @Test(dataProvider = "negativeNumData")
    public void negativeNumTest(long a,boolean expected) {
        Assert.assertEquals(calculator.isNegative(a), expected,
                "Incorrect value of negative excepted: " + expected);
    }

    @DataProvider(name = "negativeNumData")
    public Object[][] negativeNumData(){
        return new Object[][]{
                {-5, true},
                {-1, true},
                {0, false},
                {5, false}
        };
    }
}



















