public class MaxAreaOfIsland {

    
    ///url https://leetcode.com/problems/max-area-of-island/
    
    //TC = O(n*m)
    public int maxAreaOfIsland(int[][] grid) {
        if(grid == null || grid.length == 0)
        return 0;
        
        int row = grid.length;
        int col = grid[0].length;

        int maxArea = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                  if(grid[i][j] ==1){
                      maxArea = Math.max(maxArea, getCurrArea(i , j , grid));
                  }
            }
        }
        return maxArea;
    }


    private int getCurrArea(int i , int j , int [][] grid){
   
        if(i<0 || j <0 ||  i >= grid.length || j >= grid[0].length || grid[i][j] <=0){
return 0;

        }

        grid[i][j] = -1;   //visited node marked as -1 so we don't get into a loop

        int leftArea = getCurrArea(i,  j -1, grid);
        int rightArea = getCurrArea(i,  j +1, grid);
        int upArea = getCurrArea(i -1,  j, grid);
        int downArea = getCurrArea(i +1,  j , grid);

        int TotalArea = 1 + leftArea + rightArea +upArea + downArea;           // +1 bcz for visited one
        return TotalArea;
    }

public static void main(String[] args) {
    
}
}

