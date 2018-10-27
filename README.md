## Task
The game consists of a grid (7 columns and 6 rows) and two players that take turns to drop their discs. 
The pieces fall straight down, occupying the next available space within the column. 
The objective of the game is to be the first to form a horizontal, vertical, or diagonal line of four of one's own discs. 
Your task is to create a Class called Connect4 that has a method called play which takes one argument for the column where the player is going to place their disc. 

## Rules
**optative** - instruct the programmer what needs to be done
* If a player successfully has 4 discs horizontally, vertically or diagonally then you should return "Player n wins!” where n is the current player either 1 or 2.( third - first rule 4 vertically)
* If a player attempts to place a disc in a column that is full then you should return ”Column full!” and the next move must be taken by the same player. (second - split into two tests)
* If the game has been won by a player, any following moves should return ”Connect4 has finished!”. 
* Any other move should return ”Player n has a turn” where n is the current player either 1 or 2. (first - split into two tests)

**indicative** - tells the programmer what are the facts of the system. This is a spec than a rule. **indicative** is what's true about the problem - don't describe behavior.
* Player 1 starts the game every time and alternates with player 2.
* The columns are numbered 0-6 left to right.

Kata Taken from CodeWars: [https://www.codewars.com/kata/connect-4]