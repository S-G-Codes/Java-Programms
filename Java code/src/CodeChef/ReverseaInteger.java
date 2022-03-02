import java.util.*;

public class ReverseaInteger {
    public static void main(String[] args) {
        try {
            int sum =0;
    int rem;
    
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
     
        int arr[] = new int[t];
        for (int i =0;i< t ;i++ ){
            arr[i] = sc.nextInt();
            }  

     for (int i = t-1; i >=0; i--) {
         System.out.println(arr[i] + " ");
     }
        
    


     
 } catch(Exception e) {
     System.out.println(e);
 }
    }
}
