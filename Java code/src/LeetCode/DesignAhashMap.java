public class DesignAhashMap {
    // Not so good soln
     //Tc = O(1)  //space 1000000 can be optimized using Linked list
     int[] map = null;

     public MyHashMap() {
         map = new int[1000001];
         Arrays.fill(map, -1);
     }
     
     public void put(int key, int value) {
         map[key] = value;
     }
     
     public int get(int key) {
         return map[key];
     }
     
     public void remove(int key) {
         put(key, -1);
     }
}
