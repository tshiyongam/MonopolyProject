/**
 * Represents the player's game piece and stores a reference to its player.
 * @author Connor Moyer
 */
public class Token {
    private final TokenType type;
    private Player player;

    /**
     * Creates a token with a given type.
     * @param type The type of the token.
     * @author Connor Moyer
     */
    public Token(TokenType type) {
        this.type = type;
    }

    /**
     * Gets the type of the token.
     * @return The type of the token.
     * @author Connor Moyer
     */
    public TokenType getType() {
        return type;
    }

    /**
     * Gets the player associated with this token.
     * @return The player using this token.
     * @author Connor Moyer
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Assigns a player to this token.
     * @param player The player who owns this token.
     * @author Connor Moyer
     */
    public void setPlayer(Player player) {
        this.player = player;
    }
}

