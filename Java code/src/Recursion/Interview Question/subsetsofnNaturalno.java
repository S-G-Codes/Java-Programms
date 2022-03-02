import java.util.ArrayList;



public class subsetsofnNaturalno {
    public static void printSubset(ArrayList<Integer> subSet) {
        for(int i =0; i <subSet.size(); i++){
           System.out.print(subSet.get(i) + " ");
        }
        System.out.println();
        
    }
    
    public static void findSubsets(int n, ArrayList<Integer> subSet){
         if(n==0){
          printSubset(subSet);
          return;
         }
    
         //for adding
          subSet.add(n);
          findSubsets(n-1,subSet);
          
          //for not adding 
          subSet.remove(subSet.size() -1);   //deleting the previous added one 
          findSubsets(n-1,subSet);
    
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subSet = new ArrayList<>();
        findSubsets(n, subSet);
    }
}
