public class App {
    public static void main(String[] args) {
        System.out.println("\n============================================\n");

        MoltOrder o1 = new MoltOrder("Yitzhak", "PIZZA", 5, 30, 5);
        MoltOrder o2 = new MoltOrder("Jacob", "STEAK", 10, 30, 1);
        MoltOrder o3 = new MoltOrder("Rivka", "HOTDOG", 12, 30, 3);
        MoltOrder o4 = new MoltOrder("Nadav", "POPCOREN", 3, 30, 2);
        MoltOrder o5 = new MoltOrder("Alice", "AVUKADO", 1, 30, 4);
        
        
        GeneralPurposeHeap h1 = new GeneralPurposeHeap<MoltOrder>(10);
        h1.insert(o5);
        h1.insert(o4);
        h1.insert(o3);
        h1.insert(o2);
        h1.insert(o1);
        h1.printHeap();
        System.out.println("\n============================================\n");
        System.out.println("The size of h1: " + h1.getSize() );
        System.out.println("\n============================================\n");
        System.out.println("The left child of index 0 is: " + h1.getLeftChildIndex(0) );
        System.out.println("The left child of index 1 is: " + h1.getLeftChildIndex(1) );
        System.out.println("The left child of index 2 is: " + h1.getLeftChildIndex(2) );
        System.out.println("The left child of index 3 is: " + h1.getLeftChildIndex(3) );
        
        // MoltDriver d1 = new MoltDriver(3, "Y", 5);
        // MoltDriver d2 = new MoltDriver(2, "J", 5);
        // MoltDriver d3 = new MoltDriver(1, "R", 5);
        // MoltDriver d4 = new MoltDriver(4, "N", 5);
        // MoltDriver d5 = new MoltDriver(0, "A", 5);
        // GeneralPurposeHeap h2 = new GeneralPurposeHeap<MoltDriver>(10);
        // System.out.println("The size of h1: " + h2.getSize() );


    }
}
