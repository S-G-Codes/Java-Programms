public class IntersectionofTwoArray {

    // https://leetcode.com/problems/intersection-of-two-arrays/submissions/

    public int[] intersection(int[] a, int[] b) {
       
   
        HashSet<Integer> s = new HashSet<Integer>();
                HashSet<Integer> s2 = new HashSet<Integer>();

        
        for(int element1 : a){
            s.add(element1);
        }
        
        for(int element2 : b){
            if(s.contains(element2)){
               s2.add(element2);
                
               
            }
        }
        
             int ans[] = new int[s2.size()];
           int i =0;
        for( int ele : s2){
            ans[i++] = ele;
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
