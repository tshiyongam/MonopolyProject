public class PropertyElement extends BoardElement{
    private final int price;
    private final int rent;
    private Player owner;

    public PropertyElement(String name, int price, int rent){
        super(name, SpaceType.PROPERTY);
        this.price = price;
        this.rent = rent;
        this.owner = null;
    }

    public int getPrice(){
        return price;
    }

    public int getRent(){
        return rent;
    }

    public Player getOwner(){
        return owner;
    }

    public void setOwner(Player player){
        owner = player;
    }

    @Override
    public void triggerAction(Player player){
        if(owner == null)
            player.offerToBuyProperty(this);
        else if(owner != player)
            player.payRent(owner, rent);
    }
}
