public class LargestLocalValuesinMatrix {
    // https://leetcode.com/problems/largest-local-values-in-a-matrix/
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        
         int[][] ans = new int[n-2][n-2];

         for (int i = 0; i <n-2 ; i++) {
               for (int j = 0; j < n-2; j++) {
                
                ans[i][j] = maxElement(i,j,grid);
                    
               }
         }
         return ans;
    }
    private int maxElement(int i, int j, int[][] grid) {
        int maxElement = Integer.MIN_VALUE;
            for (int k = i; k <= i+2; k++) {
                  for (int k2 = j; k2 <=j+2; k2++) {
                       maxElement = Math.max(grid[k][k2], maxElement);
                  }
            }
            return maxElement;
    }
    public static void main(String[] args) {
        //company question
        int a = 0;
int b = 0;
int[] bArr = new int[1];
bArr[0] = b;
inc1(a);
inc2(bArr);
System.out.print("a = " + a + " b = " + b + " bArr[0] = "
+ bArr[0]);
    }

    public static void inc1(int x)

{ x++; }
public static void inc2(int[] x)
{ x[0]++; }
}
