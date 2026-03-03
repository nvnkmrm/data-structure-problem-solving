package array;

public class O25_MaximumAppearingElementInRange {

    //redid - 3
    public int maximumAppearingElementInGivenRange(int[] l, int[] r) {
        int[] arr = new int[1000];
        int res = 0, n = arr.length;
        for (int i = 0; i < l.length; i++) {
            arr[l[i]]++;
            if (r[i] + 1 < n) {
                arr[r[i] + 1]--;
            }
        }
        int maxCount = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i - 1];
            if (maxCount < arr[i]) {
                maxCount = arr[i];
                res = i;
            }
        }
        return res;
    }
}
