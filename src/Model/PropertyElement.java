package Model;

// Class that manages the Title Deeds of the properties on the Monopoly board
public class PropertyElement extends BoardElement {
    private final String color;
    private final int price;
    private final int[] rentLevels; // Rent with 0-4 houses and with a hotel
    private final int mortgageValue;
    private final int houseCost;
    private final int hotelCost;
    private int numberOfHouses;
    private int numberOfHotels;
    private boolean isMortgaged;
    private Player owner;

    /**
     * Constructor for a property element
     * @param name Name of the property
     * @param price Price of the property
     * @param rentLevels Rent of the property
     * @author Mael Tshiyonga
     */
    public PropertyElement(String name, String color, int price, int[] rentLevels, int mortgageValue,
                           int houseCost, int hotelCost) {
        super(name, SpaceType.PROPERTY);
        this.color = color;
        this.price = price;
        this.rentLevels = rentLevels;
        this.mortgageValue = mortgageValue;
        this.houseCost = houseCost;
        this.hotelCost = hotelCost;
        this.numberOfHouses = 0;
        this.numberOfHotels = 0;
        this.isMortgaged = false;
        this.owner = null;
    }



    /**
     * Method to get the price of the property
     * @return int representing the price of the property
     * @author Mael Tshiyonga
     */
    public int getPrice() {
        return price;
    }

    /**
     * Method to get the rent of the property
     * @return int representing the rent of the property
     * @author Mael Tshiyonga
     */
    public int[] getRent() { return rentLevels; }

    /**
     * Method to get the owner of the property
     * @return Model.Player representing the owner of the property
     * @author Mael Tshiyonga
     */
    public Player getOwner() {
        return owner;
    }

    /**
     * Method to set the owner of the property
     * @param player Model.Player representing the new owner of the property
     * @author Mael Tshiyonga
     */
    public void setOwner(Player player) {
        owner = player;
    }

    /**
     * Method to get the color of the property
     * @return Color of the current property
     * @author Aidan Casey
     */
    public String getColor() { return color; }

    /**
     * Method to get the mortgage value of a property
     * @return Mortgage value of the current property.
     * @author Aidan Casey
     */
    public int getMortgageValue() { return mortgageValue; }

    /**
     * Method to get the cost of a single house
     * @return House cost for a property
     * @author Aidan Casey
     */
    public int getHouseCost() { return houseCost; }

    /**
     * Method to get the Hotel cost of a property
     * @return Cost of a Hotel for a property
     * @author Aidan Casey
     */
    public int getHotelCost() { return hotelCost; }

    /**
     * Method to get the number of houses on a property
     * @return Number of houses at a property
     * @author Aidan Casey
     */
    public int getNumberOfHouses() { return numberOfHouses; }
    /**
     * Method to get the number of hotels on a property
     * @return Number of hotels at a property
     * @author Aidan Casey
     */
    public int getNumberOfHotels() { return numberOfHotels; }

    /**
     * Method to check if a property is mortgaged
     * @return
     */
    public boolean isMortgaged() { return isMortgaged; }
    /**
     * Method to allow the user to interact with the property
     * @param player Model.Player representing the new owner of the property
     * @param banker Model.Banker object to be used in the action
     * @author Mael Tshiyonga
     */


    @Override
    public void triggerAction(Player player, Banker banker) {
        /*if(owner == null)
            player.offerToBuyProperty(this);
        else if(owner != player)
            player.payRent(owner, rent);*/
    }
}

