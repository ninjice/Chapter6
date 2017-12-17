package Lab2;


// ****************************************************************
// SquareTester.java
//
// Test 4 squares to be magic
//          
// ****************************************************************


public class SquareTester

{

    public static void main(String[] args)

    {

        //SQUARES TO BE TESTED...add more if you’d like

       

        //Magic
        
        int[][] sq1 = {{8, 1, 6},

                        {3, 5, 7},

                        {4, 9, 2}};
                       
        Square test1 = new Square(3) 
                       

        int[][] sq2 = { {30, 39, 48, 1, 10, 19, 28},

                        {38, 47, 7,  9, 18, 27, 29},

                        {46, 6, 8, 17, 26, 35, 37},

                        {5,  14, 16, 25, 34, 36, 45 },

                        {13, 15, 24, 33, 42, 44,  4},

                        {21, 23, 32, 41, 43,  3, 12},

                        {22, 31, 40, 49, 2, 11, 20 }};

        int[][] sq3 = {{48, 9, 6, 39},

                        {27, 18, 21, 36},

                        {15, 30, 33, 24},

                        {12, 45, 42, 3}};

       

        //Non magic

        int[][] sq4 = { {6, 2, 7},

                        {1, 5, 3},

                        {2, 9, 4}};

                       

        Square magic = new Square(3);

       

        System.out.println("============= Testing Magic Squares ============= ");

        System.out.println();

       

        magic.setSquare(sq1);

        magic.printSquare();

        System.out.println("Square 1 should be magic.  The return is: " + magic.magic());

        System.out.println();

       

        magic.setSquare(sq2);

       

        System.out.println();

        magic.printSquare();

        System.out.println("Square 2 should be magic.  The return is: " + magic.magic());

        System.out.println();

       

        magic.setSquare(sq3);

       

        System.out.println();

        magic.printSquare();

        System.out.println("Square 3 should be magic.  The return is: " + magic.magic());

        System.out.println();

       

        magic.setSquare(sq4);

       

        System.out.println();

        magic.printSquare();

        System.out.println("Square 4 should NOT be magic.  The return is: " + magic.magic());

        System.out.println();

       

    }
}


