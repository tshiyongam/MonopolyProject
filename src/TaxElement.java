//Board Space implementation for tax elements
public class TaxElement extends BoardElement{
    private final int price;
    private Player owner;

    /**
     * Constructor for a Tax Element
     * @param name String name of the element
     * @param price int price of tax
     * @author Aidan Casey
     */
    public TaxElement(String name, int price) {
        super(name, SpaceType.INCOME_TAX);
        this.price = price;
        this.owner = null;

    }

    /**
     * Method to get the current player
     * @return current player on space
     * @author Aidan Casey
     */
    public Player getOwner() {
        return owner;
    }

    /**
     * Method to get the price
     * @return int price of tax
     * @author Aidan Casey
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * Method to set the current player
     * @param player Player being set
     * @author Aidan Casey
     */
    public void setOwner(Player player){
        owner = player;
    }

    /**
     * Trigger action to be implemented
     * @param player The player who landed on the space.
     * @param banker The banker object to be used in the action.
     * @author Aidan Casey
     */
    @Override
    public void triggerAction(Player player, Banker banker) {

    }





}