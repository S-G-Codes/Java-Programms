import java.util.Arrays;

public class Max_area_piece_of_cake {
    // https://leetcode.com/problems/maximum-area-of-a-piece-of-cake-after-horizontal-and-vertical-cuts/
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
       Arrays.sort(horizontalCuts);   
       Arrays.sort(verticalCuts);
       
       int maxHeight = Math.max(horizontalCuts[0] - 0 , h - horizontalCuts[horizontalCuts.length-1]);

       for (int i = 1; i < horizontalCuts.length; i++) {
          int horizontalWidth = horizontalCuts[i] - horizontalCuts[i-1];
          maxHeight = Math.max(maxHeight, horizontalWidth);
       }

       int maxWidth = Math.max(verticalCuts[0] - 0, w - verticalCuts[verticalCuts.length-1]);

       for (int i = 1; i < verticalCuts.length; i++) {
          int verticalWidth  =  verticalCuts[i] - verticalCuts[i-1];
          maxWidth = Math.max(maxWidth, verticalWidth);
       }

       long ans = 1L * maxHeight * maxWidth;

       return (int) (ans % 1000000007);
    }
    
    
    public static void main(String[] args) {
        
    }
}
