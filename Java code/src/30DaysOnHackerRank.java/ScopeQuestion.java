import java.util.Arrays;
import java.util.Scanner;


class Differnence{
    private int [] elements;                  
    public int maximumDifference;         

   public Differnence(int []elements){         //constructor difference
       this.elements = elements;
   }

   void computeDifference(){         //fn to find maximum difference 
       int N = elements.length;
       Arrays.sort(elements);         //sort() helps to sort the array in asecending Order
       maximumDifference = Math.abs(elements[N-1]-elements[0]);   //abs() return the positive  int enters EG- if we enter -4 the 4 will be return 

   }
}









public class ScopeQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //size of Array
        int [] a = new int[N];           //actual array
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        Differnence differnence = new Differnence(a);   //making a constructor and passing our array
        differnence.computeDifference();         //calling our fn to cal the values
        System.out.println(differnence.maximumDifference);
    }
}



//Scope is variables defines that how a specific varible is accessible within the program or across classes 





//Algo for this question
//1. make a class called as Difference
//2. Make a private Integer array name as elements for storing non negative integers
//3. Make a public integer name a maximum Difference for storing max absoulte difference
//4. make a constructor with paramter of array of integers
//5. write a fn that finds the max absolute difference of any numbers in _elements and store it into max difference insstance variable
