import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = sc.nextInt();
        System.out.print("Is customer senior citizen (y/n): ");
        char isSenior = sc.next().charAt(0);

        double rateOfInterest = (isSenior == 'y' || isSenior == 'Y') ? 12.0 : 10.0;
        double interest = (principal * years * rateOfInterest) / 100;

        System.out.println("Interest: " + interest);
    }
}
