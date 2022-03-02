import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;


public class JavaMapPhoneBook {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
       HashMap<String,Integer> map = new HashMap<>();

        while(n-- > 0) {
          String name = br.readLine();
             int number = Integer.valueOf(br.readLine());
             map.put( name,number);
 
        }
        String query;
       while((query = br.readLine()) != null){
           if(map.containsKey(query)){
               System.out.println(query + "=" + map.get(query));
           }else{
               System.out.println("Not found");
           }
       }
     br.close();
    }
}
