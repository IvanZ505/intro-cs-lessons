/*************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski
 *
 *  @author: Ivan Zheng, iz60, ivan.z@rutgers.edu
 *
 *************************************************************************/

public class Sierpinski {

    // Height of an equilateral triangle whose sides are of the specified length. 
    public static double height(double length) {

        return (Math.sqrt(3)*length)/2;
    }

    // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
    // of the specified side length. 
    public static void filledTriangle(double x, double y, double length) {
        double height = height(length);
        double lowerX = x - length/2;
        double upperX = x + length/2;
        double[] x_pts = {x, lowerX, upperX};
        double upperY = y + height;
        double[] y_pts = {y, upperY, upperY};
        StdDraw.filledPolygon(x_pts, y_pts);
    }

    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    public static void sierpinski(int n, double x, double y, double length) {
            filledTriangle(x, y, length);

            if(n != 1) {
                sierpinski(n - 1, x -length/2, y, length / 2);
                sierpinski(n - 1, x + length/2, y, length / 2);
                sierpinski(n - 1, x, y+height(length), length / 2);
            }
    }

    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        // int n = StdIn.readInt();
        double[] x = {0.0, 0.5, 1.0};
        double[] y = {0.0, height(1), 0.0};
	    StdDraw.polygon(x,y);
        //sierpinski(3,-18.68,33.54,67.23);
        sierpinski(n, 0.5, 0, 0.5);
    }
}
