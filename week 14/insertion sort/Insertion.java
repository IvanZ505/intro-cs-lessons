public class Insertion {
    public static int[] insertionSort(int[] a) {
        int sorted = 0;

        for(int i = 1; i < a.length; i++) {
            int insertion = a[i];
            int location = i -1;

            while(location >= 0 && insertion <= a[location]) {
                a[location +1] = a[location];
                location--;
            }
            a[location +1] = insertion;
        }
        return a;
    }
}
