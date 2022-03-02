import java.util.function.Function;

class Student {
    String name;
    int age;


    public void studentInfo() {

        System.out.println(this.name);        //this.variableName helps to access the variable from object
        System.out.println(this.age);

    }
    //1. non parameterised const
Student(){
    //Note if you dont make this java will make  make a default for you
}

//2. Parameterised constructor
//While using this you will have to pass the value whenever you'll create Student constructor
    Student(String name , int age){
   this.name = name;          //here this.name is object name and name is parameter
   this.age = age;
    }


    //3. Copy Constructor
     //User has to make this on his own 
     //His job is to copy a object and paste it into other 
     //NOTE : If you havent made a non parameterised constructor before you will need to make one 
     //bcz complier will call student() first and then the s1 and s2

     Student(Student s2){                  //student s2 is our second object we are gonna copy properties from s1 and paste it into s2
      this.name = s2.name;   //here this.name is object name and name is parameter
      this.age = s2.age;
     }

} 




public class SecondEgofObjectandClasses {
    public static void main(String[] args) {
        //creating object
        // Student s1 = new Student("Tuffy" , 34);   //this for parameterised constructor
        Student s1 = new Student();
         s1.name = "Tuffy";
        s1.age = 44;


        //second object

        Student s2 = new Student(s1);
        s2.studentInfo();

    }
    
}
