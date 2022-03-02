
class Student { // parent class
    String name;
    int age;

    //poly means you can use same fn Name again and again but has some rules Have a Look at comments in  bottom
    public void studentInfo(String name) { // Poly 1
        System.out.println(name);

    }

    public void studentInfo(int age) { // Poly 2
        System.out.println(age);

    }

    public void studentInfo(String name, int age) { // Poly 3
        System.out.println(name + " " + age);

    }

}

public class Poly {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Tufffy";
        s1.age = 55;

        s1.studentInfo(s1.name, s1.age);
    }
}

// Polymorphism is the ability to present the same interface for differing
// underlying forms (data types). With polymorphism, each of these classes will
// have different underlying data. Precisely, Poly means ‘many’ and morphism
// means ‘forms’.

// Types of Polymorphism IMP
// 1. Compile Time Polymorphism (Static)
// 2. Runtime Polymorphism (Dynamic)
// Let’s understand them one by one :
// Compile Time Polymorphism : The polymorphism which is implemented at the
// compile time is known as compile-time polymorphism. Example - Method
// Overloading

// Method Overloading : Method overloading is a technique which allows you to
// have more than one function with the same function name but with different
// functionality. Method overloading can be possible on the following basis:
// 1. The return type of the overloaded function.
// 2. The type of the parameters passed to the function.
// 3. The number of parameters passed to the function.

// Runtime Polymorphism : Runtime polymorphism is also known as dynamic
// polymorphism. Function overriding is an example of runtime polymorphism.
// Function overriding means when the child class contains the method which is
// already present in the parent class. Hence, the child class overrides the
// method of the parent class. In case of function overriding, parent and child
// classes both contain the same function with a different definition. The call
// to the function is determined at runtime is known as runtime polymorphism.

 