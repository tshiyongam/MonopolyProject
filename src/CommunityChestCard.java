import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CommunityChestCard extends BoardElement implements Card {

    private final ArrayList<String> communityChestCards;
    private final Random rand;

    public CommunityChestCard(String name) {
        super(name, SpaceType.COMMUNITY_CHEST);
        communityChestCards = new ArrayList<>();
        rand = new Random();
        loadCards();
    }

    @Override
    public String drawCard(){
        if(communityChestCards.isEmpty())
            loadCards();
        return shuffledCard(rand, communityChestCards);
    }

    private void loadCards(){
        try {
            Scanner scanner = new Scanner(new File("texts/chance.txt"));
            while (scanner.hasNextLine())
                communityChestCards.add(scanner.nextLine());
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String shuffledCard(Random rand, ArrayList<String> communityChestCards) {
        int randomIndex = rand.nextInt(communityChestCards.size());
        String drawnCard = communityChestCards.get(randomIndex);

        if (drawnCard.equals("Get Out of Jail Free."))
            communityChestCards.remove(randomIndex);

        return drawnCard;
    }

    @Override
    public void resetDeck(){
        communityChestCards.clear();
        loadCards();
    }

    @Override
    public void triggerAction(Player player) {

    }
}