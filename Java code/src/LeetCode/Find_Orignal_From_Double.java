public class Find_Orignal_From_Double {
    // https://leetcode.com/problems/find-original-array-from-doubled-array/
    public int[] findOriginalArray(int[] changed) {
        
        if(changed.length %2 !=0){
            return new int[]{};
        }


        int mid = changed.length/2;
        int[] ans = new int[mid];
        int[] freq = new int[100001];


        for (int no : changed) {
              freq[no]++;
        }

        int id = 0;

        for (int i = 0; i < freq.length; i++) {
            
            while(freq[i] > 0 && i*2 < 100001 && freq[i*2] >0){
          freq[i]--;
          freq[i*2]--;
          if(freq[i * 2] < 0){
            return new int[]{};
          }

          ans[id] = i;
          id++;
            }
        }

        for (int i = 0; i < freq.length; i++) {
                if(freq[i] !=0 ) return new int[]{};
        }
        return ans; 
    }
    public static void main(String[] args) {
        
    }
}
