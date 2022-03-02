import java.util.Scanner;

public class EligibleToVote {

 public static int VoteORNot(int age){
    //  age > 18 ? System.out.println("You can") : System.out.println("You cant");
    if (age>=18) {
        System.out.println("You are Eligible to vote");
        return age;
    } else {
        System.out.println("You are NOT Eligible to vote");
        return age;
    }
 }


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age: ");
    int age = sc.nextInt(); 
      VoteORNot(age);
    }
}
