package bitwise;

import java.util.ArrayList;
import java.util.List;

public class O08_OneOddOccurring {

    public int naiveSolution(int[] a) {
        List<Integer> oddOccurringElement = new ArrayList<>();
        for (int element : a) {
            if (oddOccurringElement.contains(element)) {
                oddOccurringElement.remove((Integer) element);
            } else {
                oddOccurringElement.add(element);
            }
        }
        if (oddOccurringElement.size() > 0) {
            return oddOccurringElement.get(0);
        }
        return -1;
    }

    //redid - 1
    public int efficientSolution(int[] a) {
        int res = 0;
        for (int element : a) {
            res ^= element;
        }
        return res;
    }
}
