import Model.Card;
import Model.ChanceCard;
import Model.CommunityChestCard;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

// Tests for the Model.Card class
public class CardTests {

    /**
     * Test method for testing compiler.
     * @author Mael Tshiyonga
     */
    @Test
    public void testNothing() {

    }

    /**
     * Test method for testing the drawChanceCard method in the Model.ChanceCard class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testDrawChanceCard() {
        Card card = new ChanceCard();
        String drawnCard = card.drawCard();
        assertNotNull(drawnCard);
    }

    /**
     * Test method for testing the drawCommunityChestCard method in the Model.CommunityChestCard class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testDrawCommunityChestCard() {
        Card card = new CommunityChestCard();
        String drawnCard = card.drawCard();
        assertNotNull(drawnCard);
    }

    /**
     * Test method for testing the shuffledCard method in the Model.ChanceCard class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testShuffledCardChanceCard() {
        Card card = new ChanceCard();
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Orange");
        String shuffledCard = card.shuffledCard(new Random(), fruits);
        assertNotNull(shuffledCard);
    }

    /**
     * Test method for testing the shuffledCard method in the Model.CommunityChestCard class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testShuffledCardCommunityChestCard() {
        Card card = new CommunityChestCard();
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Orange");
        String shuffledCard = card.shuffledCard(new Random(), fruits);
        assertNotNull(shuffledCard);
    }

    /**
     * Test method for testing the resetDeck method in the Model.ChanceCard class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testResetDeckChanceCard() {
        Card card = new ChanceCard();
        card.resetDeck();
        assertNotNull(card);
    }

    /**
     * Test method for testing the resetDeck method in the Model.CommunityChestCard class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testResetDeckCommunityChestCard() {
        Card card = new CommunityChestCard();
        card.resetDeck();
        assertNotNull(card);
    }
}
