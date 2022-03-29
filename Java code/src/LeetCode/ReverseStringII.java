public class ReverseStringII {

 static   public String reverseStr(String s, int k) {
        char [] arr = s.toCharArray();

          int low = 0;
          while(low < arr.length){
            int high = Math.min(low + k-1, arr.length -1);   //this to make sure it doesn't cross the string length
            swap(arr, low, high);
             low += 2*k;    //we have to go from 0 -> 4 -> 8 and so on

          }
          

     
      return new String(arr);
            
    }


    public static void swap(char[] arr, int low , int high){
        while(low<high){
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high]  = temp;
            
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k =2;

        System.out.println(reverseStr(s, k));
    }
}
