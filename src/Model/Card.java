package Model;// Interface for the Model.Card class.
import java.util.Random;
import java.util.ArrayList;
public interface Card {
    /**
     * Method to draw a card from the deck.
     * @return String representing the drawn card
     * @author Mael Tshiyonga
     */
    String drawCard();

    /**
     * Method to reset the deck.
     * @author Mael Tshiyonga
     */
    void resetDeck();

    /**
     * Method to shuffle the deck.
     * @param rand Random object
     * @param cards ArrayList of cards
     * @return String representing the drawn card
     * @author Mael Tshiyonga
     */
    String shuffledCard(Random rand, ArrayList<String> cards);

    /**
     * Method to process the card drawn.
     * @param player Model.Player object
     * @param banker Model.Banker object
     * @param card String representing the card drawn
     * @author Mael Tshiyonga
     */
    void processCard(Player player, Banker banker, String card);
}
