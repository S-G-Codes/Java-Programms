public class BubbleSort {


    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
              System.out.print(arr[i]+" ");
        } 
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        //bubble sort
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {  //-1 bcz the element which is sorted is at last same as i 
                if(arr[j]>arr[j+1]){
                    //swaping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1 ]= temp;
                } 
            }
        }
        printArray(arr);
    }
}

//TC  O(n^2)       Big O of n square 