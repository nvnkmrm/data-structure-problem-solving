package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class O16_PossibleWordsFromPhoneDigitsTest {

    @Test
    public void shouldPrintPossibleWordsFromPhoneDigits() {
        O16_PossibleWordsFromPhoneDigits possibleWordsFromPhoneDigits = new O16_PossibleWordsFromPhoneDigits();
        String[] actualWords = possibleWordsFromPhoneDigits.possibleWords(new int[]{2, 3, 4}).toArray(new String[0]);
        String[] expectedWords = new String[]{"adg", "adh", "adi", "aeg", "aeh", "aei", "afg", "afh", "afi",
                "bdg", "bdh", "bdi", "beg", "beh", "bei", "bfg", "bfh", "bfi",
                "cdg", "cdh", "cdi", "ceg", "ceh", "cei", "cfg", "cfh", "cfi"};
        Arrays.sort(expectedWords);
        Arrays.sort(actualWords);
        Assertions.assertArrayEquals(expectedWords, actualWords);
    }

}