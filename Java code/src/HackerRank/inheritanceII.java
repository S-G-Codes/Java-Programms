

class Arithmetic{

    public static int add(int a, int b ) {
        return ( a + b); 
        
    }
}


class Adder extends Arithmetic{
             
}








public class inheritanceII {

    public static void main(String[] args) {
      


        Adder a = new Adder();                             
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());      //this getClass.getSuperClass and getName helps to get the class first then its superclass and then its name 
        
        System.out.println(a.add(10, 32) + " " + a.add(10, 3) + " " +  a.add(10, 10) + "\n");     //calling our fn and passing the paramters 
    }
}
