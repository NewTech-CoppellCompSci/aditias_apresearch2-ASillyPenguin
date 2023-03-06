package lab;
import java.util.Scanner;

	public class TicTacToe{ 
	    static char[][] board = new char[3][3]; // Tic-tac-toe board
	    static Scanner sc = new Scanner(System.in); // Scanner for getting input from the user
	    static char currentPlayer = 'X'; // Current player (X or O)

	    public static void main(String[] args) {
	        // Initialize the board with empty spaces
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                board[i][j] = ' ';
	            }
	        }
	        while (true) {
	            // Print the board
	            printBoard();

	            // Get the row and column from the user
	            System.out.print("Player " + currentPlayer  + ", enter row (0-2): ");
	            int row = sc.nextInt();
	            System.out.print("Player "  + currentPlayer + ", enter column (0-2): ");
	            int col = sc.nextInt();

	            // Check if the cell is empty
	            if (board[row][col] == ' ') {
	                // Update the board
	                board[row][col] = currentPlayer;
	                
	                // Switch players
	                if (currentPlayer == 'X') {
	                    currentPlayer = 'O';
	                }else{
	                    currentPlayer = 'X';
	                }
	            }else {
	                // Cell is not empty, print an error message
	                System.out.println("Cell is not empty, please choose another cell./n");
	            }
                if (checkForWin()) {
                	break;
                }
	        }
	      
	    }

	    public static void printBoard() {
	        for (int i = 0; i < 3; i++) { 
	            for (int j = 0; j < 3; j++) {
	                System.out.print(board[i][j] + " | ");
	            }    
	            System.out.println();
	    	}
	    }
	    

	    public static boolean checkForWin() {
	        // Check rows
	        for (int i = 0; i < 3; i++) {
	            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
	                System.out.println("row Player " + board[i][0] + " wins!");
	                return true;
	            }
	        }
	        // Check columns
	        for (int i = 0; i < 3; i++) {
	            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') { 
	                System.out.println("column Player " + board[0][i] + " wins!");
	                return true;
	            }
	        }
	        
	        // Check diagonals
	        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' '){
			    System.out.println("Player " + board[0][0] + " wins!");
	            return true;
	        }
	        if (board[2][2] == board[1][1] && board[1][1] == board[0][0] && board[2][2] != ' '){
			    System.out.println("Player " + board[0][0] + " wins!");
	            return true;
	        }
	        return false;
	    }
	       



}
