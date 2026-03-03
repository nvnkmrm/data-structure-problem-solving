package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class O16_PossibleWordsFromPhoneDigits {

    Character[][] numCharMap;

    public O16_PossibleWordsFromPhoneDigits() {
        generateNumberToCharMap();
    }

    private void generateNumberToCharMap() {
        numCharMap = new Character[10][5];
        numCharMap[0] = new Character[]{'\0'};
        numCharMap[1] = new Character[]{'\0'};
        numCharMap[2] = new Character[]{'a', 'b', 'c'};
        numCharMap[3] = new Character[]{'d', 'e', 'f'};
        numCharMap[4] = new Character[]{'g', 'h', 'i'};
        numCharMap[5] = new Character[]{'j', 'k', 'l'};
        numCharMap[6] = new Character[]{'m', 'n', 'o'};
        numCharMap[7] = new Character[]{'p', 'q', 'r', 's'};
        numCharMap[8] = new Character[]{'t', 'u', 'v'};
        numCharMap[9] = new Character[]{'w', 'x', 'y', 'z'};
    }

    public List<String> possibleWords(int[] numbers) {
        return possibleWords(numbers, numbers.length, 0, "");
    }

    //redid - 2
    public List<String> possibleWords(int[] numbers, int len, int index, String str) {
        if (len == index) {
            return new ArrayList<>(Collections.singleton(str));
        }
        List<String> possibleWords = new ArrayList<>();
        Character[] characters = numCharMap[numbers[index]];
        for (Character character : characters) {
            possibleWords.addAll(possibleWords(numbers, len, index + 1, str + character));
        }
        return possibleWords;
    }
}
