// Class that manages the Chance cards and their information for the Monopoly board
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.util.Random;

public class ChanceCard extends BoardElement implements Card {

    private final ArrayList<String> chanceCards;
    private final Random rand;

    /**
     * Constructor for the ChanceCard class.
     * @author Mael Tshiyonga
     */
    public ChanceCard(String name) {
        super(name, SpaceType.CHANCE);
        chanceCards = new ArrayList<>();
        rand = new Random();
        loadCards();
    }

    /**
     * Method to draw a card from the ChanceCard deck.
     * @author Mael Tshiyonga
     */
    @Override
    public String drawCard() {
        if (chanceCards.isEmpty())
            loadCards();
        return shuffledCard(rand, chanceCards);
    }

    /**
     * Method to load the contents of the ChanceCard cards from a text file.
     * @author Mael Tshiyonga
     */
    private void loadCards() {
        try {
            Scanner scanner = new Scanner(new File("texts/chance.txt"));
            while (scanner.hasNextLine())
                chanceCards.add(scanner.nextLine());
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Method to shuffle the ChanceCard deck.
     * @param rand Random object
     * @param chanceCards ArrayList of ChanceCard cards
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
     * Method to reset the ChanceCard deck.
     * @author Mael Tshiyonga
     */
    @Override
    public void resetDeck() {
        chanceCards.clear();
        loadCards();
    }

    /**
     * Method to trigger the action of the ChanceCard.
     * @param player Player object
     * @author Mael Tshiyonga
     */
    @Override
    public void triggerAction(Player player, Banker banker) {
        System.out.println(player.getName() + " has landed on a Chance Space!");
        System.out.println(drawCard());

        processCard(player, banker, drawCard());
    }

    /**
     * Method to process the card drawn.
     * @param player Player object
     * @param banker Banker object
     * @param card String representing the card drawn
     * @author Mael Tshiyonga
     */
    @Override
    public void processCard(Player player, Banker banker, String card) {
        if (card.equalsIgnoreCase("Advance to Boardwalk."))
            player.setPosition(39);
        else if (card.equalsIgnoreCase("Advance to Go.")) {
            player.setPosition(0);
            player.receiveMoney(200);
        }
        else if (card.equalsIgnoreCase("Advance to Illinois Avenue.")){
            player.setPosition(24);
        }
        else if (card.equalsIgnoreCase("Advance to St. Charles Place.")) {
            player.setPosition(11);

        } else if (card.equalsIgnoreCase("Bank pays you dividend of $50."))
            player.receiveMoney(50);
         else if (card.equalsIgnoreCase("Get Out of Jail Free.")) {
            player.setHasGetOutOfJailCard(true);
        } else if (card.equalsIgnoreCase("Go back 3 spaces."))
            player.setPosition(player.getPosition() - 3);
         else if (card.equalsIgnoreCase("Go to Jail.")) {
            player.goToJail();
        } else if (card.equalsIgnoreCase("Make general repairs on all your property.")) {
             // TODO: Implement the ability to pay $25 for each house and $100 for each hotel
        } else if (card.equalsIgnoreCase("Pay poor tax of $15.")) {
            player.payMoney(15);
        } else if (card.equalsIgnoreCase("Take a trip to Reading Railroad.")) {
            player.setPosition(5);
        } else if (card.equalsIgnoreCase("Take a walk on the Boardwalk.")) {
            player.setPosition(39);
        } else if (card.equalsIgnoreCase("You have been elected chairman of the board. Pay each player $50.")) {
            for (Player p : banker.getPlayers()) {
                if (!p.equals(player))
                    p.setBalance(p.getBalance() + 50);
            }
            player.setBalance(player.getBalance() - 50 * (banker.getPlayers().size() - 1));
        } else if (card.equalsIgnoreCase("Your building loan matures. Collect $150."))
            player.receiveMoney(150);

    }



}

