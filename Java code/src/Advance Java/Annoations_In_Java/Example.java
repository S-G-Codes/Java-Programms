import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class Example {

    // Annoation is nothing but telling complier something. it doesn't affect the programm its like a metadata 


    // custom Annoation in making
    @Target(ElementType.METHOD)                              //this to tell complier to use this annoation only on methods
    @Retention(RetentionPolicy.RUNTIME)                          //to tell to use at runtime
  public @interface MyCustomAnnoation{
      int value();                                                 //value
  } 



  @MyCustomAnnoation(value = 10)
 static public void sayCheese(){
      System.out.println("CHESEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEe");
  }

     public static void main(String[] args) {
         
        //refer to know how to use your custom Annoation
      
        Example eg = new Example();
    Method methodval = eg.getClass().getMethod("sayCheese");

    MyCustomAnnoation myCustomAnnoation = methodval.getAnnotation(MyCustomAnnoation.class);
    System.out.println("value in custom Annoation was: " + myCustomAnnoation.value());

     }
}
