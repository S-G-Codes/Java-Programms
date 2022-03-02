public class QuickSortEX {

    
public static int parition(int arr[] , int Low , int high) {
    int pivot = arr[high];
    int i = Low-1;
   for (int j = Low; j < high; j++) {
       if(arr[j] < pivot){
             i++;
             //swapping
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
       }
   }
i++;
   int tempForPivot = arr[i];
   arr[i] = pivot;
   arr[high] = tempForPivot;
   return i;                //pivot indexxxxxxxxxx
}

    public static void QuickSort(int arr[] ,  int Low, int high) {
        if(Low < high){
            int pivotIndx = parition(arr,Low,high);
            QuickSort(arr, Low, pivotIndx-1);
            QuickSort(arr, pivotIndx+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        QuickSort(arr, 0, n-1);

        //print
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] +" ");
        }
        System.out.println();
    }
}
