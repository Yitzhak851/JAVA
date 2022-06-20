import java.util.Scanner;// import the class Scanner
public class BMICalculator
{

     public static void main (String[] args) 
     {
        //declartion
        double weight, height ;  
        
        //create scanner class
        Scanner scan = new Scanner(System.in);// create
            
        //output
        System.out.println("Please enter your height");  
        
        //input
        height = scan.nextDouble(); 
        
        //output
        System.out.println("Please enter yout weight");
        
        //input
        weight = scan.nextDouble(); 

        //calculation
        double calculatedIndex = weight / Math.pow(height,2); 

        System.out.println("The Budy Mass index is: "+ calculatedIndex);  

     }    

}