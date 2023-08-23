<!-- Calculator
In this exercise we are going to write a simple calculator. All assignments are a continuation
of the previous ones, so don’t delete the code you’ve written. -->

<!-- Assignment 1 -->
<!-- Write 4 functions that each take 2 string arguments
and does a mathematical operation on
them:
a. public static double add(double num1, double num2)
b. public static double subtract(double num1, double num2)
c. public static double multiple (double num1, double num2)
d. public static double divide(double num1, double num2) -->

<!-- Assignment 2 -->
Write a function
public static double doOperation(double num1, String op, double num2)
that applies the given operation on the two given numbers using the functions you’ve written in
Assignment 1.
For example, calling: doOperation(5.0, “+”, 2.0) will apply the add function you wrote
in Assignment 1 and will return 7.0

<!-- Assignment 3 -->
Write a main function that receives at least three command-line arguments representing an
algebraic expression of the form num1 op num2 [op num3 ….] and calculates the result of the
expression.
For simplicity, evaluate the expression from left to right, ignoring any operating precedence.
For example:
java Calculator 5 + 5 * 3
30
Notice: The return value from above will return 30 as the result and not 20 since we ignore
operator precedence.