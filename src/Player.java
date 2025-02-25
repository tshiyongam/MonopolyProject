public class Player {
    private int consecutiveDoubles = 0; // Number of consecutive doubles rolled

    public void takeTurn() { // Method For a player to take a turn
        boolean doubles = diceRoll();
        if (doubles) {
            consecutiveDoubles++;
            if (consecutiveDoubles == 3) {
                System.out.println("Go to jail");
                consecutiveDoubles = 0;

                //TODO: Replace the following line with a "Go to jail" method once the board is implemented
                passTurn();
                
            } else {
                takeTurn();
            }
        } else {
            consecutiveDoubles = 0;
            passTurn();
        }
    }

    public boolean diceRoll() {
        Dice dice = new Dice();
        int roll1 = dice.Roll();
        int roll2 = dice.Roll();
        System.out.println("You rolled a " + roll1 + " and a " + roll2);
        if (roll1 == roll2) {
            System.out.println("You rolled a double! Roll again");
            return true;
        } else {
            return false;
        }
    }

    public void passTurn() {
        System.out.println("Turn Ended");
    }
}