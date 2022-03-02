public class MoveAllXinlast {
public static void MoveAllX(String str , int indexx , int count , String newStr) {
      if(indexx== str.length()){   //base cond 
          for (int i = 0; i < count; i++) {       //adding x as many time of count in new String 
                 newStr += 'x';
          }
                  System.out.println(newStr);
                  return;
      }

      char currChar = str.charAt(indexx);         //taking each character of String through index
      if(currChar == 'x'){                  //checking each character if its equal to x or not
          count++;                         //if x is there incrementing the count by 1
          MoveAllX(str,  indexx+1, count, newStr);       //recursion    //going for another char and so on 

      }else{
          newStr += currChar;            //if not x the put that char in new String
          MoveAllX(str, indexx+1, count, newStr);      //again loop for remaining character
      }



}
    public static void main(String[] args) {
        String str = "abxxmgjhlkjfkfgjgljhfyjgjkxxxfjhjxkxksx";   
        MoveAllX(str, 0, 0, "");  //calling our fn and passing the parameter  str , index=0, count=0, and String =""
    }
}


//Time Complexity   O(n)    ..2 is constant 