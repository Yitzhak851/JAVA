public class Assignment522 {
    public static String cards() {
        String [] arrOfNum ={"Ace","2","3","4","5","6","7","8","9","10","Jack", "Queen", "King"};
        String [] arrOfSuits ={"Clubs", "Diamonds", "Hearts" , "Spades"};        
        int suitIndex = (int)((Math.random())*4);
        int numIndex = (int)((Math.random())*13);
        String suit = arrOfSuits[suitIndex];
        String num = arrOfNum[numIndex];
        return (num + " of " + suit);
    }
    public static void main(String[] args) {
        System.out.println(cards());
        System.out.println(cards()); 
    }
}
