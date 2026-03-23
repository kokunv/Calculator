import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinTests extends TestRunner {

    @Test(dataProvider = "sinDoubleData")
    public void sinDoubleTest(double a,double expected) {
        Assert.assertEquals(calculator.sin(a), expected, 0.0001,
                "Incorrect value of sin excepted: " + expected);
    }

    @DataProvider(name = "sinDoubleData")
    public Object[][] sinDoubleData(){
        return new Object[][]{
                {0, 0.0},
                {Math.PI / 2, 1.0},
                {Math.PI, 0.0}
        };
    }
}


















