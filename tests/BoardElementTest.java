/**
 * Test class for BoardElement.
 * @author Connor Moyer
 */
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

// Subclass of BoardElement for testing purposes
class TestSpace extends BoardElement {
    public TestSpace(String name, SpaceType type) {
        super(name, type);
    }
    @Override
    public void triggerAction(Player player) {
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