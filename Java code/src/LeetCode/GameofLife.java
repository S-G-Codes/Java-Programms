import javax.swing.border.Border;

public class GameofLife {
    // https://leetcode.com/problems/game-of-life/

  //Approch is simple
//  1. If a cell is alive(1) and has fewer than 2 or greater than 3 active neighbors, then it will die
//   become 0.  and if its 0 that means its will die we will make that elemet -2 so that we don't miss it for others
//  2. If a cell is dead(0) and had 3 active neighbors, then it get life(1)   ..same for this if its getting a life then will make it -1 and later we will replace it with 0 and 1 respectively


    //this direction because there are 8 ways to check for the sale
    private int[][] directions = new int[][]{{0,1}, {1,0}, {-1, 0}, {0,-1},{-1,-1},{-1,1},{1,-1},{1,1}};
  
    public void gameOfLife(int[][] board) {
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                   if(board[i][j] == 1){
                       int activeNeighbour = getActiveNeighbour(board, i ,j);
                       if(activeNeighbour < 2 || activeNeighbour >3){
                           board[i][j] = -2;   //i.e 0
                       }
                   }else if(board[i][j] == 0){
                       int activeNeighbour = getActiveNeighbour(board, i , j);
                       if(activeNeighbour ==3){
                           board[i][j] = -1;      //i.e 1
                       }
                   }
            }
        }
        upadteBoard(board);
        return;
    }

    private int getActiveNeighbour(int[][] bord , int row , int col){
        int activeNeighbour = 0;
        for (int[] direction : directions) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];

            if(newRow >=0 && newRow < bord.length && newCol >=0 && newCol<bord[0].length && (bord[newRow] [newCol] == 1 || bord[newRow][newCol] == -2)){
                activeNeighbour++;
            }
        }
        return activeNeighbour;
    }

    private void upadteBoard(int[][] board){
        for (int i = 0; i < board.length; i++) {
              for (int j = 0; j < board[0].length; j++) {
                  if(board[i][j] == -2){
                      board[i][j]  = 0;
                  }
                  if(board[i][j] == -1){
                      board[i][j] =1;
                  }
              }
        }
    }
    public static void main(String[] args) {
        
    }
}
