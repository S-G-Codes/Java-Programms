public class SingleOrPair {

    public static int  callGuests(int n ) {
        if(n <=0){
            return 1;
        }
        
        //for single 
        int way1 = callGuests(n-1);

        //for pair
        int way2 = (n-1) * callGuests(n-2);

        return way1 + way2;
        
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(callGuests(n));
    }
}
