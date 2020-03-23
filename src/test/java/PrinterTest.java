import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(200, 400);
    }

    @Test
    public void hasPaper(){
        assertEquals(200, printer.getPaper());
    }

    @Test
    public void hasPrintedPaper(){
        printer.print(30, 5);
        assertEquals(50, printer.getPaper());
    }

    @Test
    public void hasInk(){
        assertEquals(400, printer.getInk());
    }

    @Test
    public void hasUsedInk(){
        printer.print(30, 5);
        assertEquals(250, printer.getInk());
    }



}
