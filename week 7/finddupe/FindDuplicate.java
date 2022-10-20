
/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author: Ivan Zheng, ivan.z@rutgers.edu, iz60
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) {
        int[] array = new int[args.length];
        boolean found = false;
        for(int x = 0; x<args.length; x++) {
            int y = Integer.parseInt(args[x]);
            array[x] = y;
        }

        int x;
        for(x = 0; x<array.length-1; x++) {
            int count = x+1;
            while(count != array.length) {
                if(array[x] == array[count]) {
                    found = true;
                }
                count++;
            }
        }
        if(!found) {
            System.out.println("false");
        }
        if(found) {
            System.out.println("true");
        }
	}
}
