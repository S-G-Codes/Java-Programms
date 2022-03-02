public class ArrayStoring {
    //Increasing order (Strictkly)

    public static boolean isSorted(int arr[] , int indexx) {   //passing two paramter a array and starting index 0
       if(indexx == arr.length-1){   //base cond    // if our index == to array.length-1  (-1 bcz arrray starts from 0 and length from 1)
           return true;
       }               
       
    //    if(arr[indexx] < arr[indexx+1]){   //checking current index and the next index 
    //        return isSorted(arr, indexx+1);   //if its true return it and check for the other ones (recursion)
    //    }else{
    //        return false;
    //    }

    //checking reverse cond

      if(arr[indexx] >= arr[indexx+1]){
          return  false;
      }
      return isSorted(arr, indexx+1);
    }
    public static void main(String[] args) {
        int arr[]= { 1,2,3,4};
        System.out.println(isSorted(arr, 0));
    }
}
