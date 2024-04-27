/*
 * It is a generic class - heap class
 * Represent a details about molt delivery order.
 * represent a single order made by a customer.
 * 
 * @author - Yitzhak Bar or
 * @version - 27/04/24
 */

//import java.util.ArrayList;
//import java.util.List;

public class MoltOrder {
    // ============== fields ==============
    String orderDescription;
    String name;
    int orderReadyTime;
    int timeNeededToDeliver;
    int priority;

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
        if (this.getPriority() < otherOrder.getPriority()) {
            return -1;
        } else if (this.getPriority() > otherOrder.getPriority()) {
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