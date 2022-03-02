import java.util.Scanner;

public class EOF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int serialno = 1;

        while (sc.hasNext()) { // has.Next return true means allows user to take a input base on EOF.
            String str = sc.nextLine();
            System.out.println(serialno + " " + str);
            serialno++;

        }
    }
}

// What is EOF
// ans In computing, end-of-file (EOF)[1] is a condition in a computer operating
// system where no more data can be read from a data source. The data source is
// usually called a file or stream.