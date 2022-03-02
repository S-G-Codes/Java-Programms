import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class DayEighteenQueuesAndSTack {

    Queue<Character> que = new LinkedList<>(); //making a new queque 
    Stack<Character> stac = new Stack<>();        //making an stack

    void pushCharacter(char c){
        stac.push(c);

    }

    void enqueueCharacter(char c){
        que.add(c);
    }

    char popCharacter(){
        return stac.pop();

    }

    char dequeueCharacter(){
                 return que.remove();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        char [] str = s.toCharArray(); 

               DayEighteenQueuesAndSTack p =   new DayEighteenQueuesAndSTack();

               for (char c : str){
                   p.pushCharacter(c);
                   p.enqueueCharacter(c);
               }
           boolean isPalindrome = true;
           for (int i = 0; i < str.length/2; i++) {
               if(p.popCharacter() != p.dequeueCharacter()){
                          isPalindrome = false;
                          break;
               }               
           }
           System.out.println( "The word, " + s + ", is " 
           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
            }
}
