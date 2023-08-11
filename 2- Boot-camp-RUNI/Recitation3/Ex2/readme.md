Functions
Void, Value return and more
<!-- Assignment 1 -->
Write a Java program that prints to the screen 10 rows of asterisk characters (*) in ascending order as follows: 
*
**
***
****
*****
******
*******
********
*********
**********

To do so, use a method named printStarRow(...) that receives an integer and prints to the screen a corresponding number of asterisk characters. This function should be used 10 times (once per row).
For example, given the input “5”, the expected output of printStarRow(5) is:
*****


<!-- Assignment 2 -->
Write a Java program that can print four types of smiley faces. The smiley will be printed according to the user’s choice (i.e., an integer 1 – 4)
1.	Smiling [ :-) ]
2.	Winking [ ;-) ]
3.	Confused [ :-/ ]
4.	Frowning [ :-( ].
Use a method called printSmiley(…) that receives as an argument an integer representing the type of smiley to be printed. 
 
<!-- Assignment 3 -->
A prime number (מספר ראשוני) is a number greater than 1 whose only whole-number factors are 1 and itself. For example, 5 is prime because it only divides in 5 and 1.
Write a function that receives as input an integer number, and returns true if the number is prime and false otherwise.
Then, using the previous function, write a program that prints all the prime numbers between 2 and an integer number (which is given as a command line argument).
Example output: 
  

<!-- Assignment 4 (BONUS) -->
Write a Java program that prints the number of words in a given string passed as a command-line argument. The counting of words should be done in a separate method which receives as input a String and outputs an integer representing the number of words in the given string. 

Hint: Use str.charAt(i) == ‘ ‘ to check if the character at the ith index in the string str is a space. 
Note: Assume that the last word is not followed by a space. 

Example:
> java Assignment 5 “The quick brown fox jumps over the lazy dog”
Number of words in the string: 9
