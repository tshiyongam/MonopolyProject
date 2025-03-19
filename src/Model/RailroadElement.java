package Model;

//Board Space implementation for Railroads
public class RailroadElement extends BoardElement {
    private final int price;
    private Player owner;
    private int[] rentLevel;
    private int mortgage;
    /**
     * Constructor for a Property Element
     * @param name Name of the property
     * @param price Initial price of the property
     * @author Aidan Casey
     */
    public RailroadElement(String name, int price, int[] rentLevel,int mortgage) {
        super(name, SpaceType.PROPERTY);
        this.price = price;
        this.owner = null;
        this.rentLevel = rentLevel;
        this.mortgage = mortgage;

    }
    /**
     * Getter for the owner of a railroad
     * @return current owner of the railroad
     * @author Aidan Casey
     */

    public Player getOwner() {
        return owner;
    }

    /**
     * Getter for the initial price of the Railroad
     * @return price of the railroad
     * @author Aidan Casey
     */

    public Integer getPrice() {
        return price;
    }
    /**
     * Setter for the owner of a railroad
     * @param player the current owner of the railroad
     * @author Aidan Casey
     */

    public void setOwner(Player player){
        owner = player;
    }

    /**
     * To be used for action
     * @param player player which the action will act upon
     * @param banker Model.Banker object to be used in the action
     * @author Aidan Casey
     */
    @Override
    public void triggerAction(Player player, Banker banker) {

    }





}