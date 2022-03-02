import java.util.Scanner;

public class DecimaltoBinarayAndOneConstecivies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0 , min = 0;   
        while(n>0){
            if(n%2==1){          
                count++;       //reaminder is 1 increment count
                if(count>=min){     
                    min = count;
                }
            }
            else{
                count =0;
            }
            n = n/2;         //re intizalting n 
        }
        System.out.println(min);
    }
}
