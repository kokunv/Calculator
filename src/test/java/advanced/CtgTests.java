package advanced;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import runner.TestRunner;

public class CtgTests extends TestRunner {

    @Test(dataProvider = "ctgDoubleData")
    public void ctgDoubleTest(double a,double expected) {
        Assert.assertEquals(calculator.ctg(a), expected, 0.0001,
                "Incorrect value of ctg excepted: " + expected);
    }

    @DataProvider(name = "ctgDoubleData")
    public Object[][] ctgDoubleData(){
        return new Object[][]{
                {Math.PI / 4, 1.0},
                {Math.PI / 2, 0.0}
        };
    }
}
































