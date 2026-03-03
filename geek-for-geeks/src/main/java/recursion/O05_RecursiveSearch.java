package recursion;

public class O05_RecursiveSearch {

    public boolean search(int[] arr, int x) {
        return searchRecursively(arr, x, 0, arr.length - 1);
    }

    //redid -1
    public boolean searchRecursively(int[] arr, int x, int l, int r) {
        if (l > r) {
            return false;
        }
        if (arr[l] == x || arr[r] == x) {
            return true;
        }
        return searchRecursively(arr, x, l + 1, r - 1);
    }
}
