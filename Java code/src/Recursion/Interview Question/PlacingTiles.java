public class PlacingTiles {

    public static int printTiles(int n , int m){     // n is Floor space and tiles  are  1 x m
   if(n==m){  //if n and m is equal  then either tiles can be horizontally or vertically
       return  2;    //so only 2 ways
   }
   if(n < m){        //agar space  m is kam hai toh only horizontal tiles betenghe 
       return 1;    // so 1
   }

  //for placing vertical 
  int verticalPlacement = printTiles(n-m, m);   // here we are placing vertical so size will decrease so n-m

  //for placing Horizontal
  int horizontalPlacement = printTiles(n-1, m);  // here we are placing horizontally so total space meh seh -1 hoteh jayegha 

  return verticalPlacement + horizontalPlacement;  //finally finding the total ways 
   
  //PS- Draw a diagram to understand better
    }
    public static void main(String[] args) {
        int n = 3;
        int m =4;
        System.out.println(printTiles(n, m));
    }
}

//Tc is High 
//Use DP