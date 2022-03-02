import java.util.Scanner;

public class day30Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TestCases = sc.nextInt();
        for (int i = 0; i < TestCases; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            System.out.println(solve(N,K));
        }
        sc.close();
    }

     static int solve(int N, int K){
        int result = 0;
        for (int i = 0; i <=N; i++) {
            for (int j = i +1 ; j <= N; j++) {
                int current = i & j;
                if(current > result && current < K){
                    result = current;
                }
            }
        }
        return result;

    }
}
