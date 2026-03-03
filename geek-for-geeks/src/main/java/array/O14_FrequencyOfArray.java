package array;

public class O14_FrequencyOfArray {

    public void frequencyOfSortedArray(int[] arr) {
        int n = arr.length;
        int freq = 1, i = 1;
        while (i < n) {
            while (i < n && arr[i] == arr[i - 1]) {
                i++;
                freq++;
            }
            System.out.println(arr[i - 1] + " ==> " + freq);
            i++;
            freq = 1;
        }
        if (n == 1 || arr[n - 1] != arr[n - 2]) {
            System.out.println(arr[n - 1] + " ==> " + 1);
        }
    }

    public int[] frequencyOfUnSortedArrayUsingNegativeApproach(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] <= 0) {
                i++;
                continue;
            }
            int elementIndex = arr[i] - 1;
            if (arr[elementIndex] > 0) {
                arr[i] = arr[elementIndex];
                arr[elementIndex] = -1;
            } else {
                arr[elementIndex]--;
                arr[i] = 0;
                i++;
            }
        }
        return arr;
    }

    //redid - 3
    public int[] frequencyOfUnSortedArrayUsingAddingNApproach(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] - 1;
        }
        for (int i = 0; i < n; i++) {
            arr[arr[i]] = arr[arr[i]] + n;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / n;
        }
        return arr;
    }
}
