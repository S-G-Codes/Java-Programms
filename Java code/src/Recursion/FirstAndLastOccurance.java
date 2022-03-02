import java.util.Scanner;

public class FirstAndLastOccurance {
    public static int first = -1;      //making the variables Static bcz we have to keep them same
    public static int last = -1; //(-1) bcz to check valid or invalid  value at inilitalize

    public static void checkOccurance( String str , int indexx , char element){          //element is the char we are finding the occurances         
   if(indexx == str.length()){   //base cond   //if our index reaches the length of String then stop right there
       System.out.println(first);
       System.out.println(last);
       return;
   }



        char currChar = str.charAt(indexx);          //char variable to check each character
        if(currChar == element){                  //  if we find our first occurance
            if(first == -1){
                first = indexx;              //intalize that index no to first variable 

            }else{
                 last = indexx;                       //and so on for last occurance in last variable 
            }

        }
        checkOccurance(str, indexx +1, element);        //recursion   updating index by 1 to travesing 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);         //taking a string as input 
        System.out.println("Enter the String which has multiple a : ");
        String str = sc.next();
        checkOccurance(str, 0, 'a');    //calling teh fn and passing the parameter 
        sc.close();
    }
}

//Timecomplexity   O(n)  where n is String length