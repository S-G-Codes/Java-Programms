import java.util.Scanner;

public class JavaDataTypes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            try {
                
            
            
            long x = sc.nextLong();

            System.out.println(x + " can be fitted in:");
            if(x>= -128 && x<=127){          //this cond for byte   //this is are there byte mini and max value
                   System.out.println("* byte");
            }
            if(x>= -32768 && x<=32767){      //this cond for short
                System.out.println("* short");
            }
            if(x>=-2147483648 && x<=2147483647  ){     //for int
                System.out.println("* int");
            }
            System.out.println("* long");
        
    }catch (Exception e) {
        System.out.println(sc.next()+ " can't be fitted anywhere.");
        }
    }
}
}
