public class triangle_draw {
    public static void main(String[] args) {
        StdDraw.setCanvasSize(1000,1000);
        StdDraw.line(0, 0, 0.5, 0.75);
        StdDraw.line(0.5, 0.75, 1, 0);
        StdDraw.line(0,0, 1, 0);

        StdDraw.setScale(-2, +2);
        StdDraw.enableDoubleBuffering();

//        for (double t = 0.0; true; t += 0.02) {
//            double x = Math.sin(t);
//            double y = Math.cos(t);
//            StdDraw.clear();
//            StdDraw.filledCircle(x, y, 0.05);
//            StdDraw.filledCircle(-x, -y, 0.05);
//            StdDraw.show();
//            StdDraw.pause(20);
//        }
    }
}
