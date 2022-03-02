public class FactorinalOfN {
public static int calFactorial(int n ) {
    if(n==1 || n==0){       //base case n==0 bcz 0 factorail is 1 and also of 1
        return 1;
    }
   int fac_ofN_minusOne =  calFactorial(n-1);      //recursion // this for 4 , 3,2,1 and so on 
int fac_of_N = n * fac_ofN_minusOne;          //now multiplying n * n-1 i.e 5*4, 5*3 and so on 
return fac_of_N;


}



    public static void main(String[] args) {
        int n =5;
     int answer =    calFactorial(n);
     System.out.println(answer);
    }
}


//steps 
//1. define n
//2. calculating factorial  n-1
//3. multiply n with n-1;
//4. return 
//5. base cond n ==1 return 1  //bcz 1 factorail is 1