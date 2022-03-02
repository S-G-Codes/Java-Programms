import javax.swing.text.Position;

public class GetTHeBit {
    public static void main(String[] args) {
        
        int n = 5;    //0101
        int position = 2;
        int BitMask = 2<<position;    //position is given from right hand side and starting from zero eg 0101 = 0 pos is 3, 1 pos is 2 , 0 pos is 1 ,1 pos 0 
 if ((BitMask & n) == 0) {
     System.out.println("Bit was zero.");
     
    } else {
     System.out.println("Bit was ONE.");
     
 }

    }
}
