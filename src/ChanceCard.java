import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.util.Random;

public class ChanceCard implements Card {

    private static final ArrayList<String> chanceCards = new ArrayList<>();

    @Override
    public String getCard() {
        Random rand = new Random();
        if (chanceCards.isEmpty()) {
            try {
                Scanner scanner = new Scanner(new File("texts/chance.txt"));
                while (scanner.hasNextLine())
                    chanceCards.add(scanner.nextLine());
                scanner.close();

                if (chanceCards.isEmpty()) return "No cards available";
            }
            catch (FileNotFoundException e) {
                return "File not found";
            }
        }
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
}
