import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class JavaList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initalNo = sc.nextInt();

        List<Integer> list = new ArrayList<>(initalNo);

        for (int i = 0; i < initalNo; i++) {
            list.add(sc.nextInt());
        }
        int noOfQuaries = sc.nextInt();
      for (int i = 0; i < noOfQuaries; i++) {
          String Query = sc.next();
          if("Insert".equals(Query)){
              int index = sc.nextInt();
              int value = sc.nextInt();
              list.add(index , value);
          }else{
              int index = sc.nextInt();
              list.remove(index);
          }
      }
      list.stream().forEach(n -> System.out.print(n + " "));
      sc.close();
    }
}