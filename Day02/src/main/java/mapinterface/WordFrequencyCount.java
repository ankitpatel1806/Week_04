package mapinterface;
import java.util.*;
import java.util.Scanner;

public class WordFrequencyCount {

    public Map<String, Integer> countWordFrequency(String inputText) {
        Map<String, Integer> wordCount = new HashMap<>();

        String cleanedText = inputText.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();

        String[] words = cleanedText.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        return wordCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text to count word frequencies:");
        String inputText = scanner.nextLine();

        WordFrequencyCount counter = new WordFrequencyCount();
        Map<String, Integer> frequencies = counter.countWordFrequency(inputText);

        System.out.println(frequencies);
        scanner.close();
    }
}
