
/*
 * It is a generic class - heap class
 * Represent a details about molt delivery driver.
 *
 * @author - Yitzhak Bar or
 * @version - 27/04/24
 */

import java.util.*;

public class MoltDriver implements Comparable<MoltDriver> {
    // ============== fields ==============
    private int id; // unique id - employee number
    private String name; // driver name
    private int nextAvailableTimeForDelivery;

    // ============== constructor ==============
    // done
    public MoltDriver(int id, String name, int nextAvailableTimeForDelivery) {
        this.id = id;
        this.name = name;
        this.nextAvailableTimeForDelivery = nextAvailableTimeForDelivery;
    }

    // ============== Operator's of this ADT ==============
    // done
    public void incrementTotalOrdersDelivered() {
        this.nextAvailableTimeForDelivery++;
    }

    // ============== getter's ==============
    // done
    public int getNextAvailableTimeForDelivery() {
        return nextAvailableTimeForDelivery;
    }

    // done
    public String getName() {
        return name;
    }

    // done
    public int getId() {
        return id;
    }

    // ============== setter's ==============
    // done
    public void setNextAvailableTimeForDelivery(int time) {
        this.nextAvailableTimeForDelivery = time;
    }

    // ============== toString ==============
    // done
    public String toString() {
        String str1 = Integer.toString(getId());
        String str2 = getName();
        String str3 = Integer.toString(getNextAvailableTimeForDelivery());
        String str = "Id Driver: " + str1 + "\nName: " + str2 + "\nNext Available Time For Delivery: " + str3;
        return str;
    }

    // ============== compareTo ==============
    // done
    public int compareTo(MoltDriver otherDriver) {
        if (this.nextAvailableTimeForDelivery < otherDriver.nextAvailableTimeForDelivery) {
            return -1;
        } else if (this.nextAvailableTimeForDelivery > otherDriver.nextAvailableTimeForDelivery) {
            return 1;
        } else {
            return 0;
        }
    }

    // public static void main(String[] args) {
    // MoltDriver driver1 = new MoltDriver(208837278, "Yitzhak", 5);
    // System.out.println(driver1);
    // }

} // end of the class