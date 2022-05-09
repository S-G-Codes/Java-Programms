public class Hexa_Binary_Octa {
    public static void main(String[] args) {

        // A hexadecimal number is a value in base-16. There are 16 digits, 0-9 and the
        // letters A-F (case does not matter). A-F represent 10-16.

        // An octal number is a value in base-8, and uses the digits 0-7.

        // A binary number is a value in base-2, and uses the digits 0 and 1.

        // All of these numbers result in the same value, 110:
        int dec = 110; // no prefix --> decimal literal
        int bin = 0b1101110; // '0b' prefix --> binary literal
        int oct = 0156; // '0' prefix --> octal literal
        int hex = 0x6E; // '0x' prefix --> hexadecimal literal

        System.out.println(dec);
        System.out.println(bin);
        System.out.println(oct);
        System.out.println(hex);
    }
}
