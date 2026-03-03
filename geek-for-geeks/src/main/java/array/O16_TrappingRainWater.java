package array;

public class O16_TrappingRainWater {

    public int rainWaterCapacityUsingNaiveSolution(int[] arr) {
        int res = 0;
        int n = arr.length;
        for (int i = 1; i < n - 1; i++) {
            int lMax = arr[i];
            for (int j = 0; j < i; j++) {
                lMax = Math.max(lMax, arr[j]);
            }
            int rMax = arr[i];
            for (int j = i + 1; j < n; j++) {
                rMax = Math.max(rMax, arr[j]);
            }
            res += Math.min(lMax, rMax) - arr[i];
        }
        return res;
    }

    //redid -1
    public int rainWaterCapacityUsingEffectiveSolution(int[] arr) {
        int n = arr.length;
        int[] lMax = new int[arr.length];
        int[] rMax = new int[arr.length];
        int res = 0;
        lMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(arr[i], lMax[i - 1]);
        }
        rMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rMax[i] = Math.max(arr[i], rMax[i + 1]);
        }
        for (int i = 1; i < n - 1; i++) {
            res += Math.min(lMax[i], rMax[i]) - arr[i];
        }
        return res;
    }
}
