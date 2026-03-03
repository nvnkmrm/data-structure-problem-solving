package array;

public class O11_MoveZerosEnd {

    //redid - 3
    public void moveZeros(int[] arr) {
        int n = arr.length,
                k = 0; // Non zero index
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                k++;
            }
        }
    }
}
