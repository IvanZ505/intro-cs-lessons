/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author:
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {
        double[] array_copy = new double[array.length];
        int i = 0;
        for(double x: array) {
            array_copy[i] = x;
            i++;
        }

        return array_copy;
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {
        for(int v = 0; v < x.length; v++) {
            x[v] = alpha * x[v];
            y[v] = alpha * y[v];
        }
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {
        for(int v = 0; v < x.length; v++) {
            x[v] = x[v] + dx;
            y[v] = y[v] + dy;
        }
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {
        for(int v = 0; v < x.length; v++) {
            double temp = x[v];
            x[v] = x[v]*Math.cos(Math.toRadians(theta)) - y[v]*Math.sin(Math.toRadians(theta));
            y[v] = y[v]*Math.cos(Math.toRadians(theta)) + temp*Math.sin(Math.toRadians(theta));
        }
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {
//        StdDraw.setScale(-5.0, +5.0);
//        double[] x = { 0, 1, 1, 0 };
//        double[] y = { 0, 0, 2, 1 };
//        double alpha = 2.0;
//        StdDraw.setPenColor(StdDraw.RED);
//        StdDraw.polygon(x, y);
//        scale(x, y, alpha);
//        StdDraw.setPenColor(StdDraw.BLUE);
//        StdDraw.polygon(x, y);

//        StdDraw.setScale(-5.0, +5.0);
//        double[] x = { 0, 1, 1, 0 };
//        double[] y = { 0, 0, 2, 1 };
//        double dx = 2.0, dy = 1.0;
//        StdDraw.setPenColor(StdDraw.RED);
//        StdDraw.polygon(x, y);
//        translate(x, y, dx, dy);
//        StdDraw.setPenColor(StdDraw.BLUE);
//        StdDraw.polygon(x, y);

        StdDraw.setScale(-2.0, +2.0);
        double[] x = { 0, 1, 1, 0 };
        double[] y = { 0, 0, 2, 1 };
        double theta = 45.0;
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);
        rotate(x, y, theta);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
    }
}
