public class ReverseAStringIII {
    // url https://leetcode.com/problems/reverse-words-in-a-string-iii/
   static public String reverseWords(String s) {
        char [] arr = s.toCharArray();

        int i =0;
        int j =0;
        for (; i < arr.length; i++) {
            if(arr[i] == ' '){
                reverse(arr, j, i-1);
                j = i+1;
            }
        }

        reverse(arr, j , arr.length -1);
        return new String(arr);
    }

    static void reverse(char[] arr , int i, int j){
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; 
            j--;
        }
    }
    public static void main(String[] args) {
        String s = "God Ding";
     System.out.println(reverseWords(s));   
    }
}
