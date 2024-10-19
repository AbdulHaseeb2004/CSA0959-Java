public class LastWordLength {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        return words.length > 0 ? words[words.length - 1].length() : 0;
    }

    public static void main(String[] args) {
        LastWordLength lw = new LastWordLength();
        System.out.println(lw.lengthOfLastWord("Hello World"));  // Output: 5
    }
}
