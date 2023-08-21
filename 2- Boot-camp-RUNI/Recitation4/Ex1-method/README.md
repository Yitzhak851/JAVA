Methods methods, arguments, return values
<!-- Assignment 1 -->
<!-- Write a program that makes animal sounds.
We have 4 types of animals: cow (1), dog (2), sheep (3), and crocodile (4).
The main() method, receive as an argument the animal (1-4), 
and print out its sound as
follows:
(1)The cow goes “moo”, (2)the dog goes “woof”, (3)the sheep goes “meh” and (4) the crocodile is silent.
The for each animal should be done in separate methods. In particular, in your main
function, you should call one of four methods that will print the animal sounds to the screen.
Running examples:
>> run Assignment1 dog
The dog goes woof
>> run Assignment1 pikachu
Sorry, we don't have that animal in stock. -->

<!-- Assignment 2 -->
Write a program that greets the user according to the current time of day.
The main() method receives two arguments via the command-line: (1) the name of the user
and (2) the current hour of the day, in 24 hour format (e.g., 18 means 18:00)
The method should print out a corresponding greeting. The printing should be done in a
single separate method (i.e., not in main).
The greetings are:
• 06:00-11:00 – “good morning”
• 12:00-16:00 – “good afternoon”
• 17:00-20:00 – “good evening”
• 21:00-05:00 – “good night”
Hint: the method might be void greet(String name, int hourOfDay).
Notes:
(1) In your main, check that exactly two arguments are given. If not, print the statement
"Please enter your name and the current hour"
(2) If the hour given is < 0 or > 24, print the statement “There is no such time, [name]” where
name is the name given by the user.
Running examples:
run AssignmentTwo Daniel 8
Good Morning, Daniel!
run AssignmentTwo Bilbo 42
There is no such time, Bilbo!

<!-- Assignment 3 -->
Write a program that counts the amount of numbers between 10 (inclusive) and 100 (exclusive)
whose digits sum to either 9 or 7.
In your main() method, print out the answer. However, the actual counting should be done in a
separate method. Note: there are 16 such numbers.
Hint, the method might be: int countNumbers().
Expected Output:
>> run AssignmentThree
16