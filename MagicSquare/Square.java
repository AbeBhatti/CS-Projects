// Square.java
//
// Define a Square class with methods to create and read in
// info for a square matrix and to compute the sum of a row,
// a col, either diagonal, and whether it is magic.
//          
// ****************************************************************

import java.util.Scanner;

public class Square
{
    private int[][] square;

    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    public Square(int size)
    {
        square = new int[size][size];
    }
    
    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row)
    {
        int rowSum = 0;
        for(int q = 0; q < square.length; q++){
            rowSum += square[row][q];
        }
        return rowSum;
    }

    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumCol(int col)
    {
        int colSum = 0;
        for(int e = 0; e < square.length; e++){
            colSum += square[e][col];
        }
        return colSum;
    }

    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag()
    {
        int diagSum = 0;
        for(int r = 0; r<square.length; r++){
            diagSum += square[r][r];
        }
        return diagSum;
    }

    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag()
    {
        int otherDiag = 0;
        for(int t = square.length-1; t>=0; t--){
            otherDiag += square[square.length-t-1][t];
        }
        return otherDiag;
    }

    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean magic()
    {
        boolean magic = false;
        for(int u = 0; u<square.length; u++){
            if ((sumRow(u) == sumCol(u)) && (sumCol(u) == sumMainDiag()) && (sumMainDiag() == sumOtherDiag()) && (sumOtherDiag() == sumRow(u))){
                magic = true;
        }
        }
        return magic;

    }

    //--------------------------------------
    //read info into the square from the input stream associated with the 
    //Scanner parameter
    //--------------------------------------
    public void readSquare(Scanner scan)
    {
      for (int row = 0; row < square.length; row++)
	  for (int col = 0; col < square.length; col ++)
	    square[row][col] = scan.nextInt();
    }

    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare()
    {
        String str;
        for(int i = 0; i<square.length; i++){
            for(int a = 0; a<square[0].length; a++){
                System.out.print(square[i][a] + " ");
                str = Integer.toString(square[i][a]);
                if(str.length()==1){
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}

 
