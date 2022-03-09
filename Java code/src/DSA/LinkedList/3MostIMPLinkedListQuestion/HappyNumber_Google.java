

public class HappyNumber_Google {
//url  = https://leetcode.com/problems/happy-number/



public boolean isHappy(int n) {
        int fast = n;           //starting from n as per question
        int slow = n;

        do{
            slow = findSquare(slow);     //increasing slow by 1 and fast by two
            fast = findSquare(findSquare(fast));

        }while(fast!= slow);       //until our fast is not equal to slow or you can say cycle detection

        if(slow ==1) return true;   //ans found
        

        return false;      
}


private int findSquare(int num){
    int ans = 0;
    

    //dry run for 19 below loop you will get the ans i.e 1
    while(num > 0){       
        int rem = num%10; 
        ans += rem * rem;
        num = num/10;

    }
    return ans;   //ans will be found when it will contain 
}
    public static void main(String[] args) {
        
    }
}
