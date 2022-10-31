public class RecursiveTriangle {
    public static void pyramid(int x) {
        int y = 0;
        if(x == 0) {
            return;
        }
        printRow(x, y);
        pyramid(x-1);
    }

    public static void upwardsPyramid(int x) {
        int y = 1;
        if(y == x) {
            return;
        }
        printRow(y, x);
        upwardsPyramid(x-1);
    }
    public static void printRow(int x, int y) {
        if(x == y) {
            StdOut.println();
            return;
        }
        StdOut.print("*");
        printRow(x+1, y);
    }
    public static void main(String[] args) {
        //pyramid(5);
        upwardsPyramid(5);
    }
}
