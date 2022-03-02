import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionariesAndmap {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> phoneBook = new HashMap<String,Integer>();   //making a dictionary
        int entries = sc.nextInt();        //no of entries

        //taking name and phone input and putting it into map
        for (int i = 0; i < entries; i++) {
            String name = sc.next();
            int phone = sc.nextInt();
            phoneBook.put(name, phone);       //.put helps to put key and value into Map
            }

            //finding phone and name using while loop
              while(sc.hasNext()){                //hasNext method return true if and only if this scanner has another token 
                  String s = sc.next();      //taking name as input to find through our phone book
        if (phoneBook.containsKey(s)) {          //containkey() looks for the entered string is matching through out dictornanry or not 
            System.out.println(s + "=" + phoneBook.get(s));
        } else {
            System.out.println("Not found");
        }
              }
              sc.close();
    }

}
