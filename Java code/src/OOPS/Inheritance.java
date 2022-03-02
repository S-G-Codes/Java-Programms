


//Inheritance means inheriting the properties and method from the parent class.



// class Shape {           //this for Inheritance
//     String color;

// }
class Shape {                    //this for single leve Inheritance
     public void Area(){
         System.out.println("Area is: ");
     }

     //single level inheritance
     class Traingle extends Shape{
         public void Area(int l , int h){     //We inheritated Area fn from Shape
             System.out.println((1/2)*l*h);
         }
     }
    

  //MultiLevel inheritance
  //this means deriving many sub class from the parent.  It goes something like this Parent=>derived Class from parent => derieved class from parent
   
  class EquilateralTraingle extends Traingle{              //here inheriting from  triangle
      public void Area(int l , int h){
          System.out.println(l/2*l*h);
      }
  }



  //Hierarchal Inheritance
  //Inheriting many subclass from the parent class is know as Inheritance

   class Circle extends Shape{
       public void Area(int r){
           System.out.println((3.14 * r*r));
       }
   }


   //4.Hybrid Inheritance means all in One 
   





     }





// class Traingle extends Shape{   
//                 //inheriting properites from Shape
// }



public class Inheritance {
public static void main(String[] args) {

    // Traingle t1 = new Traingle();
    // t1.color = "REd";               //so here we didn't got any error so it means our Inheritance is working

 //nothing for Single level here bcz we arent gonna do any operation here
}
    
}





//There are four types of Inheritance 
//1. single level inheritance
  //only derived class will be there for single level heritance
