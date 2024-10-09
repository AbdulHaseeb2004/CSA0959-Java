import java.util.Scanner;

class BankAccount {
    String depositorName;
    int accountNumber;
    String accountType;
    double balanceAmount;

    BankAccount(String depositorName, int accountNumber, String accountType, double balanceAmount) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balanceAmount = balanceAmount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balanceAmount += amount;
            System.out.println("Deposit successful. New Balance: " + balanceAmount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (balanceAmount - amount >= 500) {
            balanceAmount -= amount;
            System.out.println("Withdrawal successful. New Balance: " + balanceAmount);
        } else {
            System.out.println("Withdrawal failed. Minimum balance of Rs. 500 is required.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + depositorName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balanceAmount);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Raja", 100, "S", 8000);
        account.displayBalance();
        account.deposit(1000);
        account.withdraw(4000);
    }
}
