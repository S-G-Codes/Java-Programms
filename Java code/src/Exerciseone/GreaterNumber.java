import java.util.Scanner;

public class GreaterNumber {
public static void Greater(int num1 , int num2){
    if (num1> num2) {
        System.out.println(num1 + " is greater than " + num2);
        return;
    } if(num2> num1){
        System.out.println(num2 + " is greater than " + num1);
        return;
    }else{
        System.out.println("Both number are equal");
        return;
    }
    


}



  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt(); 
    int num2 = sc.nextInt(); 
    Greater(num1, num2);
  }  
}
