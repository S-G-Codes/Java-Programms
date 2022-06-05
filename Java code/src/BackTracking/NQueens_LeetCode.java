import java.util.List;

public class NQueens_LeetCode {

    // url https://leetcode.com/problems/n-queens/

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ansBoard = new ArrayList<List<String>>();

        char chessBoard[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessBoard[i][j] = '.';
            }
        }

        placeQueens(ansBoard, chessBoard, 0);
        return ansBoard;

    }

    private void placeQueens(List<List<String>> ansBoard, char[][] chessBoard, int row) {
        // this if we put all the Q at their places
        if (row == chessBoard.length) {
            ansBoard.add(buildChessBoard(chessBoard));
            return;
        }

        for (int col = 0; col < chessBoard.length; col++) {
            if (isSafe(chessBoard, row, col)) {
                chessBoard[row][col] = 'Q';
                placeQueens(ansBoard, chessBoard, row + 1);
                chessBoard[row][col] = '.';
            }
        }

    }

    private boolean isSafe(char[][] chessBoard, int row, int col) {
        // for row and col
        for (int i = 0; i < row; i++) {
            if (chessBoard[i][col] == 'Q') {
                return false;
            }
        }

        // for 45 degree i.e right Diagonaly
        for (int i = row - 1, j = col + 1; i >= 0 && j < chessBoard.length; i--, j++) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }

        }

        // for 135 degree or Right Side Diagonally
        for (int i = row - 1, j = col - 1; i >= 0 && j >=0; i--, j--) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    private List<String> buildChessBoard(char[][] chessBoard) {
        List<String> path = new ArrayList();
        for (int i = 0; i < chessBoard.length; i++) {
            path.add(new String (chessBoard[i]));
        }
        return path;
    }

    public static void main(String[] args) {

    }
}
