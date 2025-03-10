//Board Space implementation for Properties
public class SpecialElement extends BoardElement {
    private Player owner;

    public SpecialElement(String name) {
        super(name, SpaceType.INCOME_TAX);
        this.owner = null;

    }


    public Player getOwner() {
        return owner;
    }


    public void setOwner(Player player) {
        owner = player;
    }

    @Override
    public void triggerAction(Player player) {

    }
}





