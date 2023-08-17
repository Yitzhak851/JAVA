Arrays Declarations, iterations, simple operations…
Assignment 1
Write a program which iterates an integer array and returns the maximum element in that array.
Fill in the values in the array at declaration (e.g., int[] arr = {1, 2, 3})
In addition, print each number of the array followed by the maximum element in the form shown
in the example below.
Example Output:
The numbers are:
7, 15, 3, 6, 99, 64
The maximum is: 99

Assignment 2
Write a program that takes an integer num and creates an array of size num in which each
element is equal to the factorial of its position.
For example, for num=6 the program creates the array:
{1, 1, 2, 6, 24, 120}.
To create an array of size num, use the following line: int[] factorials = new int [num];
Example Output (for num=5)
The factorials are:
0! = 1
1! = 1
2! = 2
3! = 6
4! = 24
5! = 120


Assignment 3
Write a program that receives two arguments: an integer ‘num’ and an array.
The program prints all the number pairs whose sum equals to ‘num’.
For example:
• if num=5 and array={1,2,3,4,5,6} then the program will print: (1, 4) (2, 3).
• if num=4 and array={1,2,3,4,5,6} then the program will print: (1, 3) (2, 2).
• if num=1 and array={1,2,3,4,5,6} then the program will print “no pairs”.
Clarification: the user should declare the variable num and array to values of his/her choice in
the main. That is, the variables should not be passed as command line arguments.
Note: If no such pairs exist, print “no pairs”