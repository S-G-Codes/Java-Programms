import java.util.Scanner;

public class DaySix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TestCase = sc.nextInt();               //testcase as input 
        sc.nextLine();
        for (int i = 0; i < TestCase; i++) {                  
             String str = sc.nextLine();              //taking string as a input 
            char [] charArray = str.toCharArray();               //toCharArray split the string and make us a Array of String of same length
             for (int j = 0; j < charArray.length; j++) {
              
                 if(j%2==0){                        //giving even index no character and odd index no character 
                System.out.print(charArray[j]);

                 }
                }
                 System.out.print(" ");
                 for (int j = 0; j < charArray.length; j++) {
                    if(j%2 !=0){
                        System.out.print(charArray[j]);
        
                         }
                 }
            System.out.println();
                
                
            }
            
            
            
            
        }
}




//steps
//1. take testcase as a input
//2. Run testcase loop and take String as a input
//3. take that input string and find its length store it into a variable
//4. take that variable and iterate it for each character by using charAt fn 
//5. if the character is even place print it on left side and if it is odd print it on same line separted with space