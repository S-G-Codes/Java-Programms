public class Number_of_Island {
    // https://leetcode.com/problems/number-of-islands/
    public int numIslands(char[][] grid) {
         int row = grid.length;
         int col = grid[0].length;
         int count = 0;

         for (int i = 0; i < row; i++) {
             for (int j = 0; j < col; j++) {
                if(grid[i][j] == '1'){
                    dfs(grid, i , j);
                    count++;
                }
             }
         }
         return count;
    }
    private void dfs(char[][] grid, int i, int j) {
          if(i >= 0 && j>=0 && i<grid.length && j<grid[0].length && grid[i][j] =='1'){
        grid[i][j] = '0';
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
          }

    }
    public static void main(String[] args) {
        
    }
}
