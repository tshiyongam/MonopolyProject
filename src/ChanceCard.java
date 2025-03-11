import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.util.Random;

public class ChanceCard implements Card {

    private final ArrayList<String> chanceCards;
    private final Random rand;

    /**
     * Constructor for the ChanceCard class.
     * @author Mael Tshiyonga
     */
    public ChanceCard() {
        chanceCards = new ArrayList<>();
        rand = new Random();
        loadCards();
    }

    /**
     * Method to draw a card from the Chance deck.
     * @author Mael Tshiyonga
     */
    @Override
    public String drawCard() {
        if (chanceCards.isEmpty())
            loadCards();

        return shuffledCard(rand, chanceCards);
    }

    /**
     * Method to shuffle the Chance deck.
     * @param rand Random object
     * @param chanceCards ArrayList of Chance cards
     * @return String representing the drawn card
     * @author Mael Tshiyonga
     */
    @Override
    public String shuffledCard(Random rand, ArrayList<String> chanceCards) {
        int randomIndex = rand.nextInt(chanceCards.size());
        String drawnCard = chanceCards.get(randomIndex);

        if (drawnCard.equals("Get Out of Jail Free."))
            chanceCards.remove(randomIndex);

        return drawnCard;
    }

    /**
     * Method to load the contents of the Chance cards from a text file.
     * @author Mael Tshiyonga
     */
    private void loadCards() {
        try {
            Scanner scanner = new Scanner(new File("texts/chance.txt"));
            while (scanner.hasNextLine())
                chanceCards.add(scanner.nextLine());
            scanner.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Method to reset the Chance deck.
     * @author Mael Tshiyonga
     */
    @Override
    public void resetDeck() {
        chanceCards.clear();
        loadCards();
    }
}
