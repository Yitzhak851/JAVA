/*
 * It is a generic class - heap class
 * Represent a details about molt delivery driver.
 * 
 * @author - Yitzhak Bar or
 * @version - 27/04/24
 */

public class MoltDriver {
    // fields
    int id; // unique id - employee number
    String name; // driver name
    int nextAvailableTimeForDelivery;

    // Consructor of MoltDriver object
    public MoltDriver(int id, String name, int nextAvailableTimeForDelivery) {
        this.id = id;
        this.name = name;
        this.nextAvailableTimeForDelivery = nextAvailableTimeForDelivery;
    }

    // Operator's of this ADT
    public void incrementTotalOrdersDelivered() {
        //
    }

    public int getNextAvailableTimeForDelivery() {
        int AvailableTimeForDelivery = 0;
        return AvailableTimeForDelivery;
    }

    public void setNextAvailableTimeForDelivery(int time) {
        //
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "";
    }

    public int compareTo(MoltDriver otherDriver) {
        return -1;
    }

}
