import java.util.*;
import java.util.Scanner;
public class StarPatterns{
    public static void main(String arg[]) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter the n: ");
int n = sc.nextInt();

System.out.println("Enter the m: ");
int m = sc.nextInt();


for(int i =1; i<=n; i++){
   for(int j =1; j<=m; j++){
       System.out.print("* ");
   }
   System.out.println();
}
        
    }
}