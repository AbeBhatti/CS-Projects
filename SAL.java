import java.util.Scanner;
import java.util.Random;
import java.lang.Math;


public class SAL{ 
    private final int ROWS = 10;
    private final int COLS = 10;
    private final char[] character = {'∆', 'Ω'};
    private final char[] SOL = {'s', 'l'};
    Scanner scan = new Scanner(System.in);
    
    public int pos1 = 0;
    public int pos2 = 9;
    private int dice;
    private char[][]board;
    private int currPlayer;
    private int pre1 = 0;
    private int pre2 = 9;

    public void getPlayer(){
        currPlayer = 1;
    }

    public void nextPlayer(){
        currPlayer = 3-currPlayer;
    }

    public SAL(){
        board = new char[ROWS][COLS];
        for(int i = 0; i < ROWS; i++){
            for(int a = 0; a < COLS; a++){
                board[i][a] = ' ';
            }

        }
    }

    public void obstacles(){
    if(currPlayer == 1){
        board[pos1][pos2] = character[0];
    }
    else if(currPlayer == 2){
        board[pos1][pos2] = character[1];
    }
        for(int i = 0; i<30; i++){
            int pos1 = (int)((Math.random()*10)); 
            int pos2 = (int)((Math.random()*10));
            board[pos1][pos2] = SOL[(int)(Math.random()*2)]; 
        } 
    }  
    public void getMove(){
        int dice = (int)(Math.random()*6)+1; 
        String roll = scan.nextLine();
        int h = 0;
        int v = 9;

        System.out.println("Player " + currPlayer + " rolled a " + dice + "!");
        board[pos1][pos2] =  ' ';
        if(currPlayer == 1){
        for(int i = 0; i<board.length; i++){
            for(int a = 0; a<board[0].length; a++){
                if ((board[i][a]) == (character[0])){
                    h = i;
                    v = a;
                }
            }
        }
        }
        else if(currPlayer == 2){
        for(int i = 0; i<board.length; i++){
            for(int a = 0; a<board[0].length; a++){
                if ((board[i][a]) == (character[1])){
                    h = i;
                    v = a;
                }
            }
        }  
        }
        pre1 = pos1;
        pre2 = pos2;
        pos1 = h;
        pos2 = v;
        pos1 += dice;
        if ((pos1>9) && (pos2 > 0)){
            pos2 -= 1;
            pos1 %= 10;
        }
        if (pos2 <= 0){
            pos2 = 0;
            if(pos1 > 9){
                pos1 = 9;
            }
        }
    if (board[pos1][pos2] == 'l'){
        System.out.println("You climbed up a ladder🪜🪜🪜");
        pos2 -= ((Math.random()*2)+1);
    }
    else if(board[pos1][pos2] == 's'){
        System.out.println("You slid down a snake𓆙𓆙𓆙:");
        pos2 += ((Math.random()*4)+1);
        }
    } 

    public void checkMove(){
    if(pos2 > 9){
        pos2 = 9;
    }
    if (pos2<0){
        pos2 = 0;
    }
    if(pos1 < 0){
        pos1 = 0;
    }
    if(pos1 > 9){
        pos1 = 9;
    }
    if(currPlayer == 1){
        for(int i = 0; i<board.length; i++){
            for(int a = 0; a<board[0].length; a++){
                if ((board[i][a]) == (character[0])){
                    board[i][a] = ' ';
                }
            }
        }
        board[pos1][pos2] = character[0];
        board[pre1][pre2] = character[1];
    }
    else if(currPlayer == 2){
        for(int i = 0; i<board.length; i++){
            for(int a = 0; a<board[0].length; a++){
                if ((board[i][a]) == (character[1])){
                    board[i][a] = ' ';
                }
            }
        }
        board[pos1][pos2] = character[1];
        board[pre1][pre2] = character[0];
    }
    }
    public boolean winner(){
        boolean win = false;
        if((pos1 >= 9) && (pos2 <= 0)){
            win = true;
            for(int i = 0; i<board.length; i++){
                for(int a = 0; a<board[0].length; a++){
                    board[i][a] = ' ';
                    }
            }
        }
        if(win == true){
            System.out.println("YAY PLAYER " + currPlayer + " WINS!!!"); 
        }
        
        return win;
    }


    public void printBoard(){
        System.out.println("-------------------------------"); 
        for(int i = 0; i<board.length; i++){
            System.out.print("|");
            for(int a = 0; a<board[0].length; a++){
                System.out.print(board[a][i] + " "); 
                System.out.print("|");
            }
            System.out.println("");
            System.out.println("-------------------------------");
        }

    }
}