import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class day28Regex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String Regex = ".+@gmail\\.com$";
        List<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(Regex);
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String email = sc.next();
            Matcher matcher = pattern.matcher(email);
            if(matcher.find()){
                list.add(name);
            }
        }
        Collections.sort(list);
        for(String names:list){
            System.out.println(names);
        }
        sc.close();
    }
}
