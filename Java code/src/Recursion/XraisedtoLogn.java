
 //here stack height became logn and space and time has been saved
public class XraisedtoLogn {
    public static int calPower(int x , int n) {
        if(n==0){          //base cond 1 //we know that x raised to 0 is 1
            return 1;
        }
        if(x==0){           //base cond 2 //for x=0 return 0
            return 0;
        }
        //if n is even
        if(n% 2 ==0){
            return calPower(x, n/2) * calPower(x, n/2);
        }else{
            //if n is odd
            return calPower(x, n/2) * calPower(x , n/2) * x;
        }
    
    }
    public static void main(String[] args) {
        int x = 2;
    int n = 5;
  int ans =   calPower(x, n);
    System.out.println(ans);
    }
}
