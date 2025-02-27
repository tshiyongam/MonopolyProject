import java.util.Random;
import java.util.ArrayList;

public interface Card {
    String getCard();
    String shuffledCard(Random random, ArrayList<String> cards);
    ArrayList<String> getAllCards();
}
