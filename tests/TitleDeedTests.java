import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for the TitleDeed class
public class TitleDeedTests {

    /**
     * Test method for testing compiler.
     * @author Mael Tshiyonga
     */
    @Test
    public void testNothing() {

    }

    /**
     * Test method for testing the addHouse method in the TitleDeed class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testAddHouse() {
        TitleDeed titleDeed = new TitleDeed();
        titleDeed.addHouse();
        assertEquals(1, titleDeed.getHouseCount());
    }

    /**
     * Test method for testing the addHotel method in the TitleDeed class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testAddHotel() {
        TitleDeed titleDeed = new TitleDeed();
        titleDeed.addHouse();
        titleDeed.addHouse();
        titleDeed.addHouse();
        titleDeed.addHouse();
        titleDeed.addHotel();
        assertEquals(0, titleDeed.getHouseCount());
    }

    /**
     * Test method for testing the removeHouse method in the TitleDeed class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testRemoveHouse() {
        TitleDeed titleDeed = new TitleDeed();
        titleDeed.addHouse();
        titleDeed.addHouse();
        titleDeed.removeHouse();
        assertEquals(1, titleDeed.getHouseCount());
    }

    /**
     * Test method for testing the removeHotel method in the TitleDeed class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testRemoveHotel() {
        TitleDeed titleDeed = new TitleDeed();
        titleDeed.addHouse();
        titleDeed.addHouse();
        titleDeed.addHouse();
        titleDeed.addHouse();
        titleDeed.addHotel();
        titleDeed.removeHotel();
        assertEquals(4, titleDeed.getHouseCount());
    }
}
