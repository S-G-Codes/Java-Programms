public class oneToFive {



    public static void printNum(int n ) {               //Fn 
        if(n==6)                 //setting our base class
        return ;
        System.out.println(n);          
        printNum(n+1);             //this is our  recusrion  and we are increasing it by one bcz we know we have to go from 1 to 5
    }
    public static void main(String[] args) {
        int n = 1;
        printNum(n);    //n=1

    }
}
