public class Player {
    private String name;
    private int consecutiveDoubles = 0;
    private int position = 0;
    private int money = 1500;
    private  boolean inJail = false;
    private Token token; ;
    //Todo: Set players token when token class is made

    /**
     * Constructor for a Player object
     * @param name Name of the player
     * @author Vicente Rivera
     */
    public Player(String name, TokenType token) {
        this.name = name;
        this.token = new Token(token);
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
    public void takeTurn(GameBoard board){

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

        //Todo: Add movement to player based on rollValue once GameBoard is implemented


        if (!doubles){
            consecutiveDoubles = 0;
            passTurn();
        }
        else {
            takeTurn(board);
        }
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
        return new int[]{sum, 0};
    }

    /**
     * Method for passing the turn to the next player
     * @author Vicente Rivera
     */
    public void passTurn() {
        System.out.println("Turn Ended");
    }
}