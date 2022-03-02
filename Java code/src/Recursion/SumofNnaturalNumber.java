public class SumofNnaturalNumber {

    public static void printSum(int i , int n , int sum) {   // n is natural no , i is variable to increase it by one and also for condn and sum is for storing each sum 
        if(i==n){   //base cond 
            sum +=i;   //if base cond is satisified put the value in sum and return it
            System.out.println(sum);
            return;
        }
        sum += i;         //adding all the i values and storing it into sum 
        printSum(i+1, n, sum);    //this is where recursion happening and also increasing i 
       System.out.println(i);   //this to check i while returning down the stack
    }


    public static void main(String[] args) {
    printSum(1, 5, 0);         //passing values of parameter
    }
}


//steps
//1. main fn pass 1;
//2 Setting BASE cond
//3. calculating  sum