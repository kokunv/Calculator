import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosTests extends TestRunner {

    @Test(dataProvider = "cosDoubleData")
    public void cosDoubleTest(double a,double expected) {
        Assert.assertEquals(calculator.cos(a), expected, 0.0001,
                "Incorrect value of cos excepted: " + expected);
    }

    @DataProvider(name = "cosDoubleData")
    public Object[][] cosDoubleData(){
        return new Object[][]{
                {0, 1.0},
                {Math.PI, -1.0},
                {Math.PI / 2, 0.0}
        };
    }
}


























