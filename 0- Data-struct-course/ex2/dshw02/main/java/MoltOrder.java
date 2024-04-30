/*
 * It is a generic class - heap class
 * Represent a details about molt delivery order.
 * represent a single order made by a customer.
 * 
 * @author - Yitzhak Bar or
 * @version - 27/04/24
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MoltOrder implements Comparable<MoltOrder> {
    // ============== fields ==============
    private String orderDescription;
    private String name;
    private int orderReadyTime;
    private int timeNeededToDeliver;
    private int priority;

    // ============== constructor ==============
    // done
    public MoltOrder(String name, String orderDescription, int orderReadyTime, int timeNeededToDeliver, int priority) {
        this.name = name;
        this.orderDescription = orderDescription;
        this.orderReadyTime = orderReadyTime;
        this.timeNeededToDeliver = timeNeededToDeliver;
        this.priority = priority;
    }

    // ============== toString ==============
    // done
    public String toString() {
        String str1 = getOrderDescription();
        String str2 = getName();
        String str3 = Integer.toString(getOrderReadyTime());
        String str4 = Integer.toString(getTimeNeededToDeliver());
        String str5 = Integer.toString(getPriority());
        String str = "Order Description: " + str1 + "\nName: " + str2 + "\nOrder Ready Time: " + str3
                + "\nTime Needed To Deliver: " + str4 + "\nPriority: " + str5;
        return str;
    }

    // ============== getter's ==============
    // done
    public int getOrderReadyTime() {
        return orderReadyTime;
    }

    // done
    public int getTimeNeededToDeliver() {
        return timeNeededToDeliver;
    }

    // done
    public int getPriority() {
        return priority;
    }

    // done
    public String getName() {
        return name;
    }

    // done
    public String getOrderDescription() {
        return orderDescription;
    }

    // ============== TODO - compareTo ==============
    // done
    public int compareTo(MoltOrder otherOrder) {
        if (this.priority < otherOrder.priority) {
            return -1;
        } else if (this.priority > otherOrder.priority) {
            return 1;
        } else {
            return 0;
        }
    }

    // public static void main(String[] args) {
    // MoltOrder order1 = new MoltOrder("Alice", "Pizza", 10, 30, 1);
    // System.out.println(order1);
    // }

} // end of the class