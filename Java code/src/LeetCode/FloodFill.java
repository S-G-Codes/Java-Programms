public class FloodFill {
    //url https://leetcode.com/problems/flood-fill/


    //Approch is simple
    //  1 .Go to the starting point given in question
    //  2. fill that color with the given newColor in question
    //  3 . And check recursively in all four direction if any direction has that oldcolor make a rec call them as welll for all direction check if it has the old color if yes fill newColor and do same thing 
    // 4 . make sure to follow this checks  
    //        i. row doesn't cross the matrix length
    //        ii. row should be greater than zero 
    //        iii.  coloum doesn't cross its length 
    //        iv. col is greater than zero meand it shouldn't go in negative
   //          v. Also IMP while recursively make sure the pixel you around you has the same oldcolor if not don't call forward

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
             
        if(newColor == image[sr][sc]) return image;    //base cond

        dfs(image , sr , sc , newColor , image[sr][sc]);
        return image;


    }


    private void dfs(int [][] image , int row, int col , int newColor , int oldColor){

        if(row >= image.length || row < 0 || col >= image[0].length || col < 0 || image[row][col] != oldColor ) return;
    
      
        image[row][col] = newColor;

        dfs(image, row -1, col, newColor, oldColor);  //upar vali call
        dfs(image, row +1 , col, newColor, oldColor);  //niche vali call
        dfs(image, row, col -1 , newColor, oldColor);  //left side vali call
        dfs(image, row, col +1 , newColor, oldColor);  //right  side vali call

    }
    
    
    public static void main(String[] args) {
        
    }
}
