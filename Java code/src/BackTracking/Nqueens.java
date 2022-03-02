
  //run this on leet code for n queens 

class Solution {
    public boolean isSafe(int row, int col, char[][] board) {
        //horizontal
        for(int j=0; j<board.length; j++) {
            if(board[row][j] == 'Q') {
                return false;
            }
        }
       
        //vertical
        for(int i=0; i<board.length; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
       
        //upper left
        int r = row;
        for(int c=col; c>=0 && r>=0; c--, r--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
       
        //upper right
        r = row;
        for(int c=col; c<board.length && r>=0; r--, c++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
       
        //lower left
        r = row;
        for(int c=col; c>=0 && r<board.length; r++, c--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
       
        //lower right
        for(int c=col; c<board.length && r<board.length; c++, r++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
       
        return true;
    }
   

    //saving out queens 
    //parameter  our OG bord and a string list of all bord
    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        String row = "";  //a new empty string for travesing through rows and if safe add queen or .
        List<String> newBoard = new ArrayList<>();   //a newBord array list
       
        for(int i=0; i<board.length; i++) {   
            row = "";
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }
            newBoard.add(row);
        }
       
        allBoards.add(newBoard);
    }
   
    //helper fn 
    //parameter as board our OG board
    //String list for the while board
    //col integer to travese
    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        if(col == board.length) {  //col initaliy is zero if reaches 0 then call savebord fn and return 
            saveBoard(board, allBoards);
            return;
        }
       
        for(int row=0; row<board.length; row++) {
            if(isSafe(row, col, board)) {  //if the box is safe place the queen 
                board[row][col] = 'Q';   
                helper(board, allBoards, col+1);  //if not safe add a . over there 
                board[row][col] = '.';
            }
        }
    }
   
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();   //arrray list
        char[][] board = new char[n][n];       //a array of n by n size
       
        helper(board, allBoards, 0);
        return allBoards;
    }
 }
 