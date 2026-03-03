package array;

public class O21_MinimumConsecutiveFlips {

    //redid - 1
    public String minimumFlips(int[] arr) {
        int n = arr.length;
        StringBuilder res = new StringBuilder();
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                if (arr[i] != arr[0]) {
                    res.append(" From ").append(i).append(" to ");
                } else {
                    res.append(i - 1);
                }
            }
        }
        if (arr[n - 1] != arr[0]) {
            res.append(n - 1);
        }
        return res.toString().trim();
    }
}
