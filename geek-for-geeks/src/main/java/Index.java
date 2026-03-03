public class Index {

    static int fun(int arr[]) {
        int x = arr[0];
        for (int i = 1; i < arr.length; i++)
            x = x ^ arr[i];
        return x;
    }

    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("Substring => " + str.substring(3));
        int y = 6;
        y = y >> 1;
        System.out.println(y);
        int x = 1;
        System.out.println(~x);

        int a = 8;
        System.out.println(Math.floor(Math.log(11) / Math.log(2)));

        int arr[] = {9, 12, 2, 11, 2, 2, 10, 9, 12, 10, 9, 11, 2};
        System.out.println(fun(arr));
        //System.out.println(!(0&0));

        int[][] array = new int[6][5];
        System.out.println("Multi dimensional array length => " + array.length);

        String s = "abc";
        String sCopy = String.copyValueOf(s.toCharArray());
        System.out.println(sCopy);
        System.out.println(foo(513, 2));
    }

    static int foo(int n, int r) {

        if (n > 0) return (n % r + foo(n / r, r));

        else return 0;

    }
}
