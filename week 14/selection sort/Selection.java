import java.util.Arrays;

public class Selection {
    public static int[] selectionSort(int[] a) {
        for(int i = 0; i < a.length; i++) {
            int min = i;
            int temp = 0;
            for(int j = i; j < a.length; j++) {
                if(a[j] < a[min]) {
                    min = j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a = {24, 5, 12, 55, 2, 12, 59, 13};
        int[] b = selectionSort(a);
        StdOut.println(Arrays.toString(b));
    }
}
