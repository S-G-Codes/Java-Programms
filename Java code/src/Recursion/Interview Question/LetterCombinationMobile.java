import java.util.*;
public class LetterCombinationMobile {
    //url https://leetcode.com/problems/letter-combinations-of-a-phone-number/

    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return new ArrayList<>();
        }

        return recFn("", digits);


    }

    private List<String> recFn(String process , String unprocess){
     //agar humreh unprocess empty hotha hai toh matlab process meh humrah ans hai toh uskoh list meh dalo aur return kardoh
        if(unprocess.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }
        
        //getting the unprocess character and converting it into a digit
        int digit = unprocess.charAt(0) - '0';
        List<String> list = new ArrayList<>();
        
        //getting our starting index and ending index to print the possible comb

        int startIndex = (digit -2)*3;
        int endIndex = (digit -1)*3;

        //for digit 7,8,9 we have four char at each so need to modifiy a little in start and ending index

        if(digit ==7){
            endIndex++;
        }else if(digit ==8){
            startIndex++;
            endIndex++;
        }else if(digit==9){
            startIndex++;
            endIndex +=2;      
        }



        //Recn call and adding all to list
        for (int i = startIndex; i < endIndex && i<=25; i++) {
            //this works as 
            // ch = 'a' + 0 = 'a' 
            // ch = 'a' + 1 = 'b' 
            // ch = 'a' + 2 = 'c'
            //so on till z
            // ch = 'a' + 25 = 'z'

            char ch = (char)('a' + i);

            //rec call adding all the list and also adding ch to process and decreasing 1 from unprocess as we have added it in process

            list.addAll(recFn( process + ch, unprocess.substring(1)));
        }
        return list;

    }

    public static void main(String[] args) {
        //Ascii 
        char ch = 'a';
        System.out.println((char)(ch + 0));
        System.out.println((char)(ch + 1));
        System.out.println((char)(ch + 2));
        System.out.println((char)(ch + 3));
    }
}
