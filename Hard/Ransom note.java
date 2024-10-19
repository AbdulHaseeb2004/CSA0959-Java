import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineCount = new HashMap<>();
        
        for (char c : magazine.toCharArray()) {
            magazineCount.put(c, magazineCount.getOrDefault(c, 0) + 1);
        }
        
        for (char c : ransomNote.toCharArray()) {
            if (magazineCount.getOrDefault(c, 0) == 0) {
                return false;
            }
            magazineCount.put(c, magazineCount.get(c) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        RansomNote rn = new RansomNote();
        System.out.println(rn.canConstruct("a", "b"));  // Output: false
    }
}
