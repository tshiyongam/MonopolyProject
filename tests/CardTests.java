import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
public class CardTests {

    /**
     * Test method for testing compiler.
     * @author Mael Tshiyonga
     */
    @Test
    public void testNothing() {

    }

    /**
     * Test method for testing the drawChanceCard method in the Chance class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testDrawChanceCard() {
        Card card = new Chance();
        String drawnCard = card.drawCard();
        assertNotNull(drawnCard);
    }

    /**
     * Test method for testing the drawCommunityChestCard method in the CommunityChest class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testDrawCommunityChestCard() {
        Card card = new CommunityChest();
        String drawnCard = card.drawCard();
        assertNotNull(drawnCard);
    }

    /**
     * Test method for testing the shuffledCard method in the Chance class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testShuffledCardChanceCard() {
        Card card = new Chance();
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Orange");
        String shuffledCard = card.shuffledCard(new Random(), fruits);
        assertNotNull(shuffledCard);
    }

    /**
     * Test method for testing the shuffledCard method in the CommunityChest class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testShuffledCardCommunityChestCard() {
        Card card = new CommunityChest();
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Orange");
        String shuffledCard = card.shuffledCard(new Random(), fruits);
        assertNotNull(shuffledCard);
    }

    /**
     * Test method for testing the resetDeck method in the Chance class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testResetDeckChanceCard() {
        Card card = new Chance();
        card.resetDeck();
        assertNotNull(card);
    }

    /**
     * Test method for testing the resetDeck method in the CommunityChest class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testResetDeckCommunityChestCard() {
        Card card = new CommunityChest();
        card.resetDeck();
        assertNotNull(card);
    }
}
