public class BinarySearchforInfintearray {

public static int searchInfinte(int a[] , int k) {
    int low =0;
    int high =1;

    while(a[high] < k){
      low = high;
      high *=2;
    }
    return binarySearch(a,key,low,high);
}
 

public static int binarySearch(int a[] , int key , int low , int high) {
    // base case
    if(low> high) return -1;

    int mid =   low +(high-low)/2;

    if(a[mid] == key) return mid;

    if(key > a[mid]){
        return binarySearch(a, key, mid+1, high);
    }

    return binarySearch(a, key, low, mid-1);

}



    public static void main(String[] args) {
        
// We dont have  a infinte sorted array


    }
}
