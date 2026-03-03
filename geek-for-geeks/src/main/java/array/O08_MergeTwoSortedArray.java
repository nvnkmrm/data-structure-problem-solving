package array;

public class O08_MergeTwoSortedArray {

    //redid - 1
    public int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0, k = 0;
        int[] arr3 = new int[n + m];
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        while (i < n) {
            arr3[k++] = arr1[i++];
        }
        while (j < m) {
            arr3[k++] = arr2[j++];
        }
        return arr3;
    }
}
