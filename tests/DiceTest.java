import Model.Dice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    /**
     * Test roll method for Model.Dice class
     * @author Vicente Rivera
     */
    @Test
    public void testRoll() {
        Dice dice = new Dice();
        int result = dice.Roll();
        assertTrue(result >= 1 && result <= 6);
    }
}