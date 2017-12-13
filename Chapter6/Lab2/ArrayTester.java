package Lab2;

public class ArrayTester
{
    
    public static void Main(String[] args)
    {
        int[][] arr1 = {{1,1,1},
                        {1,1,1}
                        };
        
        int[][] arr2 = {{1,3,2},
                        {6,4,5}
                        };
        ArrayCalculations ac = new ArrayCalculations();
        double avg = ac.averageArray(arr1);
        System.out.println("Average is " + avg);
        
        int[] result = ac.sumColumns(arr1);
        
        for(int thing : result){
            System.out.println(thing + ", ");
        }
        
        int[][] squared = ac.squareArray(arr2);
        
        for(int[] row : squared){
            for(int num : row){
                System.out.println(num + ", ");
            }
            System.out.println();
        }
        
    }

}
