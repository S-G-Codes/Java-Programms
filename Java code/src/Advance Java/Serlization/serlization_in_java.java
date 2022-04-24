import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serlization_in_java {

    // Serializable means converting an object into a byte code to send over a network to another machine
    // also to convert from byte to object DeSerilization is used
 static   class Student implements Serializable{
   
        private static final long serialVersionUID = 1L;     //this works like a security id feature and also as version control thing. Like suppose I seriazlize 3 times and its inital version was 1 so it by default increase by 1 so here it will be 3rd version and also it helps to verify at the other end if someone try's to hops in to your network and change something this UID will let you know



           private String name;
           private int age;
           private String address;
         
        //    transient is a keyword. if we make a varible transient that means it won't get serilize can be handy!
           transient int x;
           
        //    constructor of class Student

        public Student(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        // setter for name,age, addresss
        public void setName(String name){
            this.name = name;
        }

        public void setAge(int age){
            this.age = age;
        }
         
        public void setAddress(String address){
            this.address = address;
        }
        public void setX(int x){
            this.x = x;
        }

        // getters for name,age,address

        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }

        public String getAddress(){
            return address;
        }

        public int getX(){
            return x;
        }

  
        // just to print the objects
        public String toString(){
            return ("Student name is " + this.getName() + ", age is : " + this.getAge() + " and address is: " + this.getAddress());
        }
    }
    public static void main(String[] args) {
        Student student = new Student("Tuffy", 44, "44, west Lonavala!");
       
        // checking transient thing
      student.setX(10);



        // here we are serilization over same local machine so for that all this filepath and input, output stuff
        String filename = "C:\\Java Programms\\Java code\\src\\Advance Java\\Serlization\\serlization.txt";
         FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;

        // Serialization 
        try {
            fileOut = new FileOutputStream(filename);
            objOut = new ObjectOutputStream(fileOut);
              
            // writing as a object using writeobject method also now Student class has become a object now
            objOut.writeObject(student);    //write student object in filename variable which is our path

            objOut.close();
            fileOut.close();

            System.out.println("Object has been serialized : \n" + student);
        } catch (IOException e) {
            System.out.println("IOExpec occured" + e);
        }

        // Deserialization
        FileInputStream fileIn = null;
        ObjectInputStream objIn = null;

        try {
            fileIn = new FileInputStream(filename);
            objIn = new ObjectInputStream(fileIn);
           
            // reading the file readObject doest not that its an object so we need to typecaste it
            Student object = (Student) objIn.readObject();

            System.out.println("Object has been deSerialize : \n" + object);
         
            // so here it will print 0 instead of 10 as we set it thats because of transient keyword
            System.out.println("deserilizae value of x : " + object.getX());
         
         
            objIn.close();
            fileIn.close();
        } catch (IOException e) {
           System.out.println("IOExpection is caught"); 
        }catch(ClassNotFoundException e){
       System.out.println("ClassNotFoundException has occured");
        }
    }
}
