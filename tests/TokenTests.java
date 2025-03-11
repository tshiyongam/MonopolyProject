import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
// Tests for the Token class
public class TokenTests {
    /**
     * Test method for testing compiler.
     * @author Mael Tshiyonga
     */
    @Test
    public void testNothing() {

    }

    /**
     * Test method for testing the constructor of the Token class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testToken() {
        Token token = new Token(TokenType.CAR);
        assertEquals(TokenType.CAR, token.getType());

        Token token2 = new Token(TokenType.HAT);
        assertEquals(TokenType.HAT, token2.getType());
    }

    /**
     * Test method for testing the setPlayer method in the Token class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testSetPlayer() {
        Token token = new Token(TokenType.CAR);
        Player player = new Player("Mael", TokenType.CAR);
        token.setPlayer(player);
        assertEquals(player, token.getPlayer());

        Token token2 = new Token(TokenType.HAT);
        Player player2 = new Player("Connor", TokenType.HAT);
        token2.setPlayer(player2);
        assertEquals(player2, token2.getPlayer());

        Token token3 = new Token(TokenType.BATTLESHIP);
        Player player3 = new Player("Mael", TokenType.BATTLESHIP);
        token3.setPlayer(player3);
        assertFalse(player.equals(token3.getPlayer()));
    }

    /**
     * Test method for testing the getPlayer method in the Token class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testGetPlayer() {
        Token token = new Token(TokenType.CAR);
        Player player = new Player("Mael", TokenType.CAR);
        token.setPlayer(player);
        assertEquals(player, token.getPlayer());
    }

    /**
     * Test method for testing the getType method in the Token class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testGetType() {
        Token token = new Token(TokenType.CAR);
        assertEquals(TokenType.CAR, token.getType());

        Token token2 = new Token(TokenType.HAT);
        assertEquals(TokenType.HAT, token2.getType());

        Token token3 = new Token(TokenType.BATTLESHIP);
        assertEquals(TokenType.BATTLESHIP, token3.getType());

        Token token4 = new Token(TokenType.DOG);
        assertEquals(TokenType.DOG, token4.getType());
    }

}
