import java.util.Scanner;

// Tic-Tac-Toe Game
// @Abraham Bhatti
// @02/15/23

public class TicTacToe {
	public final int ROWS = 3;
	public final int COLS = 3;
	public final char[] PLAYERS = { 'X', 'O' };

	private int currPlayer; // whose turn it is, either 1 or 2 (1-->X, 2-->O)
	private char[][] board; // represents the board

	private Scanner scan; // for user input
	// constructor
	// instantiate the Scanner object
	// instantiate the board and make it empty (ie, full of space chars)
	public TicTacToe() {
		scan = new Scanner(System.in);
		board = new char[ROWS][COLS];
		for (int i = 0; i < ROWS; i++)
			for (int j = 0; j < COLS; j++)
				board[i][j] = ' ';
	}

	// scan user input to see who goes first
	// set currPlayer to 1 or 2, Player 1-->X, Player 2-->O
	// ensure that input is valid
	public void getFirstPlayer() {
        currPlayer = 1;
		// YOU NEED TO IMPLEMENT THIS METHHOD
	}

	// switch whose turn it is, 1 or 2
	public void switchPlayer() {
        currPlayer = 3-currPlayer;
		// YOU NEED TO IMPLEMENT THIS METHHOD
	}

	// get the next move
	// must validate that the move is in bounds and not already occupied
	// print the board again and re-prompt on invalid move
    int a;
    int b;
	public void getMove() {
		// YOU NEED TO IMPLEMENT THIS METHHOD
        int row = scan.nextInt();
        int col = scan.nextInt();
        while((row<0) || (row>2) || (col<0) || (col>2) || (board[row][col] != ' ')){
            row = scan.nextInt();
            col = scan.nextInt();
        }
        while (board[row][col]==' '){
            if(currPlayer == 1){
                board[row][col] = PLAYERS[0];
                }
            else if(currPlayer == 2){
                board[row][col] = PLAYERS[1];    
                }
            }


        
        printBoard();
	}

	// determine if there is a winner
	// @return true if there are three X's or three O's in any row, col, or diag
	public boolean isWinner() {
		return (board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] != ' ')
				|| (board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0] != ' ')
				|| (board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] != ' ')
				|| (board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] != ' ')
				|| (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] != ' ')
				|| (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2] != ' ')
				|| (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ')
				|| (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ');
	}

	// determine if the game is a draw
	// @return true if board is full and no winner
	public boolean isDraw() {
        int counter = 0;
        boolean isDraw = false;
        for(int r = 0; r<board[0].length; r++){
            for(int c = 0; c<board[0].length; c++){
                if (board[r][c]=='O' || board[r][c]=='X'){
                    counter++;
                }
            }
        }
        if ((counter==9) && (!isWinner())){
            isDraw = true;
        }
		// YOU NEED TO IMPLEMENT THIS METHHOD
        return isDraw;

	}

	// display the current state of the board
	public void printBoard() {
    System.out.println("1 2 3");
    System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);  
    System.out.println("-----");
    System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);  
    System.out.println("-----");
    System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    System.out.println("Enter row and column separately");
    }
		// YOU NEED TO IMPLEMENT THIS METHHOD

	// display the result of the game
	// either X wins, O wins, or it's a draw
	public void printResult() {
		
		if (isWinner())
			System.out.println("Player " + currPlayer + " (" + PLAYERS[currPlayer-1] + ") wins!");
		else
			System.out.println("The game was a draw!");
	}
}
