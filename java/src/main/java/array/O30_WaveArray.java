package array;

public class O30_WaveArray {

    //redid - 2
    public int[] convert(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i += 2) {
            if (i + 1 < n) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return arr;
    }
}
