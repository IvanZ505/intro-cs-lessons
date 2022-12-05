public class Binary {
    public static int binarySearch(int[] a, int x) {
        int low = 0;
        int high = a.length;
        int mid = a.length/2;

        while(low <= high) {
            if(a[mid] == x) {
                return mid;
            }
            if(a[mid] > x) {
                high = mid  -1;
            } else {
                low = mid +1;
            }
            mid = (low + high)/2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 6, 12, 15, 25, 33};
        StdOut.println(binarySearch(a, 6));
    }
}
