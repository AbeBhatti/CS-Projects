// Main.java
//
// Uses the Square class to read in square data and tell if 
// each square is magic.
//          
// ****************************************************************

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Main
{
    public static void main(String[] args) throws IOException
    {// Main.java
//
// Uses the Square class to read in square data and tell if 
// each square is magic.
//          
// ****************************************************************

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

        public class Main
        {
            public static void main(String[] args) throws IOException
            {

                Scanner scan = new Scanner(new File("magicData"));

                int count = 1;                 //count which square we're on
                int size = scan.nextInt();     //size of next square

                //Expecting -1 at bottom of input file
                while (size != -1)
                {

                    //create a new Square of the given size
                    Square square1 = new Square(size);
                    //call its read method to read the values of the square
                    square1.readSquare(scan);
                    System.out.println("\n******** Square " + count + " ********");
                    //print the square
                    square1.printSquare();
                    //print the sums of its rows
                    for(int o = 0; o<size; o++){
                        System.out.println("sum of row " + (o+1) + ": " + square1.sumRow(o));
                    }
                    //print the sums of its columns
                    for(int s = 0; s<size; s++){
                        System.out.println("sum of column " + (s+1) + ": " + square1.sumCol(s));
                    }
                    //print the sum of the main diagonal
                    System.out.println("sum of main diagonal: " + square1.sumMainDiag());
                    //print the sum of the other diagonal
                    System.out.println("sum of other diagonal: " + square1.sumOtherDiag());
                    //determine and print whether it is a magic square
                    System.out.println("is magic: " + square1.magic());
                    //get size of next square
                    count++;
                    size = scan.nextInt();

                }

            }
        }






        Scanner scan = new Scanner(new File("magicData"));

	    int count = 1;                 //count which square we're on
	    int size = scan.nextInt();     //size of next square

	    //Expecting -1 at bottom of input file
	    while (size != -1)
	    {

		    //create a new Square of the given size
            Square square1 = new Square(size);
		    //call its read method to read the values of the square
            square1.readSquare(scan);
		    System.out.println("\n******** Square " + count + " ********");
		    //print the square
            square1.printSquare();
		    //print the sums of its rows
            for(int o = 0; o<size; o++){
                System.out.println("sum of row " + (o+1) + ": " + square1.sumRow(o));
            }
		    //print the sums of its columns
            for(int s = 0; s<size; s++){
                System.out.println("sum of column " + (s+1) + ": " + square1.sumCol(s));
            }
		    //print the sum of the main diagonal
            System.out.println("sum of main diagonal: " + square1.sumMainDiag());
		    //print the sum of the other diagonal
            System.out.println("sum of other diagonal: " + square1.sumOtherDiag());
		    //determine and print whether it is a magic square
            System.out.println("is magic: " + square1.magic());
		    //get size of next square
            count++;
		    size = scan.nextInt();

	    }

   }
}


 

