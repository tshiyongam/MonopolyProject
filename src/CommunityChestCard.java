import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CommunityChestCard implements Card {

    private final ArrayList<String> communityChestCards;
    private final Random rand;

    public CommunityChestCard() {
        communityChestCards = new ArrayList<>();
        rand = new Random();
        loadCards();
    }

    @Override
    public String drawCard() {
        if (communityChestCards.isEmpty())
            loadCards();

        return shuffledCard(rand, communityChestCards);
    }

    @Override
    public String shuffledCard(Random rand, ArrayList<String> communityChestCards) {
        int randomIndex = rand.nextInt(communityChestCards.size());
        String drawnCard = communityChestCards.get(randomIndex);

        if (drawnCard.equals("Get Out of Jail Free."))
            communityChestCards.remove(randomIndex);

        return drawnCard;
    }

    private void loadCards() {
        try {
            Scanner scanner = new Scanner(new File("texts/chance.txt"));
            while (scanner.hasNextLine())
                communityChestCards.add(scanner.nextLine());
            scanner.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void resetDeck() {
        communityChestCards.clear();
        loadCards();
    }
}
