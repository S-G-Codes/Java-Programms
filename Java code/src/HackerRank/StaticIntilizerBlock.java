import java.util.Scanner;

public class StaticIntilizerBlock {
  static int breadth , height;
  static boolean flag;

  static{
    Scanner sc = new Scanner(System.in);
     breadth = sc.nextInt();
     height = sc.nextInt();
     if (breadth >0 && height>0) {
         flag = true;
     } else {
         System.out.println("java.lang.Exception: Breadth and height must be positive");
     }


sc.close();
  }





    public static void main(String[] args) {
          if(flag){
              int area = breadth*height;
              System.out.println(area);
          }
          
        
    }

}
