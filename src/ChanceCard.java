import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ChanceCard extends BoardElement implements Card {

    private final ArrayList<String> chanceCards;
    private final Random rand;

    public ChanceCard(String name) {
        super(name, SpaceType.CHANCE);
        chanceCards = new ArrayList<>();
        rand = new Random();
        loadCards();
    }

    private void loadCards(){
        try {
            Scanner scanner = new Scanner(new File("texts/chance.txt"));
            while (scanner.hasNextLine())
                chanceCards.add(scanner.nextLine());
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String shuffledCard(Random rand, ArrayList<String> chanceCards) {
        int randomIndex = rand.nextInt(chanceCards.size());
        String drawnCard = chanceCards.get(randomIndex);

        if (drawnCard.equals("Get Out of Jail Free."))
            chanceCards.remove(randomIndex);

        return drawnCard;
    }

    @Override
    public String drawCard() {
        if(chanceCards.isEmpty())
            loadCards();
        return shuffledCard(rand, chanceCards);
    }

    @Override
    public void resetDeck(){
        chanceCards.clear();
        loadCards();
    }

    @Override
    public void triggerAction(Player player) {

    }
}