import java.util.EnumSet;
import java.util.HashSet;

class Implementaion_Hash_set{
public static void main(String[] args) {
    HashSet <Integer> s = new HashSet<>();    //here in() you can size or constructor of a hash set
  s.add(10);
  s.add(20);
  s.add(30);

  if(s.contains(30)){         //to see that if set s contians that element 
      System.out.println("Found");
    }else{
      System.out.println("Not Found");
  }
  
//   s.remove(30);    to remove the elemets from set

System.out.println(s.isEmpty());           //gives boolean value if set is empty
System.out.println(s.size());           //gives the size of set

s.clear();                 //clear the set
System.out.println(s.size());           //gives the size of set

}
}