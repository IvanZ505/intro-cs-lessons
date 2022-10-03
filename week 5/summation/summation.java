public class summation {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int sum = 0;
        int  y;
        for(y=0; y<x; y++) {
            sum += x;
            y++;
        }
        System.out.println(sum);
    }
}
