public class Fibonacci {
    public static int fib(int n) {
        // Base case
        if(n == 1 || n == 2) {
            return 1;
        }
        // A bunch of fib functions are called
        // Ex: fib(4) runs -> fib(3) + fib(2) = (fib(2) + fib(1)) + fib(2)
        // Gets broken down until it hits the base case
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        StdOut.println(StdRandom.uniform());
        StdOut.println(fib(10));

    }
}
