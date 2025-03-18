/**
 * Test class for Model.BoardElement.
 * @author Connor Moyer
 */
import Model.BoardElement;
import Model.SpaceType;
import Model.Token;
import Model.TokenType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;


// Subclass of Model.BoardElement for testing purposes
class TestSpace {
    public TestSpace(String name, SpaceType type) {
        super(name, type);
    }
}

public class BoardElementTest {
    private BoardElement space;
    private Token token1;
    private Token token2;

    @Before
    public void setUp() {
        space = new TestSpace("Test Space", SpaceType.PROPERTY);
        token1 = new Token(TokenType.BOOT);
        token2 = new Token(TokenType.CAR);
    }

    @Test
    public void testGetName() {
        assertEquals("Test Space", space.getName());
    }

    @Test
    public void testGetType() {
        assertEquals(SpaceType.PROPERTY, space.getType());
    }

    @Test
    public void testAddToken() {
        space.addToken(token1);
        List<Token> tokens = space.getTokens();
        assertTrue(tokens.contains(token1));
        assertEquals(1, tokens.size());
    }

    @Test
    public void testRemoveToken() {
        space.addToken(token1);
        space.addToken(token2);
        space.removeToken(token1);
        List<Token> tokens = space.getTokens();
        assertFalse(tokens.contains(token1));
        assertTrue(tokens.contains(token2));
        assertEquals(1, tokens.size());
    }

    @Test
    public void testGetTokens() {
        space.addToken(token1);
        space.addToken(token2);
        List<Token> tokens = space.getTokens();
        assertEquals(2, tokens.size());
        assertTrue(tokens.contains(token1));
        assertTrue(tokens.contains(token2));
    }
}