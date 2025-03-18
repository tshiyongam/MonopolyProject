package Model;

/**
 * Constructor for a Model.Dice Element
 * @author Vicente Rivera
 */
public class Dice {
    public int Roll () {
        return (int) (Math.random() * 6) + 1;
    }
}
