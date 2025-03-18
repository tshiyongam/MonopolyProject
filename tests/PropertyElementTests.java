import Model.Banker;
import Model.Player;
import Model.PropertyElement;
import Model.TokenType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
// Tests for the Model.PropertyElement class
public class PropertyElementTests {

    /**
     * Test method for testing compiler.
     * @author Mael Tshiyonga
     */
    @Test
    public void testNothing() {

    }

    /**
     * Test method for testing the constructor of the Model.PropertyElement class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testPropertyElement() {
        PropertyElement propertyElement = new PropertyElement("Moravian University", 50, 20);
        assertEquals("Moravian University", propertyElement.getName());
    }

    /**
     * Test method for testing the getPrice method in the Model.PropertyElement class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testGetPrice() {
        PropertyElement propertyElement = new PropertyElement("Moravian University", 50, 20);
        assertEquals(50, propertyElement.getPrice());
    }

    /**
     * Test method for testing the getRent method in the Model.PropertyElement class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testGetRent() {
        PropertyElement propertyElement = new PropertyElement("Moravian University", 50, 20);
        assertEquals(20, propertyElement.getRent());
    }

    /**
     * Test method for testing the getOwner method in the Model.PropertyElement class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testGetOwner() {
        PropertyElement propertyElement = new PropertyElement("Moravian University", 50, 20);
        assertNull(propertyElement.getOwner());
    }

    /**
     * Test method for testing the setOwner method in the Model.PropertyElement class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testSetOwner() {
        PropertyElement propertyElement = new PropertyElement("Moravian University", 50, 20);
        Player player = new Player("Mael", TokenType.CAR);
        propertyElement.setOwner(player);
        assertEquals(player, propertyElement.getOwner());
    }

    /**
     * Test method for testing the triggerAction method in the Model.PropertyElement class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testTriggerAction() {
        PropertyElement propertyElement = new PropertyElement("Moravian University", 50, 20);
        Player player = new Player("Mael", TokenType.BATTLESHIP);
        propertyElement.triggerAction(player, new Banker());
        //assertEquals(player, propertyElement.getOwner());
    }

}
