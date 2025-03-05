import java.util.ArrayList;
import java.util.Random;




//Board Space implementation for Chance Space
public class ChanceSpace implements BoardElement{
    private final String name;

    public ChanceSpace(String name) {
        this.name = name;
    }

    @Override
    public String getCard() {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getPrice() {
        return null;
    }

    @Override
    public String shuffledCard(Random rand, ArrayList<String> communityChestCards) {
        return null;
    }

    @Override
    public ArrayList<String> getAllCards() {
        return null;
    }
}
