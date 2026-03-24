package advanced;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import runner.TestRunner;

public class TgTests extends TestRunner {

        @Test(dataProvider = "tgDoubleData")
        public void tgDoubleTest(double a,double expected) {
            Assert.assertEquals(calculator.tg(a), expected, 0.0001,
                    "Incorrect value of tg excepted: " + expected);
        }

        @DataProvider(name = "tgDoubleData")
        public Object[][] tgDoubleData(){
            return new Object[][]{
                    {0, 0.0},
                    {Math.PI / 4, 1.0}
            };
        }
    }













