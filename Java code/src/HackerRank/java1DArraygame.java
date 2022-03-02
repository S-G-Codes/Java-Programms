import java.util.Scanner;

public class java1DArraygame {
public static boolean find_path(int leap, int []game, int x) {
    if(x < 0) return false;
  
    if(x > game.length-1) return true;
 
    
    if(game[x] !=0) return false;

    game[x] = 5;

    if(find_path(leap, game, x+1)){
        return true;
    }

    if(find_path(leap, game, x+leap)) return true;
    
    if(find_path(leap, game, x-1)) return true;

    game[x] = 0;
    return false;
}





    public static boolean canWin(int leap, int[] game){
        return find_path(leap, game, 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfQuries = sc.nextInt();
        while(noOfQuries-- > 0){
            int n = sc.nextInt();
            int leap = sc.nextInt();

            int game[] = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = sc.nextInt();
            }
            System.out.println( (canWin(leap, game)) ? "YES" : "NO");
        }
        sc.close();
    }
}
