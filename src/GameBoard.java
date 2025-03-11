import java.util.ArrayList;

public class GameBoard {

    private final ArrayList<BoardElement> boardElements;


    public GameBoard() {
        this.boardElements = new ArrayList<>();


        initializeBoard();
    }
    /*
    Initializing a new game board. Adding each space with names and types into an array list.
    Could be executed differently and cleaned up.
     */
    private void initializeBoard() {
        boardElements.add(new SpecialElement("GO"));
        boardElements.add(new PropertyElement("Mediterranean Avenue"));
        boardElements.add(new CommunityChestCard("Community Chest"));
        boardElements.add(new PropertyElement("Baltic Avenue"));
        boardElements.add(new TaxElement("Income Tax"));
        boardElements.add(new RailroadElement("Reading Railroad"));
        boardElements.add(new PropertyElement("Oriental Avenue"));
        boardElements.add(new ChanceCard("ChanceCard"));
        boardElements.add(new PropertyElement("Vermont Avenue"));
        boardElements.add(new PropertyElement("Connecticut Avenue"));
        boardElements.add(new SpecialElement("Jail"));
        boardElements.add(new PropertyElement("St. Charles Place"));
        boardElements.add(new Utilities("Electric Company"));
        boardElements.add(new PropertyElement("States Avenue"));
        boardElements.add(new PropertyElement("Virginia Avenue"));
        boardElements.add(new RailroadElement("Pennsylvania Railroad"));
        boardElements.add(new PropertyElement("St. James Place"));
        boardElements.add(new CommunityChestCard("Community Chest"));
        boardElements.add(new PropertyElement("Tennessee Avenue"));
        boardElements.add(new PropertyElement("New York Avenue"));
        boardElements.add(new SpecialElement("Free Parking"));
        boardElements.add(new PropertyElement("Kentucky Avenue"));
        boardElements.add(new ChanceCard("ChanceCard"));
        boardElements.add(new PropertyElement("Indiana Avenue"));
        boardElements.add(new PropertyElement("Illinois Avenue"));
        boardElements.add(new RailroadElement("B. & O. Railroad"));
        boardElements.add(new PropertyElement("Atlantic Avenue"));
        boardElements.add(new PropertyElement("Ventnor Avenue"));
        boardElements.add(new Utilities("Water Works"));
        boardElements.add(new PropertyElement("Marvin Gardens"));
        boardElements.add(new SpecialElement("Go to Jail"));
        boardElements.add(new PropertyElement("Pacific Avenue"));
        boardElements.add(new PropertyElement("North Carolina Avenue"));
        boardElements.add(new ChanceCard("Community Chest"));
        boardElements.add(new PropertyElement("Pennsylvania Avenue"));
        boardElements.add(new PropertyElement("Short Line"));
        boardElements.add(new ChanceCard("ChanceCard"));
        boardElements.add(new PropertyElement("Park Place"));
        boardElements.add(new TaxElement("Luxury Tax"));
        boardElements.add(new PropertyElement("Boardwalk"));















    }


}
