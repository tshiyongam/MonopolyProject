package Model;// Implementation of the Model.GameBoard class that represents the game board of Monopoly.
import java.util.ArrayList;
public class GameBoard {

    private final ArrayList<BoardElement> boardElements;

    /**
     * Implementation of the Model.GameBoard class.
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
        boardElements.add(new PropertyElement("Mediterranean Avenue", "Purple", 60, new int[]{2, 10, 30, 90, 160, 250}, 30, 50, 50));
        boardElements.add(new CommunityChestCard("Community Chest"));
        boardElements.add(new PropertyElement("Baltic Avenue", "Purple", 60, new int[]{4, 20, 60, 180, 320, 450}, 30, 50, 50));
        boardElements.add(new TaxElement("Income Tax", 200));
        boardElements.add(new RailroadElement("Reading Railroad", 200, new int[]{25, 50, 100, 200}, 100));
        boardElements.add(new PropertyElement("Oriental Avenue", "Light Blue", 100, new int[]{6, 30, 90, 270, 400, 550}, 50, 50, 50));
        boardElements.add(new ChanceCard("Chance"));
        boardElements.add(new PropertyElement("Vermont Avenue", "Light Blue", 100, new int[]{6, 30, 90, 270, 400, 550}, 50, 50, 50));
        boardElements.add(new PropertyElement("Connecticut Avenue", "Light Blue", 120, new int[]{8, 40, 100, 300, 450, 600}, 60, 50, 50));
        boardElements.add(new SpecialElement("Jail"));
        boardElements.add(new PropertyElement("St. Charles Place", "Pink", 140, new int[]{10, 50, 150, 450, 625, 750}, 70, 100, 100));
        boardElements.add(new Utilities("Electric Company", 150));
        boardElements.add(new PropertyElement("States Avenue", "Pink", 140, new int[]{10, 50, 150, 450, 625, 750}, 70, 100, 100));
        boardElements.add(new PropertyElement("Virginia Avenue", "Pink", 160, new int[]{12, 60, 180, 500, 700, 900}, 80, 100, 100));
        boardElements.add(new RailroadElement("Pennsylvania Railroad", 200, new int[]{25,50,100,200}, 100));
        boardElements.add(new PropertyElement("St. James Place", "Orange", 180, new int[]{14, 70, 200, 550, 750, 950}, 90, 100, 100));
        boardElements.add(new CommunityChestCard("Community Chest"));
        boardElements.add(new PropertyElement("Tennessee Avenue", "Orange", 180, new int[]{14, 70, 200, 550, 750, 950}, 90, 100, 100));
        boardElements.add(new PropertyElement("New York Avenue", "Orange", 200, new int[]{16, 80, 220, 600, 800, 1000}, 100, 100, 100));
        boardElements.add(new SpecialElement("Free Parking"));
        boardElements.add(new PropertyElement("Kentucky Avenue", "Red", 220, new int[]{18, 90, 250, 700, 875, 1050}, 110, 150, 150));
        boardElements.add(new ChanceCard("Chance"));
        boardElements.add(new PropertyElement("Indiana Avenue", "Red", 220, new int[]{18, 90, 250, 700, 875, 1050}, 110, 150, 150));
        boardElements.add(new PropertyElement("Illinois Avenue", "Red", 240, new int[]{20, 100, 300, 750, 925, 1100}, 120, 150, 150));
        boardElements.add(new RailroadElement("B. & O. Railroad", 200, new int[]{25,50,100,200}, 100));
        boardElements.add(new PropertyElement("Atlantic Avenue", "Yellow", 260, new int[]{22, 110, 330, 800, 975, 1150}, 130, 150, 150));
        boardElements.add(new PropertyElement("Ventnor Avenue", "Yellow", 260, new int[]{22, 110, 330, 800, 975, 1150}, 130, 150, 150));
        boardElements.add(new Utilities("Water Works", 150));
        boardElements.add(new PropertyElement("Marvin Gardens", "Yellow", 280, new int[]{24, 120, 360, 850, 1025, 1200}, 140, 150, 150));
        boardElements.add(new SpecialElement("Go to Jail"));
        boardElements.add(new PropertyElement("Pacific Avenue", "Green", 300, new int[]{26, 130, 390, 900, 1100, 1275}, 150, 200, 200));
        boardElements.add(new PropertyElement("North Carolina Avenue", "Green", 300, new int[]{26, 130, 390, 900, 1100, 1275}, 150, 200, 200));
        boardElements.add(new CommunityChestCard("Community Chest"));
        boardElements.add(new PropertyElement("Pennsylvania Avenue", "Green", 320, new int[]{28, 150, 450, 1000, 1200, 1400}, 160, 200, 200));
        boardElements.add(new RailroadElement("Short Line Railroad", 200, new int[]{25,50,100,200}, 100));
        boardElements.add(new ChanceCard("Chance"));
        boardElements.add(new PropertyElement("Park Place", "Blue", 350, new int[]{35, 175, 500, 1100, 1300, 1500}, 175, 200, 200));
        boardElements.add(new TaxElement("Luxury Tax", 200));
        boardElements.add(new PropertyElement("Boardwalk", "Blue", 400, new int[]{50, 200, 600, 1400, 1700, 2000}, 200, 200, 200));
    }

    /**
     * Method to get the board element at a given position.
     * @param position The position of the board element to get.
     * @return The board element at the given position.
     * @author Mael Tshiyonga
     */
    public BoardElement getBoardElement(int position) {
        return boardElements.get(position);
    }
}
