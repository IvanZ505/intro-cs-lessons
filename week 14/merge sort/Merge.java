public class Merge {

    // Pre: receives an array of ints
    // Post: array is sorted in ascending order
    public static void mergeSort(int[] a, int l, int r) {
        if(l>=r) {
            return;
        }
        int mid = (l+r)/2;

        mergeSort(a, l, mid);   // Sorts from left up pto middle
        mergeSort(a, mid+1, r); // Sorts from middle up to right
        merge(a, l, r);     // In actuality, it will only merge from the base case, the smallest int.
    }

    public static void merge(int[] a, int left, int right) {
        int[] temp = new int[right - left + 1];
        if(left >= right) return;

        int mid = (left+right)/2;
        int leftIndex = left;
        int rightIndex = mid +1;
        int t = 0;

        // This part decides which half of the broken down array to take numbers from to put in the temp array
        while((leftIndex <= mid) && (rightIndex <= right)) {
            if(a[leftIndex] <= a[rightIndex]) {
                temp[t] = a[leftIndex];
                leftIndex++;
            } else {
                temp[t] = a[rightIndex];
                rightIndex++;
            }
            t++;
        }

        // At the end, this checks the left array for remaining numbers and adds them to the end of the temp array.
        while(leftIndex <= mid) {
            temp[t] = a[leftIndex];
            leftIndex++;
            t++;
        }

        // At the end, this checks the rigth array for remaining numbers and adds them to the end of the temp array.
        while(rightIndex <= right) {
            temp[t] = a[rightIndex];
            rightIndex++;
            t++;
        }

        // Using this for loop, we put the numbers in the temp array back into the orginal array in their original positions.
        for(t = left; t <= right; t++) {
            a[t] = temp[t-left];
        }
    }
}
