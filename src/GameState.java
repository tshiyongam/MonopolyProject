import java.util.List;
/**
 * Constructor for a Game State Element
 * @author Vicente Rivera
 */
public class GameState {
    // TODO: Implement a new Game Board
    // private GameBoard board;
    private List<Player> players;
    private int currentPlayerIndex;
    /**
     * Method for starting a new game of Monopoly
     * @param players List of players in the game
     * @author Vicente Rivera
     */
    public void GameStart(List<Player> players){
        this.players = players;
        // Todo: Add a new game board when GameBoard is implemented
        //this.board = new GameBoard();
        this.currentPlayerIndex = 0;
    }
    /**
     * Method for taking determining the current player and taking their turn
     * @author Vicente Rivera
     */
    public void takeTurn(){
        Player player = players.get(currentPlayerIndex);
        //Todo: Implement the takeTurn method in the player class but need the board done first
        //player.takeTurn(board);
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
    }
}
