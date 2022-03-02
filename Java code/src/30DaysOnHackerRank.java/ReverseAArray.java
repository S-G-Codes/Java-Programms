import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;




public class ReverseAArray {
    // public static void reverse(int a[], int n) {   //n is length of array
    // this using a temp variable and storing it into a new array i.e is b here 
        //   int b [] = new int[n];        //making a new array of size of n 
    //   int j = n;                   //temp variable
    //   for (int i = 0; i < n; i++) {
    //       b[j-1] = a[i];
    //       j = j-1;

    //   }
    //         System.out.println("REversed array is: ");
    //         for (int i = 0; i < n; i++) {
    //             System.out.println(b[i]);
    //         }



  //this using swapping   
//   int i, k, t;
//   for (i = 0; i < n / 2; i++) {
//       t = a[i];
//       a[i] = a[n - i - 1];
//       a[n - i - 1] = t;
//   }

//   // printing the reversed array
//   System.out.println("Reversed array is: \n");
//   for (k = 0; k < n; k++) {
//       System.out.println(a[k]);
//   }



//3.Using Collection.reverse method
public static void reverse(Integer a[]) { 
    Collections.reverse(Arrays.asList(a));
    System.out.println(Arrays.asList(a));

     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();
            // int numbers[] = new int[size];
            Integer numbers[] = new Integer[size];   //this for collection method
            
            for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
            }
            // reverse(numbers, numbers.length);
            reverse(numbers);        //this for collection method 



            sc.close();

    }
}
