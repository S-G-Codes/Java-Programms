public class CellsInRangeExcelSheet {

//url https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/








    public List<String> cellsInRange(String s) {
        List<String> list = new ArrayList<>();
        char c1 = s.charAt(0);            //getting first letter 
                char c2= s.charAt(3);            //getting the last letter
        
        char r1 = s.charAt(1);         //getting the first no
                char r2= s.charAt(4); //getting the second no
         
        for(char c = c1 ; c<= c2 ; c++){              //lopping from first letter to last letter and also same for number
            for(char r = r1 ; r <=r2; r++){
                list.add( ""+c + r);                  //adding into a list
            }
        }
        
        return list;


    }
    public static void main(String[] args) {
        
    }
}
