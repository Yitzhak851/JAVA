If-then-else Statements
Assignments and Operations

<!-- Assignment 1 -->
Given a number in the range 0-100 (inclusive), print the number of digits of the number.
You must use the modulo (%) operator.
For example, given the number 99, the program will print 2. Given the number 100, the program will print 3.

public class AssignmentOne {
	public static void main(String[] args) {
		int number = 17; 	// Holds the number
		// YOUR CODE		
	}
}

<!-- Assignment 2 -->
Given a number (integer): 
	If the number is outside of the range 0-100 inclusive, print "WOW".
	Otherwise, if it is a power of 10, print "SUCH POWER".
	Otherwise, if is a multiple of 7, print "MUCH LUCK".
	Otherwise, print "VERY CODE".

For example, for the number 49 the program will print “MUCH LUCK”.
For the number 101 the program will print “WOW”.

<!-- Assignment 3 -->
Given 2 numbers:
If the two numbers are equal, print “they are equal”.
Otherwise, if one of them is bigger than the other, print the larger of the two numbers.

For example, given the numbers 2 and 2 the program will print “equal”. Given the numbers 2 and 3 the program will print “3”.

<!-- Assignment 4 -->
A triangle is valid if the sum of lengths of any two sides is larger than the length of the third side. For example, the sides with lengths 5, 7 and 10 form a valid triangle:
5+7>10 - Triangle A
7+10>5 - Triangle B
5+10>7 - Triangle C
However, three sides with lengths 1, 4, and 7 do not form a valid triangle since 1+4<7.

Write a program that, given 3 numbers representing the lengths of the three sides: a, b and c, checks whether the sides can form a valid triangle.
If they can represent a valid triangle, print "Valid triangle". Otherwise, print "Invalid triangle".

For example, given the numbers 5, 7, 10, the program will print “Valid triangle”. However, given the numbers 1, 4, 7 the program will print “Invalid triangle”.

 
<!-- Assignment 5 -->
We are going to build a sentence generator that is based on the user's choice.
Observe the following program skeleton:

public class AssignmentFive {
	public static void main(String[] args) {
		// First section
		String word11 = "I";
		String word12 = "You";
		String word13 = "We";
		String word14 = "They";

		String word21 = "am";
		String word22 = "is";
		String word23 = "are";

		String word31 = "happy";
		String word32 = "sad";
		String word33 = "tired";
		String word34 = "thrilled!";

		// Second section
		int firstGroupChoice = 1;
		int secondGroupChoice = 1;
		int thirdGroupChoice = 1;

		// YOUR CODE		
	}
}

In the first section, there are String variables that store different words. They are identified by the following naming convention: word[group #][number #]
For example, the variable 'word23' is the third word from group number 2.

In the second section, there are variables that represent the user's choice.
Each variable corresponds to the user’s choice for each specific group. 
For example, the variable firstGroupChoice represents the user’s choice for the first group of words. 

Using if statements, print the correct sentence according to the user’s choice variables (i.e., firstGroupChoice, secondGroupChoice, thirdGroupChoice)
For example, given the values 1-1-1, the program will print "I am happy".
