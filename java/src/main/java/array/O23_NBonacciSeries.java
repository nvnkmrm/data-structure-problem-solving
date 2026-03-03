package array;

public class O23_NBonacciSeries {

    //redid -1
    public int[] nBonacciSeries(int n, int m) {
        int[] arr = new int[m];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = 0;
        }
        arr[n - 1] = 1;
        arr[n] = 1;
        for (int i = n + 1; i < m; i++) {
            arr[i] = 2 * arr[i - 1] - arr[i - n - 1];
        }
        return arr;
    }
}
