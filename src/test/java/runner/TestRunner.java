package runner;


import service.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeMethod;

public class TestRunner {

    protected Calculator calculator;
    protected static final Logger logger = LogManager.getLogger(TestRunner.class);

    @BeforeMethod
    public void setUp(){
        logger.info("Before method started.");

        calculator = new Calculator();
    }
}


























