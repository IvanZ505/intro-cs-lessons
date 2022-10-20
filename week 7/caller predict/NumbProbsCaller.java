import java.util.AbstractQueue;

public class NumbProbsCaller {
    public static void main(String[] args) {

        int nbr = NumProbs.numberOfDigits(21312);
        StdOut.println(nbr);
        System.out.println(NumProbs.factorial(3));
        NumProbs.iPrint("The fact of " +3+" is: " + NumProbs.factorial(3));
    }
}
