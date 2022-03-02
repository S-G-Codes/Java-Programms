public class XraisedtoPowerN {
    // XraisedtoPowerN this means multiplying x *x  till n times n is stack height here
 //here n is 5 that but our stack height is 6 so its okay not a big difference
public static int calPower(int x , int n) {
    if(n==0){          //base cond 1 //we know that x raised to 0 is 1
        return 1;
    }
    if(x==0){           //base cond 2 //for x=0 return 0
        return 0;
    }


    int xPownm1 = calPower(x, n-1);       //this is our recurion calculating n-1
    int xPown = x * xPownm1;    //muliplying it with x so we can get x raised to n
    return xPown;
}




    public static void main(String[] args) {
    int x = 2;
    int n = 5;
  int ans =   calPower(x, n);
    System.out.println(ans);
}
}


//1.given  x and n
//2. work to be done   calculate x raised to n -1
//then mulitply it with x so it will give x raised to n    //by this mathematic formula  x raised to n-1+1 is = x raised to n
//3.base case  if x raised to 0 will be 1 and x=0 the it will be 1 