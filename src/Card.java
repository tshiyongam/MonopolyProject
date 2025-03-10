import java.util.Random;
import java.util.ArrayList;

public interface Card {
    String drawCard();
    void resetDeck();
    String shuffledCard(Random rand, ArrayList<String> cards);
}
