import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



//Board Space implementation for Community Chest
public class CommunityChest implements BoardElement{
    private final ArrayList<String> communityChestCards = new ArrayList<>();

    private final String name;

    public CommunityChest(String name) {
        this.name = name;
    }

    @Override
    public String getCard() {
        Random rand = new Random();
        if (communityChestCards.isEmpty()) {
            try {
                Scanner scanner = new Scanner(new File("texts/communityChest.txt"));
                while (scanner.hasNextLine())
                    communityChestCards.add(scanner.nextLine());
                scanner.close();

                if (communityChestCards.isEmpty()) return "No cards available";  // Handle empty file case
            }
            catch (FileNotFoundException e) {
                return "File not found";
            }
        }
        return shuffledCard(rand, communityChestCards);
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
        int randomIndex = rand.nextInt(communityChestCards.size());
        String drawnCard = communityChestCards.get(randomIndex);

        if (drawnCard.equals("Get Out of Jail Free."))
            communityChestCards.remove(randomIndex);

        return drawnCard;
    }

    @Override
    public ArrayList<String> getAllCards() {
        return communityChestCards;
    }

}



