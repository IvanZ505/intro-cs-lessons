import java.util.Arrays;

public class Practice {
    public static void arr(int[] arr) {
        if (arr[0] < 10 && arr[arr.length - 2] > 10)
            arr[0] = 10;
        int[] b = new int[arr.length];
        b[0] = 4;
        arr = b;
    }

    public static String hasAt(String x) {
        if(!x.contains("t")) {
            return x;
        }
        String reverse = "";
        for(int i = x.length()-1; i >= 0; i--) {
//            char temp = x.charAt(i);
//            reverse = reverse.concat(String.valueOf(temp));

            String temp = x.substring(i, i+1);
            reverse = reverse.concat(temp);

        }
        return reverse;
    }

    public static void main(String[] args) {
//        int[] array = {1, 4, 29, 12, 4, 12, 5};
//        int[] b = new int[array.length];
//        arr(array);
//        StdOut.println(Arrays.toString(array));
//        StdOut.println(Arrays.toString(b));
//        String s = "HELLO BRO";
//        s = s.substring(0,2);
//        StdOut.println(s);

        int numRows = Integer.parseInt(args[0]);
        int numCols = Integer.parseInt(args[1]);
        int[][] a = new int[numRows][numCols];

        int x = 0;
        for (int i = 0; i < a.length; i++) {

            int w = 0;

            for (int j = 0; j < a[i].length - 1; j++) {
                a[i][j] = x;
                x++;
            }
            for (int j = 0; j < a[i].length - 1; j++) {
                w += a[i][j];
            }
            a[i][a[i].length - 1] = w;
        }

        for (int[] g : a) {
            StdOut.println(Arrays.toString(g));
        }
        String s = "String";
        StdOut.println(hasAt(s));

        String s1 = "Hello";
        String s2 = "bye";

        StdOut.println();
    }
}
