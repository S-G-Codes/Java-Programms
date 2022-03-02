import java.util.Scanner;

public class UpdateTheBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the BIT you wanna update 1 or 0 : ");
        int opera = sc.nextInt();
        int n = 5; //0101
        int pos = 1;
        int bitMask = 1<<pos;

        if (opera ==1) {
            //set operation 
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            //for 0 do clear operation 
            int NOTofBitMask = ~(bitMask);
        int newNumber = n & NOTofBitMask;
        System.out.println(newNumber);
        }

        sc.close();
    }
}
