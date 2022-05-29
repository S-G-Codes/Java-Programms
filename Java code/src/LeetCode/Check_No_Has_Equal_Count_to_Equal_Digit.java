import java.util.HashMap;
import java.util.Map;

public class Check_No_Has_Equal_Count_to_Equal_Digit {
    // https://leetcode.com/contest/biweekly-contest-79/problems/check-if-number-has-equal-digit-count-and-digit-value/

    public boolean digitCount(String num) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (char c : num.toCharArray()) {
            int no = c - '0';
            map.put(no, map.getOrDefault(no, 0) + 1);

        }

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            int n = c - '0';

            if (map.containsKey(i) == true) {
                if (map.get(i) != n) {
                    return false;
                }
            } else if (n != 0) {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {

    }
}
