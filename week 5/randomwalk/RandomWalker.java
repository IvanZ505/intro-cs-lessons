/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author: Ivan Zheng
 *  ivan.z@rutgers.edu
 *  iz60
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        double squared;
        int i;
        int x = 0;
        int y = 0;
        System.out.printf("(%d, %d)%n", x, y);
        for(i = 1; i <= n; i++) {
            double rolllr = Math.random();
            double rolladdmin = Math.random();

            // <0.5 left, minus >0.5 right,plus
            if(rolllr < 0.5 && rolladdmin < 0.5) {
                x--;
            } else if (rolllr < 0.5 && rolladdmin > 0.5) {
                x++;
            } else if (rolllr > 0.5 && rolladdmin < 0.5) {
                y--;
            } else {
                y++;
            }
            System.out.printf("(%d, %d)%n", x, y);
        }

	    squared = Math.pow(x, 2) + Math.pow(y, 2);
        System.out.println(squared);
    }
}
