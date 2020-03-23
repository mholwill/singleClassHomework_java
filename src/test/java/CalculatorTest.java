import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(3);
    }

    @Test
    public void hasNumber(){
        assertEquals(3, calculator.getNumber());
    }
}
