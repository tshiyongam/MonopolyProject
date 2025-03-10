import java.util.Random;
import java.util.ArrayList;

public interface Card {
    /**
     * Method to draw a card from the deck.
     * @return String representing the drawn card
     * Author: Mael Tshiyonga
     */
    String drawCard();

    /**
     * Method to reset the deck.
     * Author: Mael Tshiyonga
     */
    void resetDeck();

    /**
     * Method to shuffle the deck.
     * @param rand Random object
     * @param cards ArrayList of cards
     * @return String representing the drawn card
     * Author: Mael Tshiyonga
     */
    String shuffledCard(Random rand, ArrayList<String> cards);
}
