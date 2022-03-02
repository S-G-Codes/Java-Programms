import java.util.Scanner;

public class addingtwoNoWithoutPLUSoperator {
    public static int Sum(int a , int b) {
        while(b!=0){
            int carry = a & b;
            a = a^b;
            b = carry << 1;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(Sum(a, b));
    }
}


// Algo
// 1. loop untill our b is not equal zero
//2. using bitwise & between a and b and store it into a variable
//3. use a bitwise ^ operator on a and b using a
//4. make b  equals to leftshift by 1 of the above variable
//5. return a