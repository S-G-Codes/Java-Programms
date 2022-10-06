import java.util.HashMap;
import java.util.TreeMap;

public class TimeBasedKeyValue {
    // https://leetcode.com/problems/time-based-key-value-store/
    
    HashMap<String, TreeMap <Integer,String>> store;
    
    public TimeMap() {
       store = new HashMap<>();     
    }
    
    public void set(String key, String value, int timestamp) {
        
        if(store.containsKey(key) == false){
            store.put(key, new TreeMap<>());
        }store.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        String value = new String();

        if(store.containsKey(key)){
            Integer previousTime = store.get(key).floorKey(timestamp);
            if(previousTime != null){
                value = store.get(key).get(previousTime);
            }
        }
        return value;
    }
   
    public static void main(String[] args) {
        
    }
}
