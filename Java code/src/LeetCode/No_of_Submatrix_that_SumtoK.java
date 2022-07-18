import java.util.HashMap;
import java.util.Map;

public class No_of_Submatrix_that_SumtoK {
    // https://leetcode.com/problems/number-of-submatrices-that-sum-to-target/
   
    //  Approach
    //1. For each row, calculate the prefix sum
    //2. For each pair of columns.
    //3. Calculate the accumalted the sum of rows
    //4. Now this problem is same as to Find Subarray with Target Sum
   
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int res = 0;


        for (int i = 0; i < row; i++) {
            for (int j = 1; j < col; j++) {
                matrix[i][j] += matrix[i][j-1];
                
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = i; j < col; j++) {
                int subMatrixSum =0;

                Map<Integer,Integer> countElemet = new HashMap<Integer,Integer>();

                countElemet.put(0, 1);

                for (int k = 0; k < row; k++) {
                    int prefixSum = i == 0 ? 0 : matrix[k][i-1];

                    subMatrixSum += matrix[k][j]  - prefixSum;


                    if(countElemet.containsKey(subMatrixSum - target)){
                        res += countElemet.get(subMatrixSum - target);
                    }


                    int r = countElemet.getOrDefault(subMatrixSum, 0);


                    countElemet.put(subMatrixSum, r +1);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
