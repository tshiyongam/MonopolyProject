import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CommunityChestCard implements Card {


    private final ArrayList<String> communityChestCards;
    private final Random rand;

    /**
     * Constructor for the CommunityChestCard class.
     * Author: Mael Tshiyonga
     */
    public CommunityChestCard() {
        communityChestCards = new ArrayList<>();
        rand = new Random();
        loadCards();
    }

    /**
     * Method to draw a card from the Community Chest deck.
     * @return String representing the drawn card
     * Author: Mael Tshiyonga
     */
    @Override
    public String drawCard() {
        if (communityChestCards.isEmpty())
            loadCards();

        return shuffledCard(rand, communityChestCards);
    }

    /**
     * Method to shuffle the Community Chest deck.
     * @param rand Random object
     * @param communityChestCards ArrayList of Community Chest cards
     * @return String representing the drawn card
     * Author: Mael Tshiyonga
     */
    @Override
    public String shuffledCard(Random rand, ArrayList<String> communityChestCards) {
        int randomIndex = rand.nextInt(communityChestCards.size());
        String drawnCard = communityChestCards.get(randomIndex);

        if (drawnCard.equals("Get Out of Jail Free."))
            communityChestCards.remove(randomIndex);

        return drawnCard;
    }

    /**
     * Method to load the contents of the Community Chest cards from a text file.
     * Author: Mael Tshiyonga
     */
    private void loadCards() {
        try {
            Scanner scanner = new Scanner(new File("texts/chance.txt"));
            while (scanner.hasNextLine())
                communityChestCards.add(scanner.nextLine());
            scanner.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Method to reset the Community Chest deck.
     * Author: Mael Tshiyonga
     */
    @Override
    public void resetDeck() {
        communityChestCards.clear();
        loadCards();
    }
}
