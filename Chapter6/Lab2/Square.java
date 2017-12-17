package Lab2;

// ****************************************************************
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
    int[][] square;
    private int size;
    //--------------------------------------
    //create new square of given size
    //--------------------------------------

    public Square(int sz)
    {
        this.size = sz; 
        square = new int[size][size];
    }

    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    
    public int sumRow(int row)

    {
        int sum = 0;
        for (int n = 0; n< size; n ++){
            sum += square[row][n];
        }
        
        return sum;
    }

    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------

    public int sumCol(int col)

    {
        int sum = 0;
        for (int n = 0; n < (size); n ++){
            sum += square[n][col];
        }
        
        return sum;
    }

    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------

    public int sumMainDiag()

    {
        int sum = 0; 
        for (int index = 0; index < size; index ++){
            sum += square[index][index];
        }
        return sum;

    }

    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------

    public int sumOtherDiag()

    {
        int sum = 0; 
        for (int index = size; index > 0; index --){
            sum += square[index][index];
        }
        return sum;
    }

    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------

    public boolean magic()

    {

        //Change to work correctly
        int[] temp = new int[size * 2 + 2];
        
        for (int i = 0; i < temp.length; i ++){
            if (i <= size){
                temp[i] = sumRow(i);
            }
            if ((i > size) && (i <= size * 2)){
                temp[i] = sumCol(i);
            }
            if (i > size * 2){
                temp[i] = sumMainDiag();
                temp[i + 2] = sumOtherDiag();
            }
        }
        
        for (int i : temp){
            if (i != temp[0]){
                return false;
            }
        }
        
        return true;
    }

    //--------------------------------------
    //read info into the square from the standard input.
    //--------------------------------------

     public void setSquare(int[][] sq)

    {
        
        this.square = sq;

    }

    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------

    public void printSquare()

    {
        
        for(int row = 0; row < square.length; row++) {
            
            for(int col =0; col < square[0].length; col++) {
                
                System.out.print(square[row][col] + "\t");
                
            }
            System.out.println();

        }
     
    }
    
    
}

