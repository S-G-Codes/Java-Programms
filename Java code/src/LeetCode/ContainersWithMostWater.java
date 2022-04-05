import javax.lang.model.util.ElementScanner6;
import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

public class ContainersWithMostWater {
    // https://leetcode.com/problems/container-with-most-water/
    //Approch     //TC O(n)

    //Brute Force - Two neseted loop calculate each area and return the max one but TC is not efficent

    //OPtimized
    //1. we will be using two pointer one from 0 and second from length -1
    //2. Take a max variable to count the max water container can contain
    //3. then we will traversee until our low < high
    //4 . To calculate the total area we need width we can calculate that by the differnce between  low - high;
    //5.. Then we will be taking min of arr[low] and arr[high] bcz   we are taking min bcz it will make sure water doesn't overflow from the container
    //6. calculate the area by height * width we calculated (height is already given in array)
    //7 . then we will add the max area in max variable by using the previous max value and current one
    //8 . then we will simply increase the our pointers base on their height whoever is small increase them
    //9 . return max 
    public int maxArea(int[] height) {
         
        int low = 0;
        int high = height.length -1;
        int max = 0;

        while(low < high){
            int width =   high - low;
            int  h = Math.min(height[low], height[high]);
            int area = width * h;
            max = Math.max(max, area);

            if(height[low] < height[high]){
                          low++;
            }else if( height[ low] > height[high]){
                high--;
            }else{
                low++;
                high--;
            }
        }
        return max;
       
    }
    public static void main(String[] args) {
  
    }
}
