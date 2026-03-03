package array;

public class O17_MaxConsecutive1s {

    //redid - 2
    public int count(int[] arr) {
        int res = 0, curr = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                curr = 0;
            } else {
                curr++;
                res = Math.max(res, curr);
            }
        }
        return res;
    }
}
