import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

class ChefAndProfits{
    private static   int XnoOfStock;
    private static  int YnoOfPrice;
    private static  int ZSold;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
             XnoOfStock = sc.nextInt();
             YnoOfPrice = sc.nextInt();
             ZSold = sc.nextInt();
             int totalSpent =  XnoOfStock * YnoOfPrice;
             int totalRec = XnoOfStock * ZSold;
             int TotalProfit = totalRec - totalSpent;
       System.out.println(TotalProfit);

        }
       

    }
}