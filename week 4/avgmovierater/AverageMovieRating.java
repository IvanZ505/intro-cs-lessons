import java.util.Arrays;

public class AverageMovieRating {
    public static void main(String[] args) {
        // args stores command line args
        // args.length stores the number of args in the command line

        /*int numFriends = args.length;
        int sum = 0;

        int i;
        for(i=0; i<numFriends; i++) {
            int rating = Integer.parseInt(args[i]);
            sum += rating;
        }
        float div = sum / numFriends;
        System.out.println(div);*/

        int i;
        int[] ints = new int[args.length];
        for (i = 0; i < args.length; i++) {
            int newVal = Integer.parseInt(args[i]);
            if (ints[i] == 0) {
                ints[i] = newVal;
            }
        }
        System.out.println(Arrays.toString(ints));

        int sum = 0;
        int j = 0;
        average(ints, sum, j);
    }

    @SuppressWarnings("InfiniteRecursion")
    static void average(int[] list, double sum, int j) {
        sum += list[j];
        j++;
        if (j == list.length) {
            double div = (sum  * 1.0) / list.length;
            System.out.println(div);
            System.exit(200);
        }

        average(list, sum, j);
    }
}
