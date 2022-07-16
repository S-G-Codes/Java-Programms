class OutofBoundaryPaths{
    // https://leetcode.com/problems/out-of-boundary-paths/
   private Long memoziationArray[][][] = null;
  private  int mod = 1000000007;

    
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
     memoziationArray = new Long[m+1][n+1][maxMove+1];
     
     return (int) (findPathswithMemoAndBFS(m , n , maxMove , startRow , startColumn));


    }
    private long findPathswithMemoAndBFS(int m, int n, int maxMove, int row, int col) {
        if(maxMove < 0) return 0;

        if(row == m || col == n || row < 0 || col < 0) return 1;


        if(memoziationArray[row][col][maxMove] != null){
            return memoziationArray[row][col][maxMove];
        }

        long total = 0;

        long left_maxMoveReduced = findPathswithMemoAndBFS(m, n, maxMove -1, row, col -1);
        long right_maxMoveReduced = findPathswithMemoAndBFS(m, n, maxMove -1, row, col + 1);
        long up_maxMoveReduced = findPathswithMemoAndBFS(m, n, maxMove -1, row-1, col );
        long down_maxMoveReduced = findPathswithMemoAndBFS(m, n, maxMove -1, row+1, col );
         
        total  = ( (left_maxMoveReduced + right_maxMoveReduced + up_maxMoveReduced + down_maxMoveReduced) % mod );
        memoziationArray[row][col][maxMove] = total;
        return total;
    }
    public static void main(String[] args) {
        
    }
}