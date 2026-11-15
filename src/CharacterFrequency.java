
import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterFrequency {

    public static void main(String[] args) {

        String word = "programming";

        Map<Character, Integer> frequency = new LinkedHashMap<>();

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (frequency.containsKey(ch)) {
                frequency.put(ch, frequency.get(ch) + 1);
            } else {
                frequency.put(ch, 1);
            }
        }


        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
