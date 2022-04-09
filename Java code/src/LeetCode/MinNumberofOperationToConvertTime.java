public class MinNumberofOperationToConvertTime {
 static   public int convertTime(String current, String correct) {
        int curr = convertIntoMin(current);
        int crct = convertIntoMin(correct);
        int ans = 0;

        while(curr != crct){
            if(curr + 60 <= crct){
                curr+= 60;
                ans++;
            }else  if(curr + 15 <= crct){
                curr+= 15;
                ans++;
            }else  if(curr + 5 <= crct){
                curr+= 5;
                ans++;
            }else{
                curr +=1;
                ans++;
            }
        }
        return ans;

    }

 static   public int convertIntoMin(String str){
        int res = 0;
        res = 60 * ((10 * Character.getNumericValue(str.charAt(0))) + Character.getNumericValue(str.charAt(1)));
        res += 10*Character.getNumericValue(str.charAt(3));
        res += Character.getNumericValue(str.charAt(4));
        return res;
    }
    public static void main(String[] args) {
        String current = "02:30";
        String correct = "04:35";
        System.out.println(convertTime(current, correct));
    }
}
