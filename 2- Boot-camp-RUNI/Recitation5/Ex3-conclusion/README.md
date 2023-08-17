Conclusion
Assignment 1
Write a function that accepts 2 integer arrays. The function will return a new array of type int,
containing all the numbers which are present in both input arrays. That is, we return the
intersection of the two arrays.
Then, in your main you should call this function you wrote to print the intersection elements of
the arrays.
Clarifications:
• Assume that there are no duplicate elements in an array (e.g., {1, 1, 2} is not a valid
array)
• Initialize the two arrays in your main function.
• Assume that the lengths of the two arrays are equal
Note: your main function should print only the numbers which are in both arrays – no trailing
zeroes are allowed.
Example: (For array1={1, 2, 3} and array2={2, 3, 4})
java AssignmentOne
2
3
Assignment 2
Write a function that accepts 2 integer arrays. The function will return a new array of type int
containing all the numbers which were present in either input arrays. That is, we return the
union of the two arrays.
Then, in your main you should call this function you wrote to print the union elements of the
arrays.
Clarifications:
• Initialize the two arrays in your main function.
Note: The order if the items in the returned array does not matter.
Note: Every number should appear at most once! (No duplicates allowed!)
Hint: Write a helper function isDuplicate that receives as arguments an array and an integer
number and returns true if the number is already an element in the given array, and false
otherwise.

Assignment 3 (BONUS)
Given an array of n integers, find the number with the highest value and put it in the first cell of
the array, the second highest number in the second cell, …, the lowest number in the last cell.
In other words, sort the array.
Clarification: the array should be declared and initialized in your main function
For example: (for the input array {1, 6, 3, 9, 5, 2, 10})
java Assignment3
10
9
6
5
3
2
1