public class SprialMatrixII {
    // https://leetcode.com/problems/spiral-matrix-ii/

    public int[][] generateMatrix(int n) {
        int ans [][] = new int[n][n];
          if(n == 0) return ans;

          int SR  = 0;
          int ER = n-1;
          int SC  = 0;
          int EC = n-1;
          int count = 1;

          while(SR<= ER && SC <= EC){
              //Moving left
              for (int j = SC; j <= EC; j++){
                   ans[SR][j] = count++;;
              }
              SR++; //this bcz we have filled eariler SR so moved to next by ++

              //moving down 
              for (int i = SR; i <= ER; i++) {
                    ans[i][EC] = count++;
              }
              EC--; //same filled earlier
             
              if(SR<=ER){
                  //moving left
                 for (int j = EC; j >= SC; j--) {
                     ans[ER][j] = count++;
                 }
                }
                ER--;
          

               if(SC <= EC){
                   //moving up
                   for (int i = ER; i >=SR; i--) {
                       ans[i][SC] = count++;
                   } 
               }
               SC++;
          }
          return ans;
    }
    public static void main(String[] args) {
        
    }
}
