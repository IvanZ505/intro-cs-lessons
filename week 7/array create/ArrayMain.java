import java.util.Arrays;

public class ArrayMain {
    // A reference holds the address in memory of an array
    public static void main(String[] args) {
        double[] array = ArrayCreate.createAndPopulate(5, 1, 6);
        System.out.println(Arrays.toString(array));
    }
}
