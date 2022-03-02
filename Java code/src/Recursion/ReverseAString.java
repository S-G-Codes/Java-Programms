public class ReverseAString {

    public static void reverseAString(String str, int indexx) { // passing two parameters str is our String and indexx is index of String
                                                                
        if (indexx == 0) { // base condn //if indexx reaches zero print that char
            System.out.println(str.charAt(indexx));
            return;
        }
        System.out.print(str.charAt(indexx)); // printing the last index
        reverseAString(str, indexx - 1); // recursion // going from last to first character using index

    }

    public static void main(String[] args) {
        String str = "abcde";
        reverseAString(str, str.length() - 1); // calling the fn and pass paramters value why length -1 bcz out index
                                               // starts from zero and length starts feom 1 so to balanced that
    }
}


//Time Complexity - O(n)             where n is String length