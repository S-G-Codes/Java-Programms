import java.util.Scanner;

public class objectandInstance {

    static class Person{
        private int age;

public Person(int initialAge){
    if (initialAge > 0) {
        age = initialAge;
        
    } else {
        System.out.println("Age is not valid, setting age to 0.");
        age =0;
    }
}



public void amIOld(){
    if (age<13) {
        System.out.println("You are young.");
    } else if(age<18) {
        System.out.println("You are a teenager.");
        
    }else{
        System.out.println("You are old.");
    }

   
}
        public void yearPasses() {
             age++;
    
}


    }







    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();                       //testcases 
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();              //taking age as input
            Person p = new Person(age);
            p.amIOld();            //checking that user is old or not
            
            for (int j = 0; j < 3; j++) {            //increasing age by 2 years by calling yearPasses fn and printing it 
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
