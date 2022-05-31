import java.util.HashSet;

public class Check_If_A_String_Contains_All_Binary_code {
      //Tc  O(n-k * k)
    //Space  O(2 ^k)
    public boolean hasAllCodes(String s, int k) {
            int n = s.length();

            if( n < k)  return false;
            
            HashSet<String> h = new HashSet<>();


            for (int i = 0; i <=  n - k; i++) {
                 h.add(s.substring(i, i + k));
            }

            return  h.size() == Math.pow(2, k);
    }
    public static void main(String[] args) {
        
    }
}
