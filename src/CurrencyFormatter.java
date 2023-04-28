import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void currencyFormatter(){
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat us;
        NumberFormat india;
        NumberFormat china;
        NumberFormat france;

        us = NumberFormat.getCurrencyInstance(Locale.US);
        india = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
