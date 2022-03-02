import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class currencyFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();

       //creating a locale for India

       Locale indiaLocale = new Locale("en" , "IN");

       //creating number Format using Locales

       NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
       NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
       NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
       NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
             
       System.out.println("US: " + us.format(payment));
       System.out.println("India: " + india.format(payment));
       System.out.println("China: " + china.format(payment));
       System.out.println("France: " + france.format(payment));

    }
}
