public class Player {
    private String name;
    private int consecutiveDoubles = 0;
    private int position = 0;
    private int money = 1500;
    private  boolean inJail = false;
    //Todo: Set players token when token class is made
    // private Token token

    public Player(String name){ //Todo: Add token as an input value when token class is made
        this.name = name;
        //Todo: Add player token when token class is made
        //this.token = token;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public boolean isInJail() {
        return inJail;
    }

    public void setPosition(int newPosition) {
        position = newPosition;
    }

    public void goToJail() {
        System.out.println(name + " is sent to jail");
        inJail = true;
        position = 10;
        consecutiveDoubles = 0;
    }

    public void takeTurn() {
        //Todo: change takeTurn method to take in a GameBoard object once GameBoard is implemented
        //public void takeTurn(GameBoard board)

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
            //takeTurn(board);
        }
    }

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

    public void passTurn() {
        System.out.println("Turn Ended");
    }
}