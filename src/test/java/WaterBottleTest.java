import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

//    @Test
//    public void hasADrinkBeenTaken(){
//        assertEquals(90, waterBottle.takeDrink());
//    }

    @Test
    public void hasADrinkBeenTaken(){
        waterBottle.takeDrink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void hasMadeBottleEmpty(){
        waterBottle.makeEmpty();
        assertEquals(0, waterBottle.getVolume());
    }

//    @Test
//    public void hasMadeBottleFullAgain(){
//        WaterBottle waterBottle1 = new WaterBottle(60);
//        assertEquals(100, waterBottle1.fillBottle());
//    }

    @Test
    public void hasMadeBottleFullAgain(){
        waterBottle.makeEmpty();
        waterBottle.fillBottle();
        assertEquals(100, waterBottle.getVolume());
    }
}
