import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int FirstTotalLines = sc.nextInt();
        ArrayList<ArrayList> firstArrayList = new ArrayList<>();
         for (int i = 0; i < FirstTotalLines; i++) {
             int numOfInteegers = sc.nextInt();
             ArrayList<Integer> secondArrayList = new ArrayList<Integer>();
             for (int j = 0; j < numOfInteegers; j++) {
                 secondArrayList.add( sc.nextInt());
             } 
             firstArrayList.add(secondArrayList);
             sc.nextLine();
         }

         int numberQuires = Integer.parseInt(sc.nextLine());
         for (int i = 0; i < numberQuires; i++) {
              int x = sc.nextInt()-1;   //-1 bcz index starts from 0
              int y = sc.nextInt()-1;
              sc.nextLine();
              if(x< firstArrayList.size() && y< firstArrayList.get(x).size()){
                  System.out.println(firstArrayList.get(x).get(y));
              }else{
                  System.out.println("ERROR!");
              }
         }
    }
}
