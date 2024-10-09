import java.util.Scanner;
public class RectangleSymbolPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the symbol to print: ");
        char symbol = scanner.next().charAt(0);

        int rows = 5, cols = 10;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
