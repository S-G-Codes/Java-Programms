public class TotalPathinmatrix {
  //Rule is path should be only downwards or rightsides

    
    public static int countpath(int i , int j , int n , int m){      //i and j are starting indexes   // i means going down and j means going right 
        if(i==n || j ==m){             //this means i and j has reaches corner so no chance going any where return 0 
            return 0;         
        } 
        if(i == n-1 && j == m-1){        // this means n and m has reached to final box
            return 1;
        }
        //counting downwards possible path            i 
           int downwordsPath = countpath(i+1, j, n, m);  
           
           // counting rightSide path 
           int rightSide = countpath(i, j+1, n, m);          
           return downwordsPath + rightSide;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;       
        int totalPath = countpath(0, 0, n, m);          //n is row and m is coloumn 
 System.out.println(totalPath);
    }
}


//TC
//to much high can be reduce us DP (Dynamic  programming )