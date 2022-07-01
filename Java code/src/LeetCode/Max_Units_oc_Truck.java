import java.util.Arrays;

public class Max_Units_oc_Truck {
    // https://leetcode.com/problems/maximum-units-on-a-truck/
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        //sorting in decreasing order 
        Arrays.sort(boxTypes , (a,b) -> b[1] - a[1]);
        int maxUnitsofBoxes = 0;

        for (int[] box : boxTypes) {
            int noofBoxes = box[0];
            int noofUnit = box[1];


           if(truckSize >= noofBoxes){
            maxUnitsofBoxes += noofBoxes * noofUnit;
            truckSize -= noofBoxes;
           }else{
            maxUnitsofBoxes += truckSize * noofUnit;
            return maxUnitsofBoxes;
           }
             

        }
        return maxUnitsofBoxes;
    }
    public static void main(String[] args) {
        
    }
}
