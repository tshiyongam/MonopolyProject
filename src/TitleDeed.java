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

    public TitleDeed() {
        try {
            Scanner scanner = new Scanner(new File("texts/titleDeeds.txt"));
            loadTitleDeeds(scanner);
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public int getRent(TitleDeed propertyName) {
        if (hasHotel) return hotelRent;
        else if (houseCount > 0 && houseCount < 5) return rentWithHouses[houseCount - 1];
        else return basicRent;
    }

    //TODO: In addition to adding the house count, the cost of adding each house/hotel should be
    // deducted from the player's balance
    public void addHouse() {
        if (houseCount < 4 && !hasHotel) houseCount++;
    }

    public void addHotel() {
        if (houseCount == 4 && !hasHotel) {
            houseCount = 0;
            hasHotel = true;
        }
    }

    public void removeHouse() {
        if (houseCount > 0 && !hasHotel) houseCount--;
    }

    public void removeHotel() {
        if (hasHotel) {
            hasHotel = false;
            houseCount = 4;
        }
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getHouseCount() {
        return houseCount;
    }

    public boolean hasHotel() {
        return hasHotel;
    }

    public int getMortgageValue() {
        return mortgageValue;
    }

    public int getHouseCost() {
        return houseCost;
    }

    public int getHotelCost() {
        return hotelCost;
    }


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
        }
    }
}
