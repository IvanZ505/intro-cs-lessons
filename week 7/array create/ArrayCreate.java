public class ArrayCreate {
    public static double[] createAndPopulate(int size, int min, int max) {

        double[] array = new double[size];
        int i = 0;
        populateRecur(array, size, min, max, i);
        return array;
    }

    // Recursion for above
    public static void populateRecur(double[] array, int size, int min, int max, int i) {
        if(i<size) {
            double x = Math.random() * (max - min) + min;
            array[i] = x;
            i++;
            populateRecur(array, size, min, max, i);
        }
    }

    public static void printDoubleArray(double[] array) {
        StdOut.print("[");
        for(double x : array) {
            StdOut.print(x + " ");
        }
        StdOut.println("]");
    }

    public static double sumArray(double[] array) {
        double sum = 0;
        for (double v : array) {
            sum += v;
        }
        return sum;
    }

}
