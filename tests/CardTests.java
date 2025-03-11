import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
public class CardTests {

    @Test
    public void testNothing() {

    }

    @Test
    public void testDrawChanceCard() {
        Card card = new ChanceCard();
        String drawnCard = card.drawCard();
        assertNotNull(drawnCard);
    }

    @Test
    public void testDrawCommunityChestCard() {
        Card card = new CommunityChestCard();
        String drawnCard = card.drawCard();
        assertNotNull(drawnCard);
    }

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

    @Test
    public void testResetDeckChanceCard() {
        Card card = new ChanceCard();
        card.resetDeck();
        assertNotNull(card);
    }

    @Test
    public void testResetDeckCommunityChestCard() {
        Card card = new CommunityChestCard();
        card.resetDeck();
        assertNotNull(card);
    }
}
