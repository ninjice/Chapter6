package Lab2;

public class ArrayPractice
{
    public double averageArray(int[][] nums){
        double finalAverage;
        int numColumns = nums[0].length;
        double[] averages = new double[nums.length];
        double tempAverage = 0;
        
        for (int i = 0; i < nums.length; i ++){
            tempAverage = nums[i][0];
            for (int j = 1; j < (numColumns - 1); j ++){
                tempAverage += nums[i][j];
            }
            averages[i] = tempAverage / 4;
        }
        
        for (int k = 1; k < averages.length; k ++){
            tempAverage = averages[0];
            tempAverage += averages[k];
        }
        System.out.println(tempAverage / averages.length);
        return(1.1);
    }
}