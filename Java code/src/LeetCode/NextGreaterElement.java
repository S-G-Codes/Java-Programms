import java.util.Scanner;

public class NextGreaterElement {
    // https://leetcode.com/problems/next-greater-element-iii/
   
   
  //Approch is simple but to get the pattern dry run some eg

  //1 . Convert the int to a char array
   //2 . traverse the array from right to left and find the dipPoint
   // You will always find a dipPoint if not found means the highest no can't be made simply return zero
   //3 . Traverse again from right to left and now find the no which is  highest then the dipPoint we got earlier
   //4 . swap those numbers 
   //5 . reverse the whole array after that first dipPoint to get the highest no




  static  public int nextGreaterElement(int n) {
                     //convert to char array
                     char[] s = (n+"").toCharArray();
                 
                     //finding the dip while travering from right to left
                     int  dipPoint = s.length -1;
                    //  System.out.println(i);
                  
                    while(dipPoint>0){
                        if(s[dipPoint] > s[dipPoint -1]){
                            break;
                        }
                        dipPoint--;

                    }

                    //if dipPoint is zero so no max can be formed 
                    if(dipPoint ==0) return -1;


                    //getting swapping index
                      
                    int firstSwapIdx = dipPoint -1;           //bcz of 0 indexing
                    int secondSwapIdx  = s.length -1;
                
                    while(secondSwapIdx >= firstSwapIdx){
                        if(s[firstSwapIdx] < s[secondSwapIdx]){
                            break;
                        }
                        secondSwapIdx--;
                    }

                    //swapping them

                    char temp = s[firstSwapIdx];
                    s[firstSwapIdx] = s[secondSwapIdx];
                    s[secondSwapIdx] = temp;


                    //swapping the rest from dipPoint

                    reverseRestofThem(s , dipPoint);
                    
                    //A check to make sure we stay in the question constriants
                    Long no = Long.parseLong(new String(s));
                    if(no <= Integer.MAX_VALUE){
                        return no.intValue();
                    }else{
                        return -1;
                    }
                    
                    




                   
    }


    static  private void reverseRestofThem(char[] s , int i){
          int start = i;
          int end = s.length -1;
          while (start <= end){
              char temp = s[start];
              s[start] = s[end];
              s[end] =temp;
              start++;
              end--;
          }
      }
    
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the n: ");
            int n = sc.nextInt();
           System.out.println(nextGreaterElement(n));  
    } 
}
