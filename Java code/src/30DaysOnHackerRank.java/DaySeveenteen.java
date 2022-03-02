import java.util.Scanner;

class Calculator{


    public static int power(int n , int p) throws Exception {
        if(n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        
        }else{
        int result =1;
 
for (int i = 0; i < p; i++) {
    result *= n;
    
}
return result;
}
    }
}

public class DaySeveenteen {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
         int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
              int n = sc.nextInt();
              int p = sc.nextInt();

              Calculator c1  = new Calculator();
              try {
                int res =       c1.power(n, p);
                System.out.println(res);
              } catch (Exception e) {
                  System.out.println(e.getMessage());
              }
      
              
         }
         sc.close();
    }
}
