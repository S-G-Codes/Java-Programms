import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ShiftTWODGrid {
    // https://leetcode.com/problems/shift-2d-grid/

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
     
        int m = grid.length;
        int n = grid[0].length;
        int totalNo = m *n;
        int start = totalNo - k % totalNo; //this formula helps us to get the index pos of the element in 1d Array // try it for 9 in Eg 1 its 1d array index will be 8.
        LinkedList<List<Integer>> ans = new LinkedList<>();
         
        //total + start because for start if we see in our eg 9 is at 8 index in 1d array and before that we have total of 8 element so need to traverse those right so thats why total + start;
        for (int i = start; i < totalNo + start; i++) {
             //finding the next position for i element
                 int moveIndex =  i % totalNo;          // i % totalno bcz if we see in eg 1 in 1D array we have start i.e 8  and we need to find the right position of that element for whatever k times. so in 1D array there index would be calcaulted by i % total  i.e(8 % 9 = 8)
                 //converting 1d to 2D 
                 int moveRow = moveIndex /n;   //for eg 1 moveIndex is 8 and n =3  i.e  8/3 = 2
                 int moveCol = moveIndex % n;   //same for col   i.e  8 % 3 = 2. so the row and col indexs are (2,2) .This is how we will calulate the index of 2D matrix
               
                 //this check to make sure that we are not iteraing again through the same row 
                 //for eg 1 i.e   (8 - 8) % 3  = 0 and also its == 0 so yes we are not iterating it again you can make a arraylist for those 2 index
                 if(( i -start) % n ==0){
                  ans.add(new ArrayList<>());
                   }
                   //this helps us to add the element at his right position  i.e after kth shift position
               ans.peekLast().add(grid[moveRow][moveCol]);
                }      
return ans;
    }
    public static void main(String[] args) {
        
    }
}
