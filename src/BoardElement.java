import java.util.ArrayList;
import java.util.Random;

public interface BoardElement {
    String getCard();

    String getName();
    Integer getPrice();

    String shuffledCard(Random rand, ArrayList<String> communityChestCards);

    ArrayList<String> getAllCards();
}
