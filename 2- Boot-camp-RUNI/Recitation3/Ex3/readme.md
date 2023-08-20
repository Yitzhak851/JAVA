<!-- Numbers & Sequences
Primes, Fibonacci, Palindrome,… -->
<!-- Assignment 1 -->
<!-- Perfect number is a positive number that is equal to the sum of its proper divisors (i.e., the sum of its positive divisors excluding the number itself). 
For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number. 
The sum of the proper divisors of 24, however, would be 1 + 2 + 3 + 4 + 6 + 8 + 12 = 36, which means that 24 is not a perfect number.

Write a Java program that prints to the screen all the perfect numbers under 1000.

Use a method called isPrefectNumber(…) in your program. The method should receive as input a number and return a boolean stating whether the number is a perfect number. -->


<!-- Assignment 2 -->
The Fibonacci sequence is a sequence of integers where every number after the first two is the sum of the two preceding ones: 
	1, 1, 2, 3, 5, 8, 13, 21, …
Write a Java program that receives a number as an input and prints the Fibonacci sequence, stopping when the current number in the sequence is larger than the given input. 

For example, for n=50:
 
<!-- Assignment 3 -->
Write a method that receives an integer i representing an index and returns the i^th item in the Fibonacci sequence. Note that the first index is 0 and not 1.

<!-- Assignment 4 (BONUS) -->
A palindrome is a a word, phrase, or sequence that reads the same backward as forward. For example, “racecar” and “nurses run” are palindromes but “house” is not. 
For simplicity, we will only consider strings of a single word (i.e., you do not need to consider cases such as “nurses run”).

Write a Java program that receives as a command-line argument a single string representing a word and returns true if the word is a palindrome and false otherwise. 
Note: The actual check should be done in a separate method. 
Hint: Use str.length() to get the length of the string and str.charAt(i) to get the character at the ith index of the string. 

Example: 
> java Assignment5 racecar 
String racecar is a palindrome
> java Assignment5 house
String house is not a palindrome
