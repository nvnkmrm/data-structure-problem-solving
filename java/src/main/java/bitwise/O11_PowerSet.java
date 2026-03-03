package bitwise;

import java.util.ArrayList;
import java.util.List;

public class O11_PowerSet {

    //redid - 2
    public String[] powerSetOfString(String str) {
        List<String> powerSet = new ArrayList<>();
        int n = str.length();
        int powSize = (int) Math.pow(2, n);
        for (int counter = 0; counter < powSize; counter++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((counter & (1 << j)) != 0) {
                    stringBuilder.append(str.charAt(j));
                }
            }
            powerSet.add(stringBuilder.toString());
        }
        return powerSet.toArray(new String[0]);
    }
}
