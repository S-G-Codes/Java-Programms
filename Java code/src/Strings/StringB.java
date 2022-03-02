public class StringB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tuffy");
 System.out.println(sb);

 //setting character
 sb.setCharAt(0, 'L');
 System.out.println(sb);

 //Inserting the character

 sb.insert(4, 'f');
 System.out.println(sb);
//deleting charceter  2 is inclusive and 4 is excluded
 sb.delete(2, 4);
 System.out.println(sb);

 //appending means adding character at last      
 sb.append(' ');
 sb.append('i');
 sb.append('s');
 sb.append(' ');
 sb.append('L');
 sb.append('o');
 sb.append('v');
 sb.append('e');
System.out.println(sb);

System.out.println(sb.length());


    }
}
