import java.util.HashMap;
import java.util.Map;

public class EmployeeRecord {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();

        // i. Add objects
        employeeMap.put(1, "John Smith");
        employeeMap.put(2, "Anna Taylor");
        employeeMap.put(3, "Bob Williams");

        // ii. Remove specified object
        employeeMap.remove(2);

        // iii. Check if map is empty
        if (employeeMap.isEmpty()) {
            System.out.println("Employee map is empty.");
        } else {
            System.out.println("Employee map is not empty.");
        }

        // iv. Clear the map
        employeeMap.clear();
        System.out.println("Employee map cleared.");
    }
}
