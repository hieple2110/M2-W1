import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountNumberOfWords {
    public static final char SPACE = ' ';

    public static void main(String[] args) {

        String str = "con bo cap cap con bo cap cap dung cho bo bo dung cho cap";
        Map<String, Integer> wordMap = countWord(str);
        for (String key : wordMap.keySet()) {
            System.out.println(key + " " + wordMap.get(key) + "\n");
        }
    }

    public static Map<String, Integer> countWord(String input) {
        Map<String, Integer> wordMap = new TreeMap<String, Integer>();
        if (input == null) {
            return wordMap;
        }
        int size = input.length();
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) != SPACE) {
                stb.append(input.charAt(i));
            } else {
                addWord(wordMap, stb);
                stb = new StringBuilder();
            }
        }
        addWord(wordMap, stb);
        return wordMap;
    }

    public static void addWord(Map<String, Integer> wordMap, StringBuilder stb) {
        String word = stb.toString();
        if (word.length() == 0) {
            return;
        }
        if (wordMap.containsKey(word)) {
            int count = wordMap.get(word) + 1;
            wordMap.put(word, count);
        } else {
            wordMap.put(word, 1);
        }
    }

}
