import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Responsible for managing the bank's resources and handling the transactions with players.
public class Banker {

    private int houseCount;
    private int hotelCount;
    private Map<String, PropertyElement> titleDeeds;
    private ArrayList<Player> players;


    /**
     * Constructor for a Banker Element
     * @author Mael Tshiyonga
     */
    Banker() {
        this.titleDeeds = new HashMap<>();
        houseCount = 32;
        hotelCount = 32;
    }

    /**
     * Method that charges a player a certain amount of money.
     * @param player Player getting charged
     * @param amount Amount the player is getting charged
     * @author Mael Tshiyonga
     */
    public void chargePlayer(Player player, int amount) {
        if (player.canPay(amount)) {
            player.payMoney(amount);
            System.out.println(player.getName() + " has been charged $" + amount + " dollars.");
        }
        else {
            // TODO: Implement a bankruptcy system
        }
    }

    /**
     * Method that pays a player a certain amount of money.
     * @param player Player getting paid
     * @param amount Amount the player is getting paid
     * @author Mael Tshiyonga
     */
    public void payPlayer(Player player, int amount) {
        player.receiveMoney(amount);
        System.out.println(player.getName() + " has been paid $" + amount + " dollars.");
    }

    /**
     * Method that charges a player a certain amount of money.
     * @param player Player getting charged
     * @param amount Amount the player is getting charged
     * @param titleDeed TitleDeed object representing the property the player is buying
     * @author Mael Tshiyonga
     */
    public void buyProperty(Player player, int amount, PropertyElement titleDeed) {
        if (player.canPay(amount)) {
            player.payMoney(amount);
            player.addProperty(titleDeed);
            System.out.println(player.getName() + " has bought " + titleDeed.getName() + " for $" + amount + " dollars.");
        }
        else {
            System.out.println(player.getName() + " does not have enough money to buy " + titleDeed.getName() + ".");
            // TODO: Introduce a bankruptcy system
        }
    }

    /**
     * Method that sells a property to the bank.
     * @param player Player selling the property
     * @param titleDeed TitleDeed object representing the property the player is selling
     * @author Mael Tshiyonga
     */
    public void sellProperty(Player player, PropertyElement titleDeed) {
        player.receiveMoney(titleDeed.getPrice());
        player.removeProperty(titleDeed);
        if (hotelCount > 0) hotelCount++;
        if (houseCount > 0) houseCount += houseCount;
        System.out.println(player.getName() + " has sold " + titleDeed.getName() + " for $" + titleDeed.getPrice() + " dollars.");
    }

    /**
     * Method that mortgages a property.
     * @param player Player mortgaging the property
     * @param titleDeed TitleDeed object representing the property the player is mortgaging
     * @author Mael Tshiyonga
     */
    public void mortgageProperty(Player player, PropertyElement titleDeed) {
        player.receiveMoney(titleDeed.getPrice() / 2);
        player.mortgageProperty(titleDeed);
        System.out.println(player.getName() + " has mortgaged " + titleDeed.getName() + " for $" + titleDeed.getPrice() / 2 + " dollars.");
    }

    /**
     * Method that gets an ArrayList of players.
     * @return ArrayList of players in the game
     * @author Mael Tshiyonga
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * Method that gets the house count.
     * @return House count
     * @author Mael Tshiyonga
     */
    public int getHouseCount() {
        return houseCount;
    }

    /**
     * Method that gets the hotel count.
     * @return Hotel count
     * @author Mael Tshiyonga
     */
    public int getHotelCount() {
        return hotelCount;
    }

}
