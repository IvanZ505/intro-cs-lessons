import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[][] array = new int[4][4];

        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                double k = Math.random();
                int l;
                if(k < 0.5) {
                    l = 0;
                } else {
                    l = 1;
                }
                array[i][j] = l;
            }
        }
        for(int[] arr_row : array) {
            System.out.println(Arrays.toString(arr_row));
        }

        int zerocnt = 0;
        int onecnt = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt == 0) {
                    zerocnt++;
                } else if (anInt == 1) {
                    onecnt++;
                }
            }
        }
        System.out.printf("There is %d zeroes, and %d ones.", zerocnt, onecnt);
    }
}
