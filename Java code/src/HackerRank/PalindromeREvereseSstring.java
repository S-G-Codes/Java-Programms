import java.util.Scanner;

public class PalindromeREvereseSstring {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
String str = sc.next();
boolean flag = true;

str = str.toLowerCase();

        for (int i = 0; i <str.length()/2; i++) {
            if(str.charAt(i)!= str.charAt(str.length()-i-1)){
flag = false;
break;
            }
            
        }
       if(flag){
           System.out.println("Yes");
        }else{
           System.out.println("No");
           
       }
        sc.close();
    }
}
