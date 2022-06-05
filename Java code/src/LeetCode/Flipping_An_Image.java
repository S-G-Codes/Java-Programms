public class Flipping_An_Image {
    //Input           1 1 0
    //                1 0 1
    //                0 0 0
                  
    // Horizontal     0 1 1
    //                1 0 1
    //                0 0 0 
                  
    //Inverted & ans  1 0 0 
    //                0 1 0
    //                1 1 1 

    
    public int[][] flipAndInvertImage(int[][] image) {
                    for (int i = 0; i < image.length/2; i++) {
                           int lastIndex = image.length-1;
                           int [] temp = image[i];
                            image[i] = image[lastIndex - i];
                            image[lastIndex - i] = temp;
                    }  
            }


       
    
    public static void main(String[] args) {
        int image[][] = {{1,1,0},{1,0,1},{0,0,0} };


    }
}
