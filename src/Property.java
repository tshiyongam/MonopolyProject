import java.util.ArrayList;
import java.util.Random;


//Board Space implementation for Properties
public class Property implements BoardElement{
    private final String name;
    //private final int price;
    //private final int rent;

    public Property(String name) {
        this.name = name;
/*        if (name == "Community Chest");
    Possibly add a large if statement to handle which space is which?
 */

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

    public Object getRent(){
        return null;
    }

}