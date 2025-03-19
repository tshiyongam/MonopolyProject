package Model;// Class that manages the Community Chest cards and their information for the Monopoly board
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class CommunityChestCard extends BoardElement implements Card {

    private final ArrayList<String> communityChestCards;
    private final Random rand;

    /**
     * Constructor for the CommunityChestCard class.
     * @author Mael Tshiyonga
     */
    public CommunityChestCard() {
        super("Community Chest", SpaceType.COMMUNITY_CHEST);
        communityChestCards = new ArrayList<>();
        rand = new Random();
        loadCards();
    }

    /**
     * Method to draw a card from the Community Chest deck.
     * @return String representing the drawn card
     * @author Mael Tshiyonga
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
     * @author Mael Tshiyonga
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
     * @author Mael Tshiyonga
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
     * @author Mael Tshiyonga
     */
    public void resetDeck() {
        communityChestCards.clear();
        loadCards();
    }

    /**
     * Method to trigger the action of the Community Chest card.
     * @param player The player who landed on the space.
     * @author Mael Tshiyonga
     */
    @Override
    public void triggerAction(Player player, Banker banker) {
        System.out.println(player.getName() + " has landed on a Community Chest Space!");
        System.out.println(drawCard());
        processCard(player, banker, drawCard());
    }

    /**
     * Method to process the card drawn.
     * @param player Model.Player object
     * @param banker Model.Banker object
     * @param card String representing the card drawn
     * @author Mael Tshiyonga
     */
    @Override
    public void processCard(Player player, Banker banker, String card) {
        switch (card) {
            case "Advance to Go. Collect $200." -> player.setPosition(0);
            case "Bank error in your favor. Collect $200." -> player.receiveMoney(200);
            case "Doctor's fees. Pay $50." -> player.payMoney(50);
            case "Get Out of Jail Free." -> player.setHasGetOutOfJailCard(true);
            case "Go to Jail. Do not pass Go. Do not collect $200." -> player.goToJail();
            case "Grand Opera Night. Collect $50 from every player for opening night seats." -> {
                for (Player p : banker.getPlayers()) {
                    if (!p.equals(player))
                        p.payMoney(50);
                    player.receiveMoney(banker.getPlayers().size() * 50);
                }
            }
            case "Holiday Fund matures. Collect $100.", "You inherit $100.", "Life insurance matures. Collect $100." -> player.receiveMoney(100);
            case "Income tax refund. Collect $20." -> player.receiveMoney(20);
            case "It is your birthday. Collect $10 from every player." -> {
                for (Player p : banker.getPlayers()) {
                    if (!p.equals(player))
                        p.payMoney(10);
                    player.receiveMoney(banker.getPlayers().size() * 10);
                }
            }
            case "Pay hospital fees of $100." -> player.payMoney(100);
            case "Pay school fees of $150." -> player.payMoney(150);
            case "Receive $25 consultancy fee." -> player.receiveMoney(25);
            case "You are assessed for street repairs. Pay $40 per house and $115 per hotel." -> {
                for (int i = 0; i < banker.getHouseCount(); i++)
                    player.payMoney(40);
                for (int i = 0; i < banker.getHotelCount(); i++)
                    player.payMoney(115);
            }
            case "You have won second prize in a beauty contest. Collect $10." -> player.receiveMoney(10);
        }
    }
}