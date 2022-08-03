import java.util.TreeMap;


// https://leetcode.com/problems/my-calendar-i/
//Map uses BST structure internally so tc will be log n
//floor entry gives floor value from the map of passed value same with ceiling thing
    class MyCalendar {

   TreeMap<Integer , Integer> calendar = null;

        public MyCalendar() {
            calendar = new TreeMap<>();
        }
        
        public boolean book(int start, int end) {
            
                       
            if(calendar.floorEntry(start) != null && start < calendar.floorEntry(start).getValue())
               return false;
             

            if(calendar.ceilingEntry(start) != null && end > calendar.ceilingEntry(start).getKey()){
                return false;
            }    

            calendar.put(start, end);
            return true;

               
        }


        
        public static void main(String[] args) {
            
        }
    }

