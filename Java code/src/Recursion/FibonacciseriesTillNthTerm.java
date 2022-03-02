public class FibonacciseriesTillNthTerm {

public static void printFibnonacci(int a , int b , int n ) {            //a is second last term and b is last term 
   if(n==0){                //if n reaches 0 return from the recurison
       return;
   }
  
    int c = a + b;            
    System.out.println(c);
    printFibnonacci(b, c, n-1);//this is our recursion          here our a has became b AND b has became c and n is going by minus 1
}

    public static void main(String[] args) {
        int a = 0;               //declaring 1 and 2 term bcz they are gonna be same 
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n= 7;
        printFibnonacci(a, b, n-2);    //n-2 bcz we already have declared 2 terms 0 and 1
    }
}


//steps
//1.given  first and second term is 0 and 1
//2. worktobeDone- create the next term by formula c = a+b
//3.base case stop if reaches to nth term
