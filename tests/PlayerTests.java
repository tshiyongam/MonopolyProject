import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
// Tests for the Player class
public class PlayerTests {
    /**
     * Test method for testing constructor.
     * @author Mael Tshiyonga
     */
    @Test
    public void testPlayer() {
        Player player = new Player("Mael", TokenType.CAR);
        assertEquals("Mael", player.getName());

        Player player2 = new Player("Vicente", TokenType.WHEELBARROW);
        assertEquals("Vicente", player2.getName());
        assertNotEquals("Mael", player2.getName());
    }

    /**
     * Test method for testing the getPosition and setPosition methods in the Player class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testGetPosition() {
        Player player = new Player("Mael", TokenType.CAR);
        player.setPosition(0);
        assertEquals(0, player.getPosition());

        player.setPosition(5);
        assertEquals(5, player.getPosition());
        assertNotEquals(0, player.getPosition());
    }

    /**
     * Test method for testing the isInJail method in the Player class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testIsInJail() {
        Player player = new Player("Mael", TokenType.CAR);
        assertFalse(player.isInJail());

        player.goToJail();
        assertTrue(player.isInJail());
        assertEquals(10, player.getPosition());
    }

    /**
     * Test method for testing the takeTurn method in the Player class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testTakeTurn() {
        Player player = new Player("Mael", TokenType.CAR);
        GameBoard board = new GameBoard();
        player.takeTurn(board);
        assertNotNull(player.getPosition());
    }
}
