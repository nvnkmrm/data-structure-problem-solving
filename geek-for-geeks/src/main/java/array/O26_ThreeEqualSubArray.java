package array;

public class O26_ThreeEqualSubArray {

    //redid - 3
    public String findSplit(int[] arr) {
        int preSum = 0,
                sum = 0,
                n = arr.length,
                i1 = -1,
                i2 = -1, s1, s2;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        s1 = sum / 3;
        s2 = 2 * s1;
        for (int i = 0; i < n; i++) {
            preSum += arr[i];
            if (preSum == s1 && i1 == -1) {
                i1 = i;
            } else if (preSum == s2 && i1 != -1) {
                i2 = i;
            }
        }
        return i1 + ", " + i2;
    }
}
