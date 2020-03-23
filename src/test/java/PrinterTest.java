import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(40, 60);
    }

    @Test
    public void hasPrintedPaper(){
        printer.print(30);
        assertEquals(10, printer.getPaper());
    }

    @Test
    public void hasUsedInk(){
        printer.print(40);
        assertEquals(20, printer.getInk());
    }



}
