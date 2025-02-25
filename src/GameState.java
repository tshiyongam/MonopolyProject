import java.util.List;

public class GameState {
    // TODO: Implement a new Game Board
    // private GameBoard board;
    private List<Player> players;
    private int currentPlayerIndex;

    public void GameStart(List<Player> players){
        this.players = players;
        // Todo: Add a new game board when GameBoard is implemented
        //this.board = new GameBoard();
        this.currentPlayerIndex = 0;
    }

    public void takeTurn(){
        Player player = players.get(currentPlayerIndex);
        //Todo: Impliment the takeTurn method in the player class but need the board done first
        //player.takeTurn(board);
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
    }
}
