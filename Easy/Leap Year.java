import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Date (dd/mm/yyyy): ");
        String date = sc.nextLine();

        try {
            int year = Integer.parseInt(date.split("/")[2]);
            if (isLeapYear(year)) {
                System.out.println("Given year is a Leap Year.");
            } else {
                System.out.println("Given year is a Non-Leap Year.");
            }
        } catch (Exception e) {
            System.out.println("Invalid date format.");
        }
    }
}
