import java.util.Scanner;

class ElectricityBill {
    int consumerNo;
    String consumerName;
    int prevReading, currReading;
    double billAmount;

    public ElectricityBill(int cNo, String cName, int prev, int curr) {
        consumerNo = cNo;
        consumerName = cName;
        prevReading = prev;
        currReading = curr;
    }

    void computeBill() {
        int units = currReading - prevReading;

        if (units <= 100) {
            billAmount = units * 1.0;
        } else if (units <= 200) {
            billAmount = 100 * 1.0 + (units - 100) * 2.5;
        } else if (units <= 500) {
            billAmount = 100 * 1.0 + 100 * 2.5 + (units - 200) * 4.0;
        } else {
            billAmount = 100 * 1.0 + 100 * 2.5 + 300 * 4.0 + (units - 500) * 6.0;
        }
    }

    void displayBill() {
        System.out.println("Consumer No.: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Previous Month Reading: " + prevReading);
        System.out.println("Current Month Reading: " + currReading);
        System.out.println("Total Bill Amount: Rs. " + billAmount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Consumer Number: ");
        int cNo = sc.nextInt();
        sc.nextLine();  // consume newline
        System.out.print("Enter Consumer Name: ");
        String cName = sc.nextLine();
        System.out.print("Enter Previous Month Reading: ");
        int prev = sc.nextInt();
        System.out.print("Enter Current Month Reading: ");
        int curr = sc.nextInt();

        ElectricityBill bill = new ElectricityBill(cNo, cName, prev, curr);
        bill.computeBill();
        bill.displayBill();
    }
}
