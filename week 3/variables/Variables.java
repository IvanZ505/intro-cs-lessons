import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.math.*;

public class Variables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        // Version which takes only 5 nums

        /*System.out.println("Enter 5 numbers to get avg.");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double num4 = scanner.nextDouble();
        double num5 = scanner.nextDouble();

        double a = num1 + num2 + num3 + num4 + num5;
        double b = a/5;*/

        // Version that takes as many as you want

        System.out.println("Enter as many #s as you want until you are done. Then just enter 0");
        double add = 0;
        int count = 0;
        while(scanner.nextDouble() != 0) {
            double num = scanner.nextDouble();
            add = num + add;
            count++;
        }
        double avg = add/count;

        System.out.println(avg);
    }
}
