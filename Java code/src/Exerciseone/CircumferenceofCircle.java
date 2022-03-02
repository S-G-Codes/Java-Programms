import java.util.Scanner;

public class CircumferenceofCircle {
public static double Circumference(int r){
     double circum = 2*(3.14*r);
     return circum;

}



 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius: ");
    int r = sc.nextInt(); 
    System.out.println("Circumference is :" + Circumference(r));
 }   
}
