public class Move_pieces_To_Obtain_a_String {
    // https://leetcode.com/contest/weekly-contest-301/problems/move-pieces-to-obtain-a-string/
    public boolean canChange(String start, String target) {
        if(start.length() != target.length()) return false;
        
       
        int indexS = 0;
        int indexT = 0;

    
        while( indexS < start.length() && indexT < target.length()){
            
            //ignoring spaces in start
            while(indexS < start.length() && start.charAt(indexS) == '_'){
                indexS++;
            }
            //ignoring spaces in target
            while(indexT < target.length() && target.charAt(indexT) == '_'){
                indexT++;
            }
           
            //check to ensure both the Strings are traversed
            if(indexS == start.length() && indexT == target.length()){
                return true;
            }


            // checking if characters are same or not
            if(indexS == start.length() || indexT == target.length() || start.charAt(indexS) != target.charAt(indexT)){
                return false;
            }

             //if the characters are same check for thier postions
            if(indexS < start.length() && indexT < target.length()){
                //formula for L was  index of L in Start should be greater than index of L in Target String then only we can move the character else false
                //i.e    indexS > indexT     
                if(target.charAt(indexT) == 'L'  && indexS < indexT){
                           return false;
                     }
                   //here indexT > indexS
                if(target.charAt(indexT) == 'R'  && indexS > indexT){
                           return false;
                     }
            }

            indexS++;
            indexT++;
            



        }
        return true;


    }
    public static void main(String[] args) {
        
    }
}
