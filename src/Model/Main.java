package Model;

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
        System.out.println("All Chance Model.Card Outcomes Printed.");
        for (String outcome : outcomes)
            System.out.println(outcome);
        System.out.println("All Community Chest Model.Card Outcomes Printed.");

        CommunityChestCard communityChestCard = new CommunityChestCard("CommunityChest");
        Set<String> outcomes2 = new HashSet<>();
        for (int i = 0; i < 16; i++)
            outcomes2.add(communityChestCard.drawCard());
        for (String outcome : outcomes2)
            System.out.println(outcome);

        // Test space to show Model.BoardElement functionality
        PropertyElement space = new PropertyElement("Boardwalk",400,50);
        space.triggerAction(new Player("Connor", TokenType.BATTLESHIP), new Banker());

        Token token1 = new Token(TokenType.BOOT);
        Token token2 = new Token(TokenType.CAR);

        System.out.println("Created Board Space: " + space.getName());
        System.out.println("Space Type: " + space.getType());

        space.addToken(token1);
        space.addToken(token2);
        System.out.println("Tokens after adding:");
        for (Token token : space.getTokens()) {
            System.out.println(token.getType());
        }

        space.removeToken(token1);
        System.out.println("Tokens after removing " + token1.getType() + ":");
        for (Token token : space.getTokens()) {
            System.out.println(token.getType());
        }
    }
}