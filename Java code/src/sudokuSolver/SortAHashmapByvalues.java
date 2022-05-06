import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortAHashmapByvalues {


    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 3);
        map.put("b", 1);
        map.put("c", 4);
        map.put("d", 6);


        System.out.println("Before Sorting: ");
        System.out.println(map);

        //sorting by values
        LinkedHashMap<String,Integer> linkmap = map.entrySet().stream().sorted((e1, e2) -> {
                        return e1.getValue() - e2.getValue();
        }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1, LinkedHashMap::new));

        System.out.println("After Sorting: ");
        System.out.println(linkmap);





    }
}
