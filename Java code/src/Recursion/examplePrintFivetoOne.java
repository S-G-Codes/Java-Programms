public class examplePrintFivetoOne {


    public static void printNum(int n ) {               //Fn 
        if(n==0)                 //setting our base class
        return ;
        System.out.println(n);          
        printNum(n-1);             //this is our  recusrion  and we are decreasing it by one bcz we know we have to go from 5 to 1
    }
    public static void main(String[] args) {
       int n = 5;
        printNum(n);           //calling the fn and passing the parameter value

    }
}
