// Class that manages the Title Deeds of the properties on the Monopoly board
public class PropertyElement extends BoardElement {
    private final int price;
    private final int rent;
    private Player owner;

    /**
     * Constructor for a property element
     * @param name Name of the property
     * @param price Price of the property
     * @param rent Rent of the property
     * @author Mael Tshiyonga
     */
    public PropertyElement(String name, int price, int rent) {
        super(name, SpaceType.PROPERTY);
        this.price = price;
        this.rent = rent;
        this.owner = null;
    }

    /**
     * Method to get the price of the property
     * @return int representing the price of the property
     * @author Mael Tshiyonga
     */
    public int getPrice(){
        return price;
    }

    /**
     * Method to get the rent of the property
     * @return int representing the rent of the property
     * @author Mael Tshiyonga
     */
    public int getRent(){
        return rent;
    }

    /**
     * Method to get the owner of the property
     * @return Player representing the owner of the property
     * @author Mael Tshiyonga
     */
    public Player getOwner() {
        return owner;
    }

    /**
     * Method to set the owner of the property
     * @param player Player representing the new owner of the property
     * @author Mael Tshiyonga
     */
    public void setOwner(Player player) {
        owner = player;
    }

    /**
     * Method to allow the user to interact with the property
     * @param player Player representing the new owner of the property
     * @author Mael Tshiyonga
     */
    @Override
    public void triggerAction(Player player) {
        /*if(owner == null)
            player.offerToBuyProperty(this);
        else if(owner != player)
            player.payRent(owner, rent);*/
    }
}

