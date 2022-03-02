import java.util.Scanner;

public class chefLand {
    private static int A;
    private static int B;
    private static int C;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        int TotalC = 101;
        while(T-- !=0 ){
 A = sc.nextInt();
 B = sc.nextInt();
 C = sc.nextInt();
        }
     
       if(A + B + C == TotalC){
           if(A>50){
               System.out.println("A");
           }
           if(B>50){
            System.out.println("B");
        }
        if(C>50){
            System.out.println("C");
        }
       }else{
           System.out.println("NOTA");
       }
    }
}
