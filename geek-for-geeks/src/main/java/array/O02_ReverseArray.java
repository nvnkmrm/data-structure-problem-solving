package array;

public class O02_ReverseArray {

    //Redid - 7
    public void reverse(char[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start + 1, end - 1);
    }
}
