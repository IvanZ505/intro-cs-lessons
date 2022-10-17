public class shapes {
    public static void main(String[] args) {
        StdDraw.square(0.5,0.5, 0.4);
        StdDraw.filledSquare(0.5,0.5, 0.3);

        StdDraw.setPenColor(255,0,0);
        StdDraw.filledCircle(0.5,0.5,0.3);

        StdDraw.enableDoubleBuffering();

        StdDraw.setScale(-2, +2);
        //noinspection InfiniteLoopStatement
        for (double t = 0.0; true; t += 0.02) {
            double x = Math.sin(t);
            double y = Math.cos(t);
            StdDraw.clear();
            StdDraw.setPenColor(255,0,0);
            StdDraw.filledCircle(0,0,2);
            StdDraw.setPenColor(0,0,0);
            StdDraw.filledCircle(x, y, 0.1);
            StdDraw.filledCircle(+x, -y, 0.1);
            StdDraw.filledCircle(-x, y, 0.1);
            StdDraw.filledCircle(-x, -y, 0.1);
            StdDraw.show();
            StdDraw.pause(20);
        }
    }
}
