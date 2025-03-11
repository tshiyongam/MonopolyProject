//Board Space implementation for Properties
public class RailroadElement extends BoardElement{
    private final int price;
    private Player owner;
    /**
     * Constructor for a Property Element
     * @param name Name of the property
     * @param price Initial price of the property
     * @author Aidan Casey
     */
    public RailroadElement(String name, int price) {
        super(name, SpaceType.PROPERTY);
        this.price = price;
        this.owner = null;

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
     * @author Aidan Casey
     */
    @Override
    public void triggerAction(Player player) {

    }





}