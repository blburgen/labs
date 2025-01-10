package week06;

import java.util.*;

public class Week06TicTacToeLab {

	// This Lab requires you to program a simple game of Tic Tac Toe
	//
	// 		 Note:  there are many ways to implement this game.  Use what 
	//		  		you have already learned.  You have the tools to implement
	//		  		this game.  
	//
	// Rules:  
	//		- Tic Tac Toe is a 2-player game played on a 3x3 grid.  
	//
	//		- One player usually plays "X"s and the other player plays "O"s.
	//
	// 		- In our version of the game, "X"s will always start.
	//
	//		- Players will alternate turns.
	//
	// 		- The game will end when one of the conditions is true:
	//				1. A player gets three squares in a row 
	//				2. A player gets three squares in a column
	//				3. A player gets three squares in either diagonal
	//				4. Every square is filled in, but no player has achieved 
	//					conditions 1,2, or 3 as described above --> A Draw!
	//
	//		- A player can win on turn 5, 6, 7, 8, or 9 (start checking for winners on or before turn 5)
	//
	//		- Error checking of input is not necessary here, but will make this game much more
	//				robust.  If you choose to implement this, get the game working first, and then
	//				add a check of the input to make sure that it's an Integer from 1 to 9.
	//
	//		- Use the Scanner to input the users choice of square -- one suggestion is  
	//				to create numbers within the square, and then have the user choose 
	//				that integer (1-9) to choose the location.
	//
	//		- One way to display the game board would be as follows:
	//				+---+---+---+       to		+---+---+---+		+---+---+---+		+---+---+---+
	//				| 1 | 2 | 3 |	   find		|---|---|---|		| | | | | | |		| \ |   | / |
	//				+---+---+---+	   a win	+---+---+---+		+---+---+---+		+---+---+---+
	//				| 4 | 5 | 6 |	-- look-->	|---|---|---|	&	| | | | | | |   & 	|   | X |   |
	//				+---+---+---+	 at these	+---+---+---+		+---+---+---+		+---+---+---+
	//				| 7 | 8 | 9 |	8 patterns	|---|---|---|		| | | | | | |		| / |   | \ |
	//				+---+---+---+		        +---+---+---+		+---+---+---+		+---+---+---+
		
		
	// Start with these steps:
	//
	//		1. Create a class with a main method -- this Lab can be implemented in just one class.
	//				
	//				Alternatively, you could create an object with it's own methods. 
	//				(e.g. GameBoard.java)
	//
	//		2. You will need to declare a gameBoard.  
	//
	//				As shown above, Tic Tac Toe is played on a 3x3 grid that has 9 spaces. 
	//
	//					a. One suggestion is to create an array of length 9 to represent the board:
	//
	//						For example:  String[] gameBoard = new String[9]; 
	//
	//							i. Just remember that arrays are 0 based, so to access the grid, 
	//							the index would go from 0-8.  
	//
	//							ii. Wins can occur in 8 ways (see above).
	//								For example: A horizontal win would be found by 
	//								looking at the contents of: 
	//									gameBoard[0] & gameBoard[1] & gameBoard[2] 
	//									gameBoard[3] & gameBoard[4] & gameBoard[5] 
	//									gameBoard[6] & gameBoard[7] & gameBoard[8] 
	//
	//					b. Another option for the gameBoard would be a 2d array -- This option might be
	//						is a bit more challenging!  
	//
	//						For example:  String[][] gameBoard = new String[3][3];
	//					
	//							i. Just remember that arrays are 0 based, so to access the grid, 
	//							the index would go from 0-2 in two directions.  
	//
	//							ii. Wins can occur in 8 ways.  A horizontal win would be comparing:  
	//									gameBoard[0][0] & gameBoard[0][1] & gameBoard[0][2] 
	// 
	//		3.  Implement the rules as listed above.  
	//
	//		4.  You might want to have the following methods:
	//					a. display() -- to print the gameBoard
	//					b. checkWinStatus() -- to check if a player has won
	//					c. initialize() -- to set up your new gameBoard
	//			
	//		5.  Reminder:  There is no one way to implement this game.
	//		
	//	
	
	// START YOUR IMPLEMENTATION BELOW THIS LINE
	private static String[][] gameBoard = new String[3][3];
	private static boolean endGame = false;
	private static String turnX = "X";
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		initializeGame();
		int numberTurns = 0;
		int choice = 0;
		while (!endGame) {
			displayGame();
			System.out.println("Quit the game at any time by entering 9.");
			System.out.print("Which square do you want to choose " + turnX + " (0-8): ");
			choice = sc.nextInt();
			switch (choice) {
			case(0):
				if(gameBoard[0][0] != "X" && gameBoard[0][0] != "O") {
					gameBoard[0][0] = turnX;
					switchTurn();
					numberTurns++;
				} else {
					System.out.println("Not a valid choice.");
				}
				break;
			case(1):
				if(gameBoard[0][1] != "X" && gameBoard[0][1] != "O") {
					gameBoard[0][1] = turnX;
					switchTurn();
					numberTurns++;
				} else {
					System.out.println("Not a valid choice.");
				}
				break;
			case(2):
				if(gameBoard[0][2] != "X" && gameBoard[0][2] != "O") {
					gameBoard[0][2] = turnX;
					switchTurn();
					numberTurns++;
				} else {
					System.out.println("Not a valid choice.");
				}
				break;
			case(3):
				if(gameBoard[1][0] != "X" && gameBoard[1][0] != "O") {
					gameBoard[1][0] = turnX;
					switchTurn();
					numberTurns++;
				} else {
					System.out.println("Not a valid choice.");
				}
				break;
			case(4):
				if(gameBoard[1][1] != "X" && gameBoard[1][1] != "O") {
					gameBoard[1][1] = turnX;
					switchTurn();
					numberTurns++;
				} else {
					System.out.println("Not a valid choice.");
				}
				break;
			case(5):
				if(gameBoard[1][2] != "X" && gameBoard[1][2] != "O") {
					gameBoard[1][2] = turnX;
					switchTurn();
					numberTurns++;
				} else {
					System.out.println("Not a valid choice.");
				}
				break;
			case(6):
				if(gameBoard[2][0] != "X" && gameBoard[2][01] != "O") {
					gameBoard[2][0] = turnX;
					switchTurn();
					numberTurns++;
				} else {
					System.out.println("Not a valid choice.");
				}
				break;
			case(7):
				if(gameBoard[2][1] != "X" && gameBoard[2][1] != "O") {
					gameBoard[2][1] = turnX;
					switchTurn();
					numberTurns++;
				} else {
					System.out.println("Not a valid choice.");
				}
				break;
			case(8):
				if(gameBoard[2][2] != "X" && gameBoard[2][2] != "O") {
					gameBoard[2][2] = turnX;
					switchTurn();
					numberTurns++;
				} else {
					System.out.println("Not a valid choice.");
				}
				break;
			case(9):
				System.out.println("You terminated the game!");
				endGame = true;
				break;
			default:
				System.out.println("Not a valid choice.");
			};
			if(gameWon()) {
				switchTurn();
				System.out.println(turnX + " won the game");
				endGame = true;
				displayGame();
			} else if (numberTurns == 9) {
				System.out.println("Tie Game");
				endGame = true;
				displayGame();
			}
			
			
		}
			
		
	}
	public static boolean gameWon() {
		if (gameBoard[0][0] == gameBoard[0][1] && gameBoard[0][0] == gameBoard[0][2] || // top row
			gameBoard[0][0] == gameBoard[1][0] && gameBoard[0][0] == gameBoard[2][0] ||	// left column
			gameBoard[1][0] == gameBoard[1][1] && gameBoard[1][0] == gameBoard[1][2] ||	// middle row
			gameBoard[0][0] == gameBoard[1][1] && gameBoard[0][0] == gameBoard[2][2] || // diagonal
			gameBoard[0][2] == gameBoard[1][1] && gameBoard[0][2] == gameBoard[2][0] || // other diagonal
			gameBoard[2][0] == gameBoard[2][1] && gameBoard[2][0] == gameBoard[2][2] ||	// bottom row		
			gameBoard[0][1] == gameBoard[1][1] && gameBoard[0][1] == gameBoard[2][1] || // middle column
			gameBoard[0][2] == gameBoard[1][2] && gameBoard[0][2] == gameBoard[2][2]) { // right column
			return true;
		}
		return false;
	}
	
	
	public static void switchTurn() {
		if (turnX == "X") {
			turnX = "O";
		} else {
			turnX = "X";
		}
	}
	
	public static void initializeGame() {
		int number = 0;
		for (int i = 0; i < gameBoard.length; i++){
			for (int j = 0; j < gameBoard[i].length; j++) {
				gameBoard[i][j] = Integer.toString(number);
				number++;
			}
		}
	}
	public static void displayGame() {
		System.out.println("+---+---+---+"); 
		System.out.println("| " + gameBoard[0][0] + " | " + gameBoard[0][1] + " | " + gameBoard[0][2] + " |");
		System.out.println("+---+---+---+");
		System.out.println("| " + gameBoard[1][0] + " | " + gameBoard[1][1] + " | " + gameBoard[1][2] + " |");
		System.out.println("+---+---+---+");
		System.out.println("| " + gameBoard[2][0] + " | " + gameBoard[2][1] + " | " + gameBoard[2][2] + " |");
		System.out.println("+---+---+---+");
	}

}
