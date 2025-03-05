import java.util.ArrayList;
import java.util.Random;


//Board Space implementation for Special Spaces
public class SpecialSpace implements BoardElement{
    private final String name;

    public SpecialSpace(String name) {
        this.name = name;
    }

    @Override
    public String getCard() {
        return null;
    }

    @Override
    public String getName() {
        return null;
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
