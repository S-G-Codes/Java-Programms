import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;




public class SortTheHashMapbyKeys {
    static HashMap<String,Integer> map =  new HashMap<>();



    public static void sortbyKeys(){
    TreeMap<String, Integer> sortedbyKey = new TreeMap<>();

    sortedbyKey.putAll(map);

     for (Map.Entry<String, Integer> entry : sortedbyKey.entrySet())

     System.out.println("key: " + entry.getKey() + "Value : " + entry.getValue());
    } 
    public static void main(String[] args) {
        
        map.put("Bharat",  07 );
        map.put("Arbazz",  88 );
        map.put("Rohan",  66 );

      
     sortbyKeys();
           
    }

  
}
