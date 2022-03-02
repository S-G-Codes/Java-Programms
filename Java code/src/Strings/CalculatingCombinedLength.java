import java.util.Scanner;

public class CalculatingCombinedLength {
    public static void main(String[] args) {
        // Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Size of Array: ");
        int size = sc.nextInt();

        String array[] = new String[size];
        int toLength = 0;

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextLine();
            toLength += array[i].length();
            
        }
        
        System.out.println(toLength);

    }
}
