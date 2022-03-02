
public class MergeSortExOne {

public static void conquer(int arr[] , int si, int mid, int ei) {
    int merged[] = new int[ei-si +1];
    int index1 = si; //tracking our first divided half
    int index2 = mid+1; //tracking our second divided half
    int x = 0;      //this for tracking out merged array
    
    while(index1 <= mid && index2 <=ei){ //comparing both the divided array
        if(arr[index1] <= arr[index2]){   //if element at index 1 in first half is smaller than index2 in second half
            merged[x++] = arr[index1++];  //then add that element in merged array and keep going for next i.e x++ and index1++

        }else{
            merged[x++] = arr[index2++];  //if the other one is bigger

        }
    }

  //making sure first half is travased till the end
  while(index1 <= mid){
      merged[x++] = arr[index1++];
  }
  //for second half
  while(index2 <= ei){
      merged[x++] = arr[index2++];
  }

  //copying the merged array into original array
  for (int i =0, j= si; i < merged.length; i++ , j++) {
      arr[j] = merged[i];
  }

}

    public static void divide(int arr[], int si, int ei) {
        //base cond
        if(si>= ei){
return;
        } 
        //finding mid
        int mid = si +  (ei-si)/2;

        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr , si, mid, ei);
    
    }
    public static void main(String[] args) {
        int arr[] = {3,2,5,8,6,4};
        int n = arr.length;
        divide(arr, 0, n-1);
        //printing 
        for (int i = 0; i < n; i++) {
             System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
      
}


