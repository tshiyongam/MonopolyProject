import java.util.HashSet;
import java.util.Set;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player playerOne = new Player("Player 1", TokenType.DOG);
        Player playerTwo = new Player("Player 2", TokenType.HAT);
        GameBoard gameBoardOne = new GameBoard();
        playerOne.takeTurn(gameBoardOne);
        playerTwo.takeTurn(gameBoardOne);

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

        // Test space to show BoardElement functionality
        BoardElement space = new BoardElement("Boardwalk", SpaceType.PROPERTY) {
            @Override
            public void triggerAction(Player player) {
                // Implement action when a player lands on this space
                System.out.println(player.getName() + " landed on " + getName());
            }
        };

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