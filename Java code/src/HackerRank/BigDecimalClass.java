import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n+2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
for (int i = 0; i < n; i++) {    //traversing through our array
    
    //getting out first no
     BigDecimal First = new BigDecimal(s[i]);        //bigDecimal object
 
     int indexx = i;
     for (int k = i+1; k < n; k++) {
         //getting our second no
         BigDecimal Second = new BigDecimal(s[k]);
           
         //comparing first and second values
         //if first is greater than second than compare return 1
         if(Second.compareTo(First)==1){
         First = Second;
         indexx = k;
         }

     }

     //temp variable to store value of s[i]
String temp = s[i];
 s[i] = s[indexx];
 s[indexx] =temp;

}
for (int i = 0; i < n; i++) {
     System.out.println(s[i]);
}

    }
}


//The BigDecimal class provides operation for arithmetic, comparison, hashing, rounding, manipulation and format conversion. This method can handle very small and very big floating point numbers with great precision.