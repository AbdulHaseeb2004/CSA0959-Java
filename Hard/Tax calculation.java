import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the income: ");
        int income = sc.nextInt();
        double tax = 0;

        if (income > 250000 && income <= 500000) {
            tax = (income - 250000) * 0.10;
        } else if (income > 500000 && income <= 1000000) {
            tax = (250000 * 0.10) + ((income - 500000) * 0.20);
        } else if (income > 1000000) {
            tax = (250000 * 0.10) + (500000 * 0.20) + ((income - 1000000) * 0.30);
        }

        System.out.println("Taxable Income: " + income);
        System.out.println("Tax = " + tax);
    }
}
