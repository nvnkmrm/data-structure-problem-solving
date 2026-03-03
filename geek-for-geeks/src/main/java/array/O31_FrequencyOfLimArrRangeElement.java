package array;

public class O31_FrequencyOfLimArrRangeElement {

    //redid - 2
    public int[] frequencyOfElements(int[] arr, int n, int p) {
        for (int i = 0; i < n; i++) {
            int index = (arr[i] - 1) % (p + 1);
            if (index < n) {
                arr[index] += (p + 1);
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] /= (p + 1);
        }
        return arr;
    }
}
