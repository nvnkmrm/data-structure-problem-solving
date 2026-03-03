package recursion;

public class O02_AllPermutationOfString {

    public void permute(String str) {
        permute(str, "");
    }

    private void permute(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println("Prefix ==> " + prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permute(rem, prefix + str.charAt(i));
            }
        }
    }
}
