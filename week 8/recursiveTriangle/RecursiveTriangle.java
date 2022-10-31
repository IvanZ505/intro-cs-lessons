public class RecursiveTriangle {
    public static void pyramid(int x) {
        if(x == 0) {
            return;
        }
        printRow(x);
        pyramid(x-1);
    }

    public static void upwardsPyramid(int x) {
        int y = 1;
        if(y == x) {
            return;
        }
        printRow(y);
        pyramid(y+1);
    }
    public static void printRow(int y) {
        if(y == 0) {
            StdOut.println();
            return;
        }
        StdOut.print("*");
        printRow(y-1);
    }
    public static void main(String[] args) {
        //pyramid(5);
        upwardsPyramid(5);
    }
}
