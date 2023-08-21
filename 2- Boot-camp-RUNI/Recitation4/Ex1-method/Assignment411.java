// follows:
// (1)The cow goes “moo”, (2)the dog goes “woof”, (3)the sheep goes “meh” and (4) the crocodile is silent.
// The for each animal should be done in separate methods. In particular, in your main
// function, you should call one of four methods that will print the animal sounds to the screen.
// Running examples:
// >> run Assignment1 dog
// The dog goes woof
// >> run Assignment1 pikachu
// Sorry, we don't have that animal in stock.


public class Assignment411 {
    public static String cow(int a) {
        
    }
        public static String dog(int a) {
        
    }
        public static String sheep(int a) {
        
    }
        public static String crocodile(int a) {
        
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); //get from the user 1-4 
        if(n==1){

        } else if(n==2){

        }else if(n==3){
            
        } else if(n==4){
            
        }else if(n<1 && n>4){
            System.out.println("Sorry, we don't have that animal in stock.");
        }
    }
}
