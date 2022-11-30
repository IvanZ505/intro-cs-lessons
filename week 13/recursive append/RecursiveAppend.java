/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author: Ivan Zheng, ivan.z@rutgers.edu, iz60
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) {
        if (n == 0) {
            return original;
        }
        return original + appendNTimes(original, n-1);
    }

    public static void main (String[] args) {

	StdOut.println(appendNTimes("dog", 2));
    }
}
