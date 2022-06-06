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

    
static    public int[][] flipAndInvertImage(int[][] image) {
           
    

 for (int i = 0; i < image.length; i++) {
     
 
        int low = 0;
        int high = image[i].length -1;

        while(low< high){
           int temp = image[i][low];
           image[i][low] = image[i][high];
           image[i][high] = temp;

              low++;
              high--;
        }
    }

             
        for (int i = 0; i < image.length; i++) {
             for (int j = 0; j < image[0].length; j++) {
                   if(image[i][j] == 1){
                       image[i][j] = 0;
                    }else{
                       image[i][j] = 1;

                   }
             }


        }

        return image;

            }


       
    
    public static void main(String[] args) {
        int image[][] = {{1,1,0},{1,0,1},{0,0,0} };
         
        System.out.println(flipAndInvertImage(image));

    }
}
