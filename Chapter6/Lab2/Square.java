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
        for (int n = 0; n < size; n++){
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
        int index = 0;
        for (int i = size; i >= 0; i--){
            
            
            sum += square[index][i];
            index += 1;
        }
        return sum;
    }

    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------

    public boolean magic()

    {
        //sets a value to test
        int test = sumRow(0);
        int[] temp = new int[size * 2 + 2];
        //saves the sum of each row
        for (int i = 0; i < size; i++){
            temp[i] = sumRow(i);
        }
        //saves the sum of each column
        for (int j = 0; j < size; j++){
            temp[j + size] = sumCol(j);
        }
        
        //saves the sums of the diagonals
        temp[size * 2 + 1] = sumMainDiag();
        temp[size * 2 + 1] = sumOtherDiag();
        
        //tests the set value against each sum of the square
        for (int k : temp){
            if (k != test){
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

