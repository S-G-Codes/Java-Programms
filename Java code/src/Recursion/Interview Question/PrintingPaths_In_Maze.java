import java.util.ArrayList;

public class PrintingPaths_In_Maze {

  //this will give us the total path
    static int count(int row , int col){
        if(row ==1 || col ==1) return 1;

        int left = count(row-1, col);
        int right = count(row, col-1);
        return left+right;
    }

    static void printingPath(String process , int row , int col){
        if(row == 1 && col == 1){
            System.out.println(process);
            return;
        }

        if(row > 1){
            printingPath(process +'D', row-1, col);
        }
        if(col > 1){
            printingPath(process +'R', row, col-1);
        }
    }


    //we will just all this in arraylist and return it
    static ArrayList<String> returing_printingPath(String process , int row , int col){
        if(row == 1 && col == 1){
          ArrayList<String> list = new ArrayList<>();
          list.add(process);
          return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row > 1){
         list.addAll(returing_printingPath(process +'D', row-1, col));   
        }
        if(col > 1){
            list.addAll(returing_printingPath(process +'R', row, col-1));  
        }
        return list;


    }


    //printing horizontal, vertical and diagonal path
    static ArrayList<String> diagonalPath(String process , int row , int col){
        if(row == 1 && col == 1){
          ArrayList<String> list = new ArrayList<>();
          list.add(process);
          return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row > 1){
         list.addAll(diagonalPath(process +'D', row-1, col-1));   
        }
        if(row > 1){
         list.addAll(diagonalPath(process +'V', row-1, col));   
        }
        if(col > 1){
            list.addAll(diagonalPath(process +'H', row, col-1));  
        }
        return list;


    }




    //Maze with obstacles

    static void printingPath_with_Obstacles(String process , boolean [][]maze , int row , int col){
        if(row == maze.length-1 && col == maze[0].length -1){
            System.out.println(process);
            return;
        }

        if(!maze[row][col]) return;
        

        if(row < maze.length-1){
            printingPath_with_Obstacles(process + 'D', maze, row+1, col);
        }
        if(col <maze[0].length -1){
            printingPath_with_Obstacles(process + 'R', maze, row, col+1);
        }
    }


    public static void main(String[] args) {
        // System.out.println("********Horizontal , Vertical or Right and Downword Path********");

        // System.out.println(returing_printingPath("", 3, 3));

        // System.out.println("********Horizontal , Vertical and Diagonal Path********");
        // System.out.println(diagonalPath("", 3, 3));


//path with diagonal

boolean[][] board = {
    {true, true, true},
    {true, false, true},
    {true, true, true}
};
 printingPath_with_Obstacles("", board, 0, 0);

    }
}
