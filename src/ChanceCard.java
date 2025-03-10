import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.util.Random;

public class ChanceCard implements Card {

    private final ArrayList<String> chanceCards;
    private final Random rand;

    public ChanceCard() {
        chanceCards = new ArrayList<>();
        rand = new Random();
        loadCards();
    }

    @Override
    public String drawCard() {
        if (chanceCards.isEmpty())
            loadCards();

        return shuffledCard(rand, chanceCards);
    }

    @Override
    public String shuffledCard(Random rand, ArrayList<String> chanceCards) {
        int randomIndex = rand.nextInt(chanceCards.size());
        String drawnCard = chanceCards.get(randomIndex);

        if (drawnCard.equals("Get Out of Jail Free."))
            chanceCards.remove(randomIndex);

        return drawnCard;
    }

    private void loadCards() {
        try {
            Scanner scanner = new Scanner(new File("texts/chance.txt"));
            while (scanner.hasNextLine())
                chanceCards.add(scanner.nextLine());
            scanner.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void resetDeck() {
        chanceCards.clear();
        loadCards();
    }
}
