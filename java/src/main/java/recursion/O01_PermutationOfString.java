package recursion;

public class O01_PermutationOfString {

    //Redid - 8
    public void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        }
        for (int i = l; i <= r; i++) {
            str = swap(str, l, i);
            permute(str, l + 1, r);
            str = swap(str, l, i);
        }
    }

    private String swap(String str, int i, int j) {
        char temp;
        char[] charArr = str.toCharArray();
        temp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = temp;
        return String.valueOf(charArr);
    }
}
