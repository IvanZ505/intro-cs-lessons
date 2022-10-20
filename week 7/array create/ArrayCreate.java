public class ArrayCreate {
    public static double[] createAndPopulate(int size, int min, int max) {

        double[] array = new double[size];
        int i = 0;
        populateRecur(array, size, min, max, i);
        return array;
    }

    public static void populateRecur(double[] array, int size, int min, int max, int i) {
        if(i<size) {
            double x = Math.random() * (max - min) + min;
            array[i] = x;
            i++;
            populateRecur(array, size, min, max, i);
        }
    }
}
