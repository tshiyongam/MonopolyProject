// Tests for the Utilities class
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class UtilitiesTests {

    /**
     * Test method for testing the Utilities constructor.
     * @author Mael Tshiyonga
     */
    @Test
    public void testUtilities() {
        Utilities utilities = new Utilities("Electric Company", 150);
        assertEquals("Electric Company", utilities.getName());
        assertEquals(150, utilities.getPrice());
        assertNull(utilities.getOwner());
    }

    /**
     * Test method for testing the setOwner method in the Utilities class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testSetOwner() {
        Utilities utilities = new Utilities("Electric Company", 150);
        Player player = new Player("Mael", TokenType.CAR);
        utilities.setOwner(player);
        assertEquals(player, utilities.getOwner());

        Utilities utilities2 = new Utilities("Water Works", 150);
        Player player2 = new Player("Vicente", TokenType.WHEELBARROW);
        utilities2.setOwner(player2);
        assertEquals(player2, utilities2.getOwner());
        assertNotEquals(player, utilities2.getOwner());
    }
}
