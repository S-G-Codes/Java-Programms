import java.util.Scanner;

public class XraisedToY {
   
 public static int  xraisedtoY(int x,int y) {
     int res =1;
   


    //  x raised to y can be written as  
    // if y is even then   a square raised to b/2
    //if y is odd then    x into x raised to y-1 

    // this will be a optimised way bcz the bitwise operator will directly work on bitss

     while(y>0){
         if((y&1) !=0){     //checking y is odd  //every odd no least significant bit will 1 and even no will be 0 
             res = res * x;

         }
         x = x*x;          //if x is even  //even least significant bit is always 0
         y = y>>1;         //right shift by 1 will simply divide it by 2
     }
     return res;
 }


    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the base no: ");
    int x = sc.nextInt(); 
    System.out.println("Enter the Raised to no: ");
   int y = sc.nextInt(); 



// int result =1;

// for (int i = 0; i < y; i++) {    //one way
//     result *= x;
    
// }
// System.out.println(result);



System.out.println(xraisedtoY(x, y));

}
}
