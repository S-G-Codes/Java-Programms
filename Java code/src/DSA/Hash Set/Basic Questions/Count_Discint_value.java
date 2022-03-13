import java.util.HashSet;
import java.util.Set;

public class Count_Discint_value {


    public static int distinctElement(int arr[]) {
        HashSet<Integer> s = new HashSet<Integer>();
    // for (int element : s) {
    //     s.add(element);
        
    // }

    for (int i = 0; i < arr.length; i++) {
          s.add(arr[i]);
    }
    return s.size();
        
    }
    public static void main(String[] args) {
        int arr[] = new int [] {2,1,3,5,2,1,5,4,6,7,8};
        System.out.println(distinctElement(arr));
        
        
    }
}
