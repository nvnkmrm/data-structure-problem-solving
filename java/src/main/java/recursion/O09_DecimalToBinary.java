package recursion;

public class O09_DecimalToBinary {

    public String convert(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        convert(n, stringBuilder);
        return stringBuilder.toString();
    }

    //redid - 1
    private void convert(int n, StringBuilder stringBuilder) {
        if (n == 0) {
            return;
        }
        convert(n / 2, stringBuilder);
        stringBuilder.append(n % 2);
    }
}
