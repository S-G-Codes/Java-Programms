public class First_Missing_Positive {
    //url https://leetcode.com/problems/first-missing-positive/
    //amazon

    public int firstMissingPositive(int[] arr) {
        //Amazon Question
        //Note for me for More intuation see that Astronaut football wali book Thankyou!
        
        //simple cyclic sort algo
        
        int i =0;
        while(i < arr.length ){
            int correctIndex = arr[i] -1;
            if(arr[i] > 0 && arr[i]<= arr.length &&  arr[i] != arr[correctIndex]){
                swap(arr , i , correctIndex);
            }else{
                i++;
            } 
        }
        
        
        //find missing positive ones
        for(int index = 0;index<arr.length; index++){
            if(arr[index] != index+1){     //agar arr kah index is not equal to its actual index that we are calculating by index+1 then that no is missing
                return index+1;
            }
        }
        //edge case
        return arr.length+1; //this can be happen when the given array is sorted for eg 1,2,3,4 and we need to return smallest positive no that will be 5 bcz first of all its sorted so obviously the next smallest no will be after 4 here that will be 5 so its equal to it length i.e 4 +1 ie. 5 our answer
    }
    
    
    void swap(int [] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        
    }
}
