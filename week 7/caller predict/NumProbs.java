import java.util.Optional;

public class NumProbs {

    public static void iPrint(String value) {
        StdOut.println(value);
    }
    public static int factorial(int number) {
        int result = 1;

        for(int x = number; x>=1; x--) {
            result *=x;
        }
        return result;
    }

    public static int numberOfDigits (int number) {
        int count = 0;

        while(number >0) {
            count+= 1;
            number/=10;
        }
        return count;
    }
}

