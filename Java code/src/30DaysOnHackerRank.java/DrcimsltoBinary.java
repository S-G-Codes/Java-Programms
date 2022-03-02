import java.util.Scanner;

public class DrcimsltoBinary {

public static void decToBin(int n )  {
 int binary [] = new int [32];

 int i =0;
 while(n>0){
    binary[i] = n%2;
    n = n/2;
    i++;
 }
 //reversing the arrray
 for (int j = i-1; j >=0; j--) {
     System.out.print(binary[j]);
 }
    
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decToBin(n);
        sc.close();
    }
}


//algo
//1. take the decimal no from user
//2. write a fn taking that no as paramter
//3. create a empty array to store the binary no
//4. intialize a variable i i.e our index for array starts from 0
//5. run a while loop where n is > zero
//6. divide the n by 2 and save the reaminder in i index of arrray
//7. now again divide the n by 2 and now store the quointent in n
//8. increment the index of array by 1
//9. reverese the array
//10. call the fn in main method