import java.util.ArrayList;
import java.util.Properties;

// Contains the Player class which represents a player in the game
public class Player {
    private final String name;
    private int consecutiveDoubles = 0;
    private int position = 0;
    private int money = 1500;
    private boolean inJail = false;
    private ArrayList<PropertyElement> ownedProperties = new ArrayList<>();
    private ArrayList<PropertyElement> mortgagedProperties = new ArrayList<>();
    private Token token;

    /**
     * Constructor for a Player object
     * @param name Name of the player
     * @param tokenType The type of token the player will use
     * @author Vicente Rivera
     */
    public Player(String name, TokenType tokenType) {
        this.name = name;
        new Token(tokenType);
    }

    /**
     * Method for getting a players name
     * @return A string value representing the name of the player
     * @author Vicente Rivera
     */
    public String getName() {
        return name;
    }

    /**
     * Method for getting a players token type
     * @return A string value representing the name of the player
     * @author Vicente Rivera
     */

    public Token getToken() {
        return token;
    }

    /**
     * Method for getting the position of a player
     * @return An integer value representing the position of the player on the board
     * @author Vicente Rivera
     */
    public int getPosition() {
        return position;
    }

    /**
     * Method for determining whether a play is in jail or not
     * @return A boolean value representing if the player is in jail
     * @author Vicente Rivera
     */
    public boolean isInJail() {
        return inJail;
    }

    /**
     * Method that changes the position of the player on the board
     * @author Vicente Rivera
     */
    public void setPosition(int newPosition) {
        position = newPosition;
    }

    /**
     * Method for sending a player to jail
     * @author Vicente Rivera
     */
    public void goToJail() {
        System.out.println(name + " is sent to jail");
        inJail = true;
        position = 10;
        consecutiveDoubles = 0;
    }


    /**
     * Method for a player to take a turn in the game
     * @param board The game board that the player is playing on
     * @author Vicente Rivera
     */
    public void takeTurn(GameBoard board) {

        int[] rollResults = diceRoll();
        int rollValue = rollResults[0];
        boolean doubles = rollResults[1] == 1;

        if (inJail) {
            System.out.println (name + "is in jail. They must roll a double to get out or pay $50");
            return;
        }

        if (consecutiveDoubles == 3)
        {
            System.out.println(name + " rolled three doubles in a row. They are sent to jail");
            goToJail();
            return;
        }

        position += rollValue;
        if (position >= 39 && !isInJail()) {
            position -= 39;
            payMoney(200);
            System.out.println(name + " passed GO and collected $200");
        }
        else {
            goToJail();
            passTurn();
        }
        // TODO: Implement either rolling doubles within 3 turns, paying $50 to get out of jail,
        //  using a "Get Out of Jail Free" card, or waiting 3 turns

        if (!doubles) {
            consecutiveDoubles = 0;
            passTurn();
        }
        else
            takeTurn(board);
    }

    /**
     * Method for rolling the dice when a player takes their turn
     * @return An array of integers representing the two dice rolls and if the player rolled a double
     * @author Vicente Rivera
     */
    public int[] diceRoll() {
        Dice dice = new Dice();
        int roll1 = dice.Roll();
        int roll2 = dice.Roll();
        int sum = roll1 + roll2;

        System.out.println("You rolled a " + roll1 + " and a " + roll2);
        if (roll1 == roll2) {
            System.out.println("You rolled a double! Roll again");
            consecutiveDoubles++;
            return new int[]{sum, 1};
        }
        consecutiveDoubles = 0;
        return new int[] {sum, 0};
    }

    /**
     * Method for a player to receive money
     * @param amount Amount player is receiving from bank
     * @author Mael Tshiyonga
     */
    public void receiveMoney(int amount) {
        money += amount;
    }

    /**
     * Method for a player to pay a certain amount of money
     * @param amount Amount player must pay to bank
     * @author Mael Tshiyonga
     */
    public void payMoney(int amount) {
        money -= amount;
    }

    /**
     * Method for checking if a player can pay a certain amount of money
     * @param amount Amount being checked
     * @return True or false
     * @author Mael Tshiyonga
     */
    public boolean canPay(int amount) {
        return money >= amount;
    }

    /**
     * Method for adding a property to a player's list of owned properties
     * @param deed TitleDeed object representing the property being added to the player's list of owned properties
     * @author Mael Tshiyonga
     */
    public void addProperty(PropertyElement deed) {
        ownedProperties.add(deed);
    }

    /**
     * Method for removing a property from a player's list of owned properties
     * @param deed TitleDeed object representing the property being removed from the player's list of owned properties
     * @author Mael Tshiyonga
     */
    public void removeProperty(PropertyElement deed) {
        ownedProperties.remove(deed);
    }

    /**
     * Method for mortgaging a property
     * @param deed TitleDeed object representing the property being mortgaged by the player
     * @author Mael Tshiyonga
     */
    public void mortgageProperty(PropertyElement deed) {
        ownedProperties.remove(deed);
        mortgagedProperties.add(deed);
    }

    public void setHasGetOutOfJailCard(boolean hasGetOutOfJailCard) {
        this.hasGetOutOfJailCard = hasGetOutOfJailCard;
    }

    /**
     * Method for passing the turn to the next player
     * @author Vicente Rivera
     */
    public void passTurn() {
        System.out.println("Turn Ended");
    }
}