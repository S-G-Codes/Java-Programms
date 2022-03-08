import java.util.Arrays;

public class PrinttingAll_Possible_Path_of_a_Maze {



    static void printing_All_Paths(String process , boolean [][]maze , int row , int col){
        if(row == maze.length-1 && col == maze[0].length -1){
            System.out.println(process);
            return;
        }

        if(!maze[row][col]) return;
        
   //conserding this block in my path while find our particular path
        maze[row][col] = false;

        if(row < maze.length-1){
            printing_All_Paths(process + 'D', maze, row+1, col);
        }
        if(col <maze[0].length -1){
            printing_All_Paths(process + 'R', maze, row, col+1);
        }
        if(row>0){
            printing_All_Paths(process + 'U', maze, row-1, col);
        }
        if(col > 0){
            printing_All_Paths(process + 'L', maze, row, col-1);
        }

       //so this while we returning from a fn call we are making that block marks as true again to find other path
       //also know as backtracing
        maze[row][col] =true;
    }



    //Printing All Path but with numbers of 1,2,3 and so on 
    static void printing_All_Paths_with_NO(String process , boolean [][]maze , int row , int col , int [][]path , int step){
        if(row == maze.length-1 && col == maze[0].length -1){
            path[row][col] = step;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(process);
            System.out.println();
            return;
        }

        if(!maze[row][col]) return;
        
   //conserding this block in my path while find our particular path
        maze[row][col] = false;
        path[row][col] = step;


        if(row < maze.length-1){
            printing_All_Paths_with_NO(process + 'D', maze, row+1, col,path,step+1);
        }
        if(col <maze[0].length -1){
            printing_All_Paths_with_NO(process + 'R', maze, row, col+1,path,step+1);
        }
        if(row>0){
            printing_All_Paths_with_NO(process + 'U', maze, row-1, col,path,step+1);
        }
        if(col > 0){
            printing_All_Paths_with_NO(process + 'L', maze, row, col-1,path,step+1);
        }

       //so this while we returning from a fn call we are making that block marks as true again to find other path
       //also know as backtracing
        maze[row][col] =true;
        path[row][col] = 0;

    }
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        
        //  printing_All_Paths("", board, 0, 0);


        int[][] path = new int[board.length][board[0].length];
        printing_All_Paths_with_NO("", board, 0, 0, path, 1);
    }
}
