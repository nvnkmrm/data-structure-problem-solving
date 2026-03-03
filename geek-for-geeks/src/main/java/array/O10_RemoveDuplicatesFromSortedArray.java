package array;

public class O10_RemoveDuplicatesFromSortedArray {

    public int[] naiveSolution(int[] arr) {
        int[] temp = new int[arr.length];
        temp[0] = arr[0];
        int tempArrLen = 1;
        for (int i = 1; i < arr.length; i++) {
            if (temp[tempArrLen - 1] != arr[i]) {
                temp[tempArrLen] = arr[i];
                tempArrLen++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < tempArrLen) {
                arr[i] = temp[i];
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }

    //redid - 1
    public int efficientSolution(int[] arr) {
        int res = 1,
                n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
}
