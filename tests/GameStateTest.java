import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

    public class GameStateTest {
        private GameState gameState;
        private Player player1;
        private Player player2;

        @BeforeEach
        public void setUp() {
            player1 = new Player("Player1", TokenType.CAR);
            player2 = new Player("Player2", TokenType.HAT);
            gameState = new GameState();
            gameState.GameStart(Arrays.asList(player1, player2));
        }

        @Test
        public void testGameStart() {
            assertNotNull(gameState);
        }

    }
