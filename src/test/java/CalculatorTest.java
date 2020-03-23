import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(10, 5);
    }

    @Test
    public void hasAddedFunction(){
        assertEquals(15, calculator.getAddedNumbers());
    }

    @Test
    public void hasSubtractFunction(){
        assertEquals(5, calculator.getSubtractedNumbers());
    }

    @Test
    public void
}
