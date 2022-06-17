import java.util.ArrayList;
import java.util.List;

class Generate_Parenthisi{
    // https://leetcode.com/problems/generate-parentheses/
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        //use string builder bcz they are mutable or else use stringBuffer they are also mutable 
        //Strings are immutable(can't me modofied)
        backTracking(list , n , new StringBuilder() , 0 , 0);
        return list;
    }
private void backTracking(List<String> list, int n, StringBuilder str, int opened, int closed) {
   //opened and closed are parenthis if they are equal means we are good else we can't generate the proper parenthis


//terminal condition
if(closed > opened){
    return;
}


if(closed == opened && str.length() == n*2){
    list.add(str.toString());
    return;
}

     
    if(opened < n){
        str.append("(");
        backTracking(list, n, str, opened+1, closed);
        str.deleteCharAt(str.length() -1);
    }

    if(closed < n){
        str.append(")");
        backTracking(list, n, str, opened,  closed +1);
        str.deleteCharAt(str.length() -1);

    }

   


    }
public static void main(String[] args) {
    
}
}