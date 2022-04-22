public class Enumeration_types {

    // enum are just like varibles but constant and has it own decleartion and Interval values

    // Decleration of enum
    public enum Colors{
        RED("red") , DATASTRUCTURE("ds"), WHO("World Health Organization");


          private String value;                          //this code to for extracting values 

          Colors(String value){                               //constructor
              this.value = value;
          }
 
          public String getValue(){                           //Getter method for getting values
               return value;
          }

    }
    
    public static void main(String[] args) {
        
        Colors c1 = Colors.RED;                           //object 
 

        System.out.println(c1.name());                 //to get the name of the enum 
        System.out.println(c1.getValue());            //to get the value of the enum we call out getvalue method

        for (Colors color : Colors.values()) {
              System.out.println("Enum names  : " + color.name() + " Enum values  : " +  color.getValue());
        }

    }
}
