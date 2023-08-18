// <!-- Assignment 6 (BONUS) -->
// Use a for loop to draw the following shape:
// 	54321|12345         >> (0 |1|  0)   >> (1)    --0     :i=5
// 	4321 |   1234       >> (1 |1|  3)   >> (5)    --1     :i=4
// 	321  |      123     >> (2 |1|  6)   >> (9)    --2     :i=3
// 	21   |         12   >> (3 |1|  9)   >> (13)   --3     :i=2
// 	1    |            1 >> (4 |1| 12)   >> (17)   --4     :i=1

public class Assignment36 {
        public static void main(String[] args) {
            int n = Integer.parseInt(args[0]);// user put 5
            for (int i = n; i >= 0; i--) {//Run to build rows    (i=5) i:-- /n || (i=4)i:-- /n  ||(i=3) i:-- /n
                for (int j = i; j >= 1; j--) {//Run to build "*" (i=5) j:5-1   || (i=4)j:4-1    ||(i=3) 3-1
                    System.out.print(j);  //                    print: 54321   ||  print: 4321  ||  print: 321
                }
                //
                for(int b=i; b<=n; b++){ //     (b=5) 5<=5 b>6/n || (b=4) 4<=5  ||(b=3) 3<=5 
                    while(b<n){System.out.print("   ");b++;}
                    System.out.print(" ");// print "O"    ||  print "OOOO"    ||  print "OOOOOOOO"
                }
                //
                for (int z=1; z<=i; z++){  //Run to build  (i=5) p: 1<=5  || (i=4) p: 1<=4   ||(1) 1-3
                    System.out.print(z);   //              print: 12345   || print: 1234 
                }
                System.out.println();// new line
            }
        }
    }