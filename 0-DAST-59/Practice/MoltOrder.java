public class MoltOrder implements Comparable<MoltOrder> {

    private final int priority;

    private final int orderReadyTime;

    private final int timeNeededToDeliver;

    private final String name;

    private final String orderDescription;

    public MoltOrder(
            String name, String orderDescription, int orderReadyTime, int timeNeededToDeliver, int priority) {
        this.name = name;
        this.orderDescription = orderDescription;
        this.orderReadyTime = orderReadyTime;
        this.timeNeededToDeliver = timeNeededToDeliver;
        this.priority = priority;
    }

    /**
     * Returns a textual representation of this Molt order.
     * The output string should be in the format:
     * <name>, <foodDescription>, <foodReadyTime>
     * For example an order of burgers by John Doe that will be ready at time 100 would return
     * "John Doe, burgers, 100".
     */
    public String toString() {
        return String.format("%s, %s, %d", name, orderDescription, orderReadyTime);
    }

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

    @Override
    public int compareTo(MoltOrder otherOrder) {
        if (otherOrder == null) {
            return -1;
        }
        return Integer.compare(this.priority, otherOrder.priority);
    }
}
