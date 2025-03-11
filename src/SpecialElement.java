//Board Space implementation for special elements
public class SpecialElement extends BoardElement {
    private Player owner;

    /**
     * Constructor for a special element
     * @param name String name of the element
     * @author Aidan Casey
     */
    public SpecialElement(String name) {
        super(name, SpaceType.INCOME_TAX);
        this.owner = null;

    }
    /**
     * Method gets the current owner
     * @return Player type owner
     * @author Aidan Casey
     */
    public Player getOwner() {
        return owner;
    }

    /**
     * Method sets the player as the owner
     * @param player Player on the space
     * @author Aidan Casey
     */
    public void setOwner(Player player) {
        owner = player;
    }

    /**
     * To be implemented for action upon player
     * @param player Player associated with the action
     * @author Aidan Casey
     */
    @Override
    public void triggerAction(Player player) {

    }
}





