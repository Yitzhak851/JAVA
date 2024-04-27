// represent a molt delivery driver

public class MoltDriver {
    // fields
    int id; // unique id - employee number
    String name;  // drivers name
    int nextAvailableTimeForDelivery;

    // Consructor's
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

    public void setNextAvailableTimeForDelivery(int time){

    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return "";
    }

    public int compareTo(MoltDriver otherDriver){
        
    }

}
