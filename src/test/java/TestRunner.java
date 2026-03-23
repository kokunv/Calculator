import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeMethod;

public class TestRunner {

    Calculator calculator;

    @BeforeMethod
    public void setUp(){
        calculator = new Calculator();
    }
}


























