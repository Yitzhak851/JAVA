Control-Flow
Inputs
<!-- Exercise 1
Write a Java program that receives a single number as an argument. 
The program will print out "true" if the number is greater than 100 and divisible by 3. 
Otherwise, it should print out "false". -->

<!-- Exercise 2 -->
Write a program that receives three inputs – a number, 
a mathematical operation, and another number 
(For simplicity's sake, you may use "+", "*", "-", "/" as the operations, and the numbers may be integers). 
The program parses the input, does the mathematical calculation, and prints the result. 

NOTE: To check if 2 strings are equal, you must use myString1.equals(myString2). Example: 
public class Example {
	public static void main(String[] args) {
		String argument1 = args[0];
		String argument 2 = args[1];
//Will print ‘true’ if argument1 equals argument2, ‘false’ otherwise
		boolean areEqual = argument1.equals(argument2);
		System.out.println(areEqual);
	}
}

<!-- Exercise 3 -->
Extend the previous exercise to also include a “power of” (denoted “**”) operation.
