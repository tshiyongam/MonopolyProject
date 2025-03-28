package Model;

//Board Space implementation for utilities
public class Utilities extends BoardElement {
    private final int price;
    private Player owner;

    /**
     * Constructor for a Utility Element
     * @param name name of the Utility
     * @param price price of the Utility
     * @author Aidan Casey
     */
    public Utilities(String name, int price) {
        super(name, SpaceType.INCOME_TAX);
        this.price = price;
        this.owner = null;
    }

    /**
     * Method to get owner of the utility
     * @return Model.Player owner of utility
     * @author Aidan Casey
     */

    public Player getOwner() {
        return owner;
    }

    /**
     * Method to get the price of the utility.
     * @return int price of the utility
     * @author Aidan Casey
     */

    public Integer getPrice() {
        return price;
    }

    /**
     * Method to set the owner of a utility.
     * @param player Model.Player owner of the utility.
     * @author Aidan Casey
     */
    public void setOwner(Player player) {
        owner = player;
    }

    /**
     * Method to be implemented which triggers action upon a player
     * @param player Model.Player being acted upon
     * @param banker Model.Banker object to be used in the action
     * @author Aidan Casey
     */
    @Override
    public void triggerAction(Player player, Banker banker) {

    }
}
