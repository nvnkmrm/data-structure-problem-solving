package recursion;

import java.util.ArrayList;
import java.util.List;

public class O07_PowerSet {

    public String[] powerSetOfString(String str) {
        List<String> powerSet = new ArrayList<>();
        powerSetOfString(str, 0, "", powerSet);
        return powerSet.toArray(new String[0]);
    }

    //redid - 5
    public void powerSetOfString(String s, int i, String curr, List<String> l) {
        if (s.length() == i) {
            l.add(curr);
            return;
        }
        powerSetOfString(s, i + 1, curr + s.charAt(i), l);
        powerSetOfString(s, i + 1, curr, l);
    }
}
