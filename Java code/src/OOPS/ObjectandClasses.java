class Pen {                              //this is the class named pen class is the keyword and pen is name of that class
String color;                                //initalize some variables
String type;

public void write(){                                       //this fn in classes are called as Methods
    System.out.println("Writing Something!");
}
}

public class ObjectandClasses {                               //this is our object
  public static void main(String[] args) {                       //main fn
    Pen pen1 = new Pen();                                        //creating a object pen1 is variable name and Pen is object type and Pen() is a constructor which has no return type

    pen1.color = "Blue";                                      //using properties of classes using .
    pen1.type = "GelPen";

    pen1.write();                                                //calling the method from classes 
  }


}
    

