import java.util.Scanner;

public class FindingAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];


//taking input
System.out.println("Enter the Array values one by one: ");
for (int i = 0; i < size; i++) {
    numbers[i] = sc.nextInt();
    
}

boolean isAscending = true;

for (int i = 0; i < numbers.length -1; i++) {
    if(numbers[i] > numbers[i+1]){
        //this cond for descending order
        isAscending = false;

    }

}

if (isAscending) {
    System.out.println("The Array is in ascending Order");
    
} else {
    System.out.println("The Array is not sorted in ascending Order");

    
}




    }
}
