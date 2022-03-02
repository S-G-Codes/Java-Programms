import java.util.Scanner;

    class Person{
       protected String FirstName;
       protected String LastName;
       protected int idNumber;


       Person(String FirstName , String LastName , int identification){
           this.FirstName = FirstName;
           this.LastName = LastName;
           this.idNumber = identification;
       }

       public  void personData() {
           System.out.println("Name: " + LastName + ", " + FirstName + "\nID: " + idNumber );
       }
    }
    
    class Student extends Person{
           private int[] testScores;
           Student(String FirstName , String LastName , int identification, int [] testScores){
                super(FirstName, LastName, identification);
                this.testScores = testScores;
           }
           char calculate() {
               int total  = 0;
               for (int testScores : testScores) total += testScores;
               int avg = total / testScores.length;
               if(avg >=90 && avg <= 100) return 'O';
               if(avg >=90 && avg <= 100) return 'E';
               if(avg >=90 && avg <= 100) return 'A';
               if(avg >=90 && avg <= 100) return 'P';
               if(avg >=90 && avg <= 100) return 'D';
               return 'T';
           }
    }
    
    
    
public class Inheritance {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
         String FirstName = sc.next();
         String LastName = sc.next();
         int idNumber = sc.nextInt();
         int numScores = sc.nextInt();

         int testScores [] = new int [numScores];

         for (int i = 0; i < numScores; i++) {
                  testScores[i] = sc.nextInt();
         }
         sc.close();

         Student s = new Student(FirstName, LastName, idNumber, testScores);
  s.personData();
  System.out.println("Grades: " + s.calculate());
        
    }
}
