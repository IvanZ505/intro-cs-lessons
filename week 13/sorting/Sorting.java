import java.util.Arrays;

public class Sorting {

	// Selection sort divides the array into regions
	// At the beginning, the array is completely unsorted
	// It grabs the first item and makes it the minimum
	// It then compares it with the rest of the array in order to find the minimum
	// It then takes the minimum and swaps it to the first position in the array
	// Then, it shrinks the unsorted region and then coninues the process
	// Runtime: Worst/Best case: O(n^2)
	public static void selectionSort(int[] a) {
		int n = a.length;
		for(int i = 0; i < n-1; i++) {
			int minPos = i;
			
			// compares against all the unsorted region
			for(int j = i +1; j < n; j++) {
				if(a[j] < a[minPos]) {
					minPos = j;
				}
			}

			int temp = a[i];
			a[i] = a[minPos];
			a[minPos] = temp;
			StdOut.println(Arrays.toString(a));

		}
	}

	// Insertion sort inserts the number by comparing the number and moving everything in the array to make space for the number in the array.
	// Pretend as if index 0 is considered part of the sorted region
	// Next, grab the first item of the unsorted region and places it in the sorted region. 
	// Continue down the unsorted array until everything is sorted.
	// Best case: Array already sorted O(n) Worst case: O(n^2)
	public static void insertionSorting(int[] a) {
		int n = a.length;
		for(int i = 1; i < n; i++) {
			int insertItem = a[i];
			int location = i -1;

			while(location >= 0 && a[location] > insertItem) { // So it'll only move stuff if the item is greater than the insert Item
				a[location + 1] = a[location]; 
				location = location - 1;

			}
			a[location + 1] = insertItem;
		}
	}
}
