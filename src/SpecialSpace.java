import java.util.ArrayList;
import java.util.Random;


//Board Space implementation for Special Spaces
public class SpecialSpace implements BoardElement {
    private final String name;

    public SpecialSpace(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public SpaceType getType() {
        return SpaceType;
    }

    @Override
    public List<Token> getTokens() {
        return new ArrayList<Token>();
    }

    @Override
    public void addToken(Token token) {
        // Do nothing
    }

    @Override
    public void removeToken(Token token) {
        // Do nothing
    }


    @Override
    public void triggerAction(Player player) {
        // Do nothing
    }


}
