import java.util.*;
public class PIZZA {
    private static int T;
     private static int X;
      private static int Y;
       private static int Z;
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
		
		    T = sc.nextInt();
		    for (int i =0; i<T ;i++ ) {
		        X = sc.nextInt();
		          Y = sc.nextInt();
		            Z = sc.nextInt();
                    
                        if(Y<=X){
                         System.out.println("PIZZA");
                         
                     }else if(Z<=X){
                         System.out.println("BURGER");
                     }
                     else{
                            System.out.println("NOTHING");
                     }
		    } 
            
         
        } catch (Exception e) {
            System.out.println(e);
        }
     

	
    }
}
