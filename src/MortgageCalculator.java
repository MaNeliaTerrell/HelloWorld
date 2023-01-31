package HelloWorld;
import java.text.NumberFormat;
import java.util.Scanner;
public class MortgageCalculator {
    public static void main(String[] args) {

        ///declare variables

        final byte MONTHS_In_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        //label for user input
        //input PRINCIPAL

        System.out.print("Principal: ");
        int principal = scanner.nextInt();   //int can store values up to 2B

        //ANNUAL INTEREST RATE

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_In_YEAR;   //USE Variables as best practice than actual numbers

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_In_YEAR;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(PERCENT);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
}
