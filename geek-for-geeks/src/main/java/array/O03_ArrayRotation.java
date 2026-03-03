package array;

public class O03_ArrayRotation {

    // redid - 1
    public int[] rotateUsingTempArr(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        int i = 0;
        for (int j = d; j < n; j++) {
            arr[i++] = arr[j];
        }

        for (int j = 0; j < d; j++) {
            arr[i++] = temp[j];
        }

        return arr;
    }

    public void leftRotateArrayByOne(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }

    public int[] rotateOneAtTime(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        for (int i = 0; i < d; i++) {
            int temp = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }
        return arr;
    }

    //redid - 2
    public int[] rotateUsingJugglingAlgorithm(int[] arr, int d) {
        int i, j, k, temp, n = arr.length;
        int gcd = gcd(n, d);
        for (i = 0; i < gcd; i++) {
            j = i;
            temp = arr[i];
            while (true) {
                k = j + d;
                if (k >= n) {
                    k -= n;
                }
                if (k == i) {
                    break;
                }
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
        return arr;
    }

    public int[] rotateUsingReverseMethod(int[] arr, int d) {
        int n = arr.length;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
        return arr;
    }

    private int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public void reverse(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start + 1, end - 1);
    }

}
