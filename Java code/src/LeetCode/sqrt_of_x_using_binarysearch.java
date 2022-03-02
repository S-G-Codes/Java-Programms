public class sqrt_of_x_using_binarysearch {

// Leetcode question no 69
// url https://leetcode.com/problems/sqrtx/
    public int mySqrt(int x) {
        // remember return type int hai toh long values koh int meh karna maat bulna
        if(x==1){              
            return x;
        }
        int low  =1;
        int high = x;          //since the square root will be less than x so our high will be x
        int ans = 0;
        
        while(low<=high){
            long mid = low + (high-low)/2;
            long square = mid * mid;
            
            if(square == x){         //agar humra square x keh equal hai matlab mid ka index kah square hai woh toh mid return kardoh
                return (int)mid;
            }else if(square > x){    //agar square x seh badha ata hai toh high humrah ans left side of mid hoga so high koh mid-1 kardoh
                high = (int)mid-1;
                
            }else{     //varna ans right side hoga toh left side puri discard kardon and and koh mid banov aur low koh mid+1
                   ans = (int)mid;
                low = (int)mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
