import java.util.Hashtable;

public class BankDetails {
    public static void main(String[] args) {
        Hashtable<Integer, String> bankDetails = new Hashtable<>();

        // i) Add 3 records
        bankDetails.put(101, "John Doe");
        bankDetails.put(102, "Jane Doe");
        bankDetails.put(103, "Alice Johnson");

        // ii) Display the size of the HashTable
        System.out.println("Size of HashTable: " + bankDetails.size());

        // iii) Clear the HashTable
        bankDetails.clear();
        System.out.println("HashTable cleared. Current size: " + bankDetails.size());
    }
}
