// Write a Java program that can print four types of smiley faces. 
// The smiley will be printed according to the user’s choice (i.e., an integer 1 – 4)
// 1.	Smiling [ :-) ]
// 2.	Winking [ ;-) ]
// 3.	Confused [ :-/ ]
// 4.	Frowning [ :-( ].
// Use a method called printSmiley(…) that receives as an argument an integer 
// representing the type of smiley to be printed. 

public class Assignment322 {
    public static void main(String[] args) {
        System.out.println("Hello, this program can print 4 types of smiley faces. ");
        System.out.println("please choice integer num betwwen:" + "1-4");
        int n = Integer.parseInt(args[0]);
        System.out.print("Your coice is: ");
        printSmiley(n);
    }

    public static void printSmiley(int x) {
        if (x == 1) {
            System.out.println("Smiling [ :-) ]");
        } else if (x == 2) {
            System.out.println("Winking [ ;-) ]");
        } else if (x == 3) {
            System.out.println("Confused [ :-/ ]");
        } else if (x == 4) {
            System.out.println("Frowning [ :-( ]");
        } else {
            System.out.println("Please insert num between 1-4 !");
        }
    }
}
