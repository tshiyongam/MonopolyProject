import java.util.ArrayList;

public class GameBoard {

    private final ArrayList<BoardElement> boardElements;

    /**
     * Implementation of the GameBoard class.
     * Initializes a new game board, an array of board elements.
     * Author: Aidan Casey
     */
    public GameBoard() {
        this.boardElements = new ArrayList<>();
        initializeBoard();
    }
    /**
     * Initialization of the game board. Adds a new element for
     * each space on the Monopoly board to an array list in order.
     * @author Aidan Casey
     */
    private void initializeBoard() {
        boardElements.add(new SpecialElement("GO"));
        boardElements.add(new PropertyElement("Mediterranean Avenue", 60, 2));
        boardElements.add(new CommunityChestCard("CommunityChest"));
        boardElements.add(new PropertyElement("Baltic Avenue", 60, 4));
        boardElements.add(new TaxElement("Income Tax", 200));
        boardElements.add(new RailroadElement("Reading Railroad", 200));
        boardElements.add(new PropertyElement("Oriental Avenue", 100, 6));
        boardElements.add(new ChanceCard("Chance"));
        boardElements.add(new PropertyElement("Vermont Avenue", 100, 6));
        boardElements.add(new PropertyElement("Connecticut Avenue", 120, 8));
        boardElements.add(new SpecialElement("Jail"));
        boardElements.add(new PropertyElement("St. Charles Place",140, 10));
        boardElements.add(new Utilities("Electric Company",150));
        boardElements.add(new PropertyElement("States Avenue",140,10));
        boardElements.add(new PropertyElement("Virginia Avenue", 160, 12));
        boardElements.add(new RailroadElement("Pennsylvania Railroad", 200));
        boardElements.add(new PropertyElement("St. James Place", 180, 14));
        boardElements.add(new CommunityChestCard("Community Chest"));
        boardElements.add(new PropertyElement("Tennessee Avenue",180,14));
        boardElements.add(new PropertyElement("New York Avenue",200,16));
        boardElements.add(new SpecialElement("Free Parking"));
        boardElements.add(new PropertyElement("Kentucky Avenue ",220,18));
        boardElements.add(new ChanceCard("Chance"));
        boardElements.add(new PropertyElement("Indiana Avenue",220,18));
        boardElements.add(new PropertyElement("Illinois Avenue",240,20));
        boardElements.add(new RailroadElement("B. & O. Railroad",200));
        boardElements.add(new PropertyElement("Atlantic Avenue",260,22));
        boardElements.add(new PropertyElement("Ventnor Avenue", 260,22));
        boardElements.add(new Utilities("Water Works",150));
        boardElements.add(new PropertyElement("Marvin Gardens",280,24));
        boardElements.add(new SpecialElement("Go to Jail"));
        boardElements.add(new PropertyElement("Pacific Avenue", 300,26));
        boardElements.add(new PropertyElement("North Carolina Avenue", 300,26));
        boardElements.add(new CommunityChestCard("Community Chest"));
        boardElements.add(new PropertyElement("Pennsylvania Avenue", 320,28));
        boardElements.add(new RailroadElement("Short Line Railroad",200));
        boardElements.add(new ChanceCard("Chance"));
        boardElements.add(new PropertyElement("Park Place",350,35));
        boardElements.add(new TaxElement("Luxury Tax",200));
        boardElements.add(new PropertyElement("Boardwalk",400,50));






    }


}
