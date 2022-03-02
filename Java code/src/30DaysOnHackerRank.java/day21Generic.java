import java.util.Scanner;

class Printer <T> {
    public  <E> void printArray(E[] generic){
  for(E element: generic){
      System.out.println(element);
  }
   }
}

public class day21Generic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer [] intArray = new Integer[n];          //taking integer array as input 
        for (int i = 0; i < n; i++) {
            intArray[i] = sc.nextInt();
        }

        n =sc.nextInt();
        String [] stringArray = new String[n]; //taking string array as input
        for (int i = 0; i < n; i++) {
            stringArray[i] = sc.next();
        }


        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> StringPrinter = new Printer<String>();
        intPrinter.printArray(intArray );
        StringPrinter.printArray(stringArray );
        if(Printer.class.getDeclaredMethods().length >1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    }
}
