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
        assertTrue(player.getPosition() > 1);

        player.setPosition(5);
        player.takeTurn(board);
        assertTrue(player.getPosition() > 5);
    }

    /**
     * Test method for testing the diceRoll method in the Player class.
     * This method tests if the dice roll is between 1 and 12 and if the second value is 0 or 1.
     * The second value is used to determine if the player rolled doubles or not.
     * @author Mael Tshiyonga
     */
    @Test
    public void testDiceRoll() {
        Player player = new Player("Mael", TokenType.CAR);
        int[] rollResults = player.diceRoll();
        assertTrue(rollResults[0] > 0);
        assertTrue(rollResults[0] < 13);
        assertTrue(rollResults[1] == 0 || rollResults[1] == 1);
    }


}
