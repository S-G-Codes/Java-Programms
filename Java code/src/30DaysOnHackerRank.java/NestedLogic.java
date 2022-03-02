import java.util.Scanner;

public class NestedLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String acutalDate = sc.nextLine();
        String exceptedDate = sc.nextLine();

        sc.close();

        int fine = 0;
        String[] dateDetail = acutalDate.split(" ");
        String[] eDetail = exceptedDate.split(" ");

        int aDate = Integer.parseInt(dateDetail[0]);
        int aMonth = Integer.parseInt(dateDetail[1]);
        int aYear = Integer.parseInt(dateDetail[2]);

        int eDate = Integer.parseInt(eDetail[0]);
        int eMonth = Integer.parseInt(eDetail[1]);
        int eYear = Integer.parseInt(eDetail[2]);

        if (aYear > eYear) { // f the book is returned after the calendar year in which it was expected,
                             // there is a fixed fine of
            fine = 10000;
        } else if (aYear == eYear && aMonth > eMonth) {
            fine = 500 * (aMonth - eMonth); // If the book is returned after the expected return month but still within
                                            // the same calendar year as the expected return date
        } else if (aYear == eYear && aMonth == eMonth && aDate > eDate) { // f the book is returned after the expected
                                                                          // return day but still within the same
                                                                          // calendar month and year as the expected
                                                                          // return date,
            fine = 15 * (aDate - eDate);
        }
        System.out.println(fine);
    }
}
