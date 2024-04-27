// represent a single order made by a customer

public class MoltOrder {
    // fields - stores details about what is being ordered from
    String orderDescription;
    String name;
    int orderReadyTime;
    int timeNeededToDeliver;
    int priority;

    public MoltOrder(String name, String orderDescription, int orderReadyTime, int timeNeededToDeliver, int priority) {
        //
    }

    public String toString() {
        String str = "";
        return str;
    }

    // getter's
    public int getOrderReadyTime() {
        return orderReadyTime;
    }

    public int getTimeNeededToDeliver() {
        return timeNeededToDeliver;
    }

    public String getName() {
        return name;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public int compareTo(MoltOrder otherOrder) {
        return -1;
    }

}// end of the class