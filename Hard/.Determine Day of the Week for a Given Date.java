import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class DayOfWeekFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        
        System.out.println("Output: " + dayOfWeek);
        sc.close();
    }
}
