import java.util.ArrayList;
import java.util.List;

//Abstract class that represents a general space on the game board.
public abstract class BoardElement {

    private final String name;
    private final SpaceType type;
    private List<Token> tokens;

    public BoardElement(String name, SpaceType type) {
        this.name = name;
        this.type = type;
        this.tokens = new ArrayList<Token>();
    }

    public String getName() {
        return name;
    }

    public SpaceType getType() {
        return type;
    }

    public List<Token> getTokens() {
        return tokens;
    }

    public void addToken(Token token) {
        tokens.add(token);
    }

    public void removeToken(Token token) {
        tokens.remove(token);
    }

    //Abstract method to be implemented by subclasses for handling specific actions
    public abstract void triggerAction();
}