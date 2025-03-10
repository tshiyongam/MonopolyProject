import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class TitleDeed {

    private static final HashMap<String, TitleDeed> deeds = new HashMap<>();
    private String name;
    private String color;
    private int basicRent;
    private int[] rentWithHouses;
    private int hotelRent;
    private int mortgageValue;
    private int houseCost;
    private int hotelCost;
    private int houseCount = 0;
    private boolean hasHotel = false;

    /**
     * Constructor for the TitleDeed class.
     * Author: Mael Tshiyonga
     */
    public TitleDeed() {
        try {
            Scanner scanner = new Scanner(new File("texts/titleDeeds.txt"));
            loadTitleDeeds(scanner);
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Method to get the TitleDeed object.
     * @param propertyName String representing the name of the property
     * @return TitleDeed object
     */
    public int getRent(TitleDeed propertyName) {
        if (hasHotel) return hotelRent;
        else if (houseCount > 0 && houseCount < 5) return rentWithHouses[houseCount - 1];
        else return basicRent;
    }

    //TODO: In addition to adding the house count, the cost of adding each house/hotel should be
    // deducted from the player's balance
    /**
     * Method to add a house to the property.
     * Author: Mael Tshiyonga
     */
    public void addHouse() {
        if (houseCount < 4 && !hasHotel) houseCount++;
    }

    /**
     * Method to add a hotel to the property.
     * Author: Mael Tshiyonga
     */
    public void addHotel() {
        if (houseCount == 4 && !hasHotel) {
            houseCount = 0;
            hasHotel = true;
        }
    }

    /**
     * Method to remove a house from the property.
     * Author: Mael Tshiyonga
     */
    public void removeHouse() {
        if (houseCount > 0 && !hasHotel) houseCount--;
    }

    /**
     * Method to remove a hotel from the property.
     * Author: Mael Tshiyonga
     */
    public void removeHotel() {
        if (hasHotel) {
            hasHotel = false;
            houseCount = 4;
        }
    }

    /**
     * Method to get the name of the property.
     * @return String representing the name of the property
     * Author: Mael Tshiyonga
     */
    public String getName() {
        return name;
    }

    /**
     * Method to get the color of the property.
     * @return String representing the color of the property
     * Author: Mael Tshiyonga
     */
    public String getColor() {
        return color;
    }

    /**
     * Method to get the number of houses on the property.
     * @return int representing the number of houses on the property
     * Author: Mael Tshiyonga
     */
    public int getHouseCount() {
        return houseCount;
    }

    /**
     * Method to check if the property has a hotel.
     * @return boolean representing if the property has a hotel
     * Author: Mael Tshiyonga
     */
    public boolean hasHotel() {
        return hasHotel;
    }

    /**
     * Method to get the mortgage value of the property.
     * @return int representing the mortgage value of the property
     * Author: Mael Tshiyonga
     */
    public int getMortgageValue() {
        return mortgageValue;
    }

    /**
     * Method to get the cost of adding a house to the property.
     * @return int representing the cost of adding a house to the property
     * Author: Mael Tshiyonga
     */
    public int getHouseCost() {
        return houseCost;
    }

    /**
     * Method to get the cost of adding a hotel to the property.
     * @return int representing the cost of adding a hotel to the property
     * Author: Mael Tshiyonga
     */
    public int getHotelCost() {
        return hotelCost;
    }


    /**
     * Method to load the Title Deeds from a text file.
     * @param scanner Scanner object
     * Author: Mael Tshiyonga
     */
    private void loadTitleDeeds(Scanner scanner) {
        while (scanner.hasNextLine()) {
            String[] titleDeed = scanner.nextLine().split(",");
            name = titleDeed[0];
            color = titleDeed[1];
            basicRent = Integer.parseInt(titleDeed[2]);
            rentWithHouses = new int[]{Integer.parseInt(titleDeed[3]), Integer.parseInt(titleDeed[4]),
                    Integer.parseInt(titleDeed[5]), Integer.parseInt(titleDeed[6])};
            hotelRent = Integer.parseInt(titleDeed[7]);
            mortgageValue = Integer.parseInt(titleDeed[8]);
            houseCost = Integer.parseInt(titleDeed[9]);
            hotelCost = Integer.parseInt(titleDeed[10]);
            deeds.put(name, this);
        }
    }
}
