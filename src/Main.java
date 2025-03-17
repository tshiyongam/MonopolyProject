import java.util.HashSet;
import java.util.Set;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ChanceCard chanceCard = new ChanceCard("Chance");
        Set<String> outcomes = new HashSet<>();
        for (int i = 0; i < 16; i++)
            outcomes.add(chanceCard.drawCard());
        for (String outcome : outcomes)
            System.out.println(outcome);

        CommunityChestCard communityChestCard = new CommunityChestCard("CommunityChest");
        Set<String> outcomes2 = new HashSet<>();
        for (int i = 0; i < 16; i++)
            outcomes2.add(communityChestCard.drawCard());
        for (String outcome : outcomes2)
            System.out.println(outcome);
    }
}