package array;

public class O18_MaxLenEvenOddSubArray {

    public int maxLength(int[] arr) {
        int n = arr.length;
        int res = 1;
        for (int i = 0; i < n; i++) {
            int curr = 1;
            for (int j = i + 1; j < n; j++) {
                if ((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0) || (arr[j] % 2 != 0 && arr[j - 1] % 2 == 0)) {
                    curr++;
                } else {
                    break;
                }
            }
            res = Math.max(res, curr);
        }
        return res;
    }

    public int kadenceAlgorithm(int[] arr) {
        int res = 1;
        int curr = 1;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) ||
                    (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
                curr++;
                res = Math.max(res, curr);
            } else {
                curr = 1;
            }
        }
        return res;
    }

}
