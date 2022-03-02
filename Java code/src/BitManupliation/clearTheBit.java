public class clearTheBit {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1<<pos;

        int NOTofBitMask = ~(bitMask);
        int newNumber = n & NOTofBitMask;
        System.out.println(newNumber);

    }
}
