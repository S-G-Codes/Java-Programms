import java.util.Arrays;
import java.util.Scanner;

public class RemovingLargerElemetfromElemet {
   
// url
// https://www.codechef.com/submit/MNMX
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int TestCase = sc.nextInt();

        for (int i = 0; i < TestCase; i++) {
            int size = sc.nextInt();
            long arr[] = new long[size];

            for (int j = 0; j < size; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[0]* (size-1));
        }
    }
}

// Simple input
// 2
// 2
// 3 4
// 3
// 4 2 5


// output
// 3
// 4
