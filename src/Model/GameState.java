package Model;// Class that manages the current state of the game
import java.util.List;
/**
 * Constructor for a Game State Element
 * @author Vicente Rivera
 */
public class GameState {
    private GameBoard board;
    private List<Player> players;
    private int currentPlayerIndex;
    private SpaceType spaceType;
    /**
     * Method for starting a new game of Monopoly
     * @param players List of players in the game
     * @author Vicente Rivera
     */
    public void GameStart(List<Player> players) {
        this.players = players;
        this.board = new GameBoard();
        this.currentPlayerIndex = 0;
        spaceType = SpaceType.GO;
    }
    /**
     * Method for taking determining the current player and taking their turn
     * @author Vicente Rivera
     */
    public void takeTurn(){
        Player player = players.get(currentPlayerIndex);
        player.takeTurn(board);
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
    }
}
