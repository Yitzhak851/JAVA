public class MoltDriver implements Comparable<MoltDriver>{
    private final int id;

    private final String name;

    private int totalOrdersDelivered;

    private int nextAvailableTimeForDelivery;

    public MoltDriver(int id, String name, int nextAvailableTimeForDelivery) {
        this.id = id;
        this.name = name;
        totalOrdersDelivered = 0;
        this.nextAvailableTimeForDelivery = nextAvailableTimeForDelivery;
    }

    public void incrementTotalOrdersDelivered() {
        totalOrdersDelivered++;
    }

    public int getNextAvailableTimeForDelivery() {
        return nextAvailableTimeForDelivery;
    }

    public void setNextAvailableTimeForDelivery(int time) {
        nextAvailableTimeForDelivery = time;
    }

    public String getName() {
        return name;
    }

    /**
     * Returns a textual representation of this Molt Driver.
     * The output string should be in the format:
     * <name>, ID number: <id>, deliveries: <totalOrdersDelivered>
     * "John Doe, ID number: 14, deliveries: 3
     */
    public String toString() {
        return String.format("%s, ID number: %d, deliveries: %d", name, id, totalOrdersDelivered);
    }

    @Override
    public int compareTo(MoltDriver otherDriver) {
        if (otherDriver == null) {
            return -1;
        }
        return Integer.compare(this.nextAvailableTimeForDelivery, otherDriver.nextAvailableTimeForDelivery);
    }
}
