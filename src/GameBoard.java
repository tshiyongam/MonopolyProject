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
        boardElements.add(new SpecialSpace("GO"));
        boardElements.add(new Property("Mediterranean Avenue"));
        boardElements.add(new CommunityChest("Community Chest"));
        boardElements.add(new Property("Baltic Avenue"));
        boardElements.add(new SpecialSpace("Income Tax"));
        boardElements.add(new Property("Reading Railroad"));
        boardElements.add(new Property("Oriental Avenue"));
        boardElements.add(new ChanceSpace("Chance"));
        boardElements.add(new Property("Vermont Avenue"));
        boardElements.add(new Property("Connecticut Avenue"));
        boardElements.add(new SpecialSpace("Jail"));
        boardElements.add(new Property("St. Charles Place"));
        boardElements.add(new Property("Electric Company"));
        boardElements.add(new Property("States Avenue"));
        boardElements.add(new Property("Virginia Avenue"));
        boardElements.add(new Property("Pennsylvania Railroad"));
        boardElements.add(new Property("St. James Place"));
        boardElements.add(new CommunityChest("Community Chest"));
        boardElements.add(new Property("Tennessee Avenue"));
        boardElements.add(new Property("New York Avenue"));
        boardElements.add(new SpecialSpace("Free Parking"));
        boardElements.add(new Property("Kentucky Avenue"));
        boardElements.add(new ChanceSpace("Chance"));
        boardElements.add(new Property("Indiana Avenue"));
        boardElements.add(new Property("Illinois Avenue"));
        boardElements.add(new Property("B. & O. Railroad"));
        boardElements.add(new Property("Atlantic Avenue"));
        boardElements.add(new Property("Ventnor Avenue"));
        boardElements.add(new Property("Water Works"));
        boardElements.add(new Property("Marvin Gardens"));
        boardElements.add(new SpecialSpace("Go to Jail"));
        boardElements.add(new Property("Pacific Avenue"));
        boardElements.add(new Property("North Carolina Avenue"));
        boardElements.add(new ChanceSpace("Community Chest"));
        boardElements.add(new Property("Pennsylvania Avenue"));
        boardElements.add(new Property("Short Line"));
        boardElements.add(new ChanceSpace("Chance"));
        boardElements.add(new Property("Park Place"));
        boardElements.add(new SpecialSpace("Luxury Tax"));
        boardElements.add(new Property("Boardwalk"));















    }


}
