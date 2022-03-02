import java.util.Scanner;

public class lexicographicalQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      String a = sc.next().toLowerCase();
        String b = sc.next().toLowerCase();
        
        

        System.out.println(a.length() + b.length());
        if(a.compareTo(b) > 0  ){
                System.out.println("Yes"); 
        }else{
        System.out.println("No");
        }
        String FirstLetterofA = a.substring(0, 1);
        String FirstLetterofB = b.substring(0, 1);
        String ReaminingLetterofA = a.substring(1, a.length());
        String ReaminingLetterofB = b.substring(1, b.length());

  FirstLetterofA = FirstLetterofA.toUpperCase();
  FirstLetterofB = FirstLetterofB.toUpperCase();
    a = FirstLetterofA + ReaminingLetterofA;
    b = FirstLetterofB + ReaminingLetterofB;
        System.out.println( a + " " + b);
    }
}
