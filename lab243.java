import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        String str = "this is a test this is only a test";
        String[] words = str.split(" ");
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word frequencies: " + wordCount);
    }
}
