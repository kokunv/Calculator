package runner;

import com.epam.tat.module4.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeMethod;

public class TestRunner {

    protected Calculator calculator;
    protected static final Logger logger = LogManager.getLogger(TestRunner.class);

    @BeforeMethod
    public void setUp(){
        calculator = new Calculator();
    }
}


























