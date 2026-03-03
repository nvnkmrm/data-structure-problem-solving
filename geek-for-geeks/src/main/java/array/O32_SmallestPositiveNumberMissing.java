package array;

import java.util.Arrays;

public class O32_SmallestPositiveNumberMissing {

    //redid - 1
    public int segregationApproach(int[] arr) {
        int i, j = 0, x, n = arr.length, temp;
        for (i = 0; i < n; i++) {
            if (arr[i] <= 0) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }

        int[] segregated = new int[j];
        n = segregated.length;
        for (i = 0; i < n; i++) {
            segregated[i] = arr[i];
        }

        for (i = 0; i < n; i++) {
            x = Math.abs(segregated[i]) - 1;
            if (x < n && segregated[x] > 0) {
                segregated[x] = -segregated[x];
            }
        }

        for (i = 0; i < n; i++) {
            if (segregated[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }


}
