public class settingTheBit {
    public static void main(String[] args) {
        int n =5 ; //0101      
        int pos = 1;       //position is given from right hand side and starting from zero eg 0101 = 0 pos is 3, 1 pos is 2 , 0 pos is 1 ,1 pos 0 
        int bitmask = 1<<pos;

        int newNumber = bitmask | n;
        System.out.println(newNumber);


    }
}
