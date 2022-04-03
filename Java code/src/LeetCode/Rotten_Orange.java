import java.util.LinkedList;
import java.util.Queue;

public class Rotten_Orange {
    // https://leetcode.com/problems/rotting-oranges/
   
   //DFS
   
   static class Pair{
       int x , y;
       Pair(int x , int y){
           this.x = x;
           this.y = y;
       }
   }

   
   
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
int total = 0, rooten = 0, time =0;

//Traversing the grid and it any cell contain rooten orange the we will take his Pair i and j where we can rooten the fresh orange
//also we are calculating how many total oranges are there in total variable
for (int i = 0; i < grid.length; i++) {
    for (int j = 0; j < grid[0].length; j++) {
        if(grid[i][j] == 1 || grid[i][j] ==2 ){
            total++;
        }

        if(grid[i][j] ==2){
            q.offer(new Pair(i, j));
        }
    }
}

     //this means there is no orange so 0 min will be taken
     if(total ==0) return 0;

     
     //Now traversing the queue aka dfs

     while(!q.isEmpty()){
         int size = q.size();
         rooten += size; 
         if(rooten == total) return time;   //this means all are rotten oranges so 0 min will be taken i.e time initalliy
  
          // if not then increment the time
         time++;

         //traversing our size queue
   for (int i = 0; i < size; i++) {
         Pair p = q.peek();

      //here we are checking if the current orange is rotten then asking him to check all his four side and give the pair i.e there cordinates (i,j) to q . thats what its q.offer(new Pair is) we are taking in pair 

         
         //this for  upside and also making sure that we doesn't cross the grid col and row wise both
         if(p.x +1 <  grid.length && grid[p.x+1][p.y] ==1){
             grid[p.x +1][p.y] =2;
             q.offer(new Pair(p.x +1, p.y));
         }
          //this for downside and also making sure that we doesn't cross the grid col and row wise both
         if(p.x -1 >=  0 && grid[p.x-1][p.y] ==1){
             grid[p.x -1][p.y] =2;
             q.offer(new Pair(p.x -1, p.y));
         }
          //this for right side and also making sure that we doesn't cross the grid col and row wise both

         if(p.y +1 <  grid[0].length && grid[p.x][p.y +1] ==1){
             grid[p.x ][p.y +1] =2;
             q.offer(new Pair(p.x , p.y +1));
         }
          //this for left side and also making sure that we doesn't cross the grid col and row wise both

         if(p.y -1 >=  0 && grid[p.x][p.y -1] ==1){
             grid[p.x][p.y -1] =2;
             q.offer(new Pair(p.x, p.y -1));
         }
         q.poll();
   }

     }
     return -1;

    }
    public static void main(String[] args) {
        
    }
}
