import java.util.Arrays;

/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *  @author: Ivan Zheng
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive {

    public static void main (String[] args) {

        int[] array = new int[5];

        int i;
        for(i=0; i<args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }
        int j;
        int largest = array[0];
        for(j=1; j < array.length -1; j++) {
            if (array[j] > array[j + 1]) {
                if (largest < array[j]) {
                    largest = array[j];
                }
            } else if (array[j] < array[j+1]) {
                if (largest < array[j+1]) {
                    largest = array[j+1];
                }}}
        System.out.println(largest);
    }}