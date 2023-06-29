package Parser;
import java.util.HashMap;
import java.util.ArrayList;


public class ParserText {
    String text;

    public ParserText(String text){
        this.text = text;
    }

    public String parserUniqueElement() {
        String[] words = text.toLowerCase().replaceAll("[,\":.?!-]", "").split(" ");
        ArrayList<Character> ArrayLetters = new ArrayList<>();
        HashMap<Character, Integer> resultCounts = new HashMap<>();
        for (String word : words) {
            HashMap<Character, Integer> counts = new HashMap<>();
            for (char element : word.toCharArray()) {
                counts.put(element, counts.getOrDefault(element, 0) + 1);
            }
            for (char element : word.toCharArray()) {
                if (counts.get(element) == 1) {
                    ArrayLetters.add(element);
                    break;
                }
            }
        }
        for (char letter : ArrayLetters) {
            resultCounts.put(letter, resultCounts.getOrDefault(letter, 0) + 1);
        }
        for (char letters : ArrayLetters) {
            if (resultCounts.get(letters) == 1) {
                return String.format("Unique symbol %s", letters);
            }
        }
        return "Sorry, no unique characters found, try another text.";
    }

}
