import java.util.Scanner;

public class Factorail {

public static void printFactorail(int num1){
    if(num1<0){
        System.out.println("Invalid no");
        return;

    }
    //loop
    int factorail = 1;
    for (int i = num1; i>= 1; i--) {
        factorail = factorail *i;
        
    }
    System.out.println(factorail);
    return;
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

  printFactorail(num1);
    }
}
