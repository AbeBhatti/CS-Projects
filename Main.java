//Snakes and Ladders 
// By Abraham Bhatti


public class Main {

    public static void main(String[] args) {
        boolean gameOver = false;

        SAL SnakeLadder = new SAL();
        System.out.println("Welcome to Snakes and Ladders, an interactive two player game.");
        System.out.println("If you land on l, your piece will climb the ladder. If you land on s, your piece will slide down the snake.");
        System.out.println("The first player to make it to the end of the board wins!"); 
        System.out.println("Keep in mind that not every ladder or snake will be the same length, meaning that you will move up or down a random number of spaces. Their positions are also randomly generated. Enjoy!");
        SnakeLadder.obstacles();
        SnakeLadder.getPlayer();
        while (gameOver == false){
        SnakeLadder.printBoard();
        SnakeLadder.getMove(); 
        SnakeLadder.checkMove();
        SnakeLadder.winner();
        SnakeLadder.nextPlayer();
        }

    if (SnakeLadder.winner() == true){
        gameOver = true; 
    }

    } 
    
}
