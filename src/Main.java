import java.text.NumberFormat;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the loan:");
        int loan = scanner.nextInt();
        System.out.print("enter the annual Interest Rate:");
        double rate = scanner.nextDouble();
        rate = (rate/100)/12;
        System.out.print("enter the years:");
        int years = scanner.nextInt();
        years *= 12;
        double mortgage = (loan * rate*(Math.pow(1+rate,years)))/((Math.pow(1+rate,years)) - 1);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String formatted = formatter.format(mortgage);
        System.out.println(formatted);
    }
}