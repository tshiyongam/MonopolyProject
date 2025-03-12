//Abstract class that represents a general space on the game board.
import java.util.ArrayList;
import java.util.List;

public abstract class BoardElement {

    private final String name;
    private final SpaceType type;
    private final List<Token> tokens;

    /**
     * Creates a BoardElement with a given name and space type.
     * @param name The name of the space on the game board.
     * @param type The type of space (GO, PropertyElement, Jail, etc.).
     * @author Connor Moyer
     */
    public BoardElement(String name, SpaceType type) {
        this.name = name;
        this.type = type;
        this.tokens = new ArrayList<>();
    }

    /**
     * Gets the name of the space.
     * @return The name of the space.
     * @author Connor Moyer
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the type of the space.
     * @return The type of the space.
     * @author Connor Moyer
     */
    public SpaceType getType() {
        return type;
    }

    /**
     * Gets the list of tokens currently occupying the space.
     * @return A list of tokens occupying this space.
     * @author Connor Moyer
     */
    public List<Token> getTokens() {
        return tokens;
    }

    /**
     * Adds a token to the space.
     * @param token The token to add to the space.
     * @author Connor Moyer
     */
    public void addToken(Token token) {
        tokens.add(token);
    }

    /**
     * Removes a token from the space.
     * @param token The token to remove from the space.
     * @author Connor Moyer
     */
    public void removeToken(Token token) {
        tokens.remove(token);
    }

    /**
     * Abstract method to be implemented by subclasses for handling specific actions when a player lands on the space.
     * @param player The player who landed on the space.
     * @author Connor Moyer
     */
    public abstract void triggerAction(Player player);
}