public class PlotUSA {
    public static void main(String[] args) {
        double ymin = StdIn.readDouble();
        double xmin = StdIn.readDouble();
        double ymax = StdIn.readDouble();
        double xmax = StdIn.readDouble();

        StdDraw.setXscale(xmin, xmax);
        StdDraw.setYscale(ymin, ymax);
        StdDraw.setPenColor(180,0,0);

        while(!StdIn.isEmpty()) {
            double y = StdIn.readDouble();
            double x = StdIn.readDouble();
            StdDraw.point(xmax-x+xmin, y);
        }
    }
}
