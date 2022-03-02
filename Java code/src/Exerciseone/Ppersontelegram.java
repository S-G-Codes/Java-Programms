import java.util.Scanner;


public class Ppersontelegram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int F = sc.nextInt();
        int count = 0;

        for (int i = 2; i <= F; i++) {
              if(P % 2 ==0){
               count = F;
              }else{
                count = F++;
              }
            }
            System.out.println(count);
    }
}
