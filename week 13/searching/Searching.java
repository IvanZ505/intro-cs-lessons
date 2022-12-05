public class Searching {
    // Sequential search: Starts from the beginning of the array and goes to the end.
    // Worst case: The code would run n times and would have O(n)
    // Best case: The code would run 1 time and have O(1)
    public static int sequentialSearch(int[] A, int target) {
        for(int i = 0; i < A.length; i++) {
            if(target == A[i]) {
                // Found target
                return i;
            }

        }
        // not found
        return -1;
    }
    // returns the index of the target in the array, if it exists.
    // A BINARY SEARCH IS THE BEST FOR A SORTED ARRAY!!!
    // worst case: log(n), giving a O(log n)
    // The worst case would happen if the target was at index of 0 and index of A.length -1.
    // It would also occur for the numbers mid-1 and mid+1.
    // best case: finds it on the first time, O(1)
    public static int binarySearch(int[] A, int target) {
        int low = 0;
        int high = A.length-1;

        // allows this code to keep running and then stop when low gets greater than high.
        while(low <= high) {
            int mid = (low+high)/2;
            if(target == A[mid]) { // Basic operation to count toward running time!
                return mid;
            }
            if(target > A[mid]) {
                low = mid+1;
            } else if (target < A[mid]) {
                high = mid-1;
            }
        }

        return -1;
    }
}
