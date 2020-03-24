import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void hasAddedFunction(){
        assertEquals(15, calculator.getAddedNumbers(10, 5));
    }

    @Test
    public void hasSubtractFunction(){
        assertEquals(5, calculator.getSubtractedNumbers(10, 5));
    }

    @Test
    public void hasMultiplyFunction(){
        assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    public void hasDivideFuunction(){
        assertEquals(20, calculator.divide(100, 5), 0.001);
    }
}
