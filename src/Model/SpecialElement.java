package Model;

//Board Space implementation for special elements
public class SpecialElement extends BoardElement {
    private Player owner;

    /**
     * Constructor for a special element
     * @param name String name of the element
     * @author Aidan Casey
     */
    public SpecialElement(String name, SpaceType type) {
        super(name, type);
        this.owner = null;

    }
    /**
     * Method gets the current owner
     * @return Model.Player type owner
     * @author Aidan Casey
     */
    public Player getOwner() {
        return owner;
    }

    /**
     * Method sets the player as the owner
     * @param player Model.Player on the space
     * @author Aidan Casey
     */
    public void setOwner(Player player) {
        owner = player;
    }

    /**
     * Handles actions for the special spaces
     * @param player Model.Player associated with the action
     * @param banker Model.Banker object to be used in the action
     * @author Connor Moyer
     */
    @Override
    public void triggerAction(Player player, Banker banker) {
        switch (getType()) {
            case GO:
                player.receiveMoney(200);
                System.out.println(player.getName() + " collected $200 for passing GO.");
                break;
            case JAIL:
                System.out.println(player.getName() + " is just visiting Jail.");
                break;
            case GOTO_JAIL:
                player.goToJail();
                System.out.println(player.getName() + " is sent to Jail!");
                break;
            case FREE_PARKING:
                System.out.println(player.getName() + " landed on Free Parking.");
                break;
            default:
                System.out.println("Error: Unexpected space type for SpecialElement.");
                break;
        }
    }
}





