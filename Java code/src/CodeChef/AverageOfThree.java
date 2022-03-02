import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i =0 ; i<T;i++){
            int x = sc.nextInt();
            int theNum = x * 3;
            int num1 =0 , num2 =0,num3 =0;
            if(theNum % 2 ==0){
                num1 = 1;
                num2 = (theNum/2) -1;
                num3 = theNum/2;
            }else{
                num1 = 1;
                num2 = (theNum/2) -1;
                num3 = (theNum/2) +1;
            }
            System.out.println(num1 + " " + num2 +" " + num3);
        }
        sc.close();
    }
}
