import java.util.Scanner;

public class subStringComparsion {

public static String getSmallestAndLargest(String s , int k ) {
    String smallest = "";
    String largest = "";
    smallest = largest = s.substring(0,k);

for (int i = 1; i < s.length() - k+1; i++) {
     String subStr = s.substring(i, i +k);
     if(smallest.compareTo(subStr) > 0)
smallest = subStr;
if(largest.compareTo(subStr)<0)
largest = subStr;
}
return smallest + "\n" + largest;
     


}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        sc.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
