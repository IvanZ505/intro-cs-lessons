import java.util.Arrays;

public class concat {
    public static void main(String[] args) {
        int[] a = {1,2 ,3};
        int[] b = {4, 5 ,6};

        int[] c = new int[6];

        for(int x = 0; x<a.length; x++) {
            c[x] = a[x];
        }
        for(int x = 0; x<b.length; x++) {
            c[x+a.length] = b[x];
        }

        String d = Arrays.toString(c);
        System.out.println(d);
    }
}

