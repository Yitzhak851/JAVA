public class Assignment522 {
    public static String cards(int a) {
        String [] arrOfNum ={"Ace","2","3","4","5","6","7","8","9","10","Jack", "Queen", "King"};
        String [] arrOfSuits ={"Clubs", "Diamonds", "Hearts" , "Spades"};        
        int x= (int)((Math.random())*4);
        String str = arrOfNum[a] + " of " + arrOfSuits[x] ;
        return str;
    }
    public static void main(String[] args) {
        System.out.println(cards((int)((Math.random())*13)));
        System.out.println(cards((int)((Math.random())*13)));
    }
}
