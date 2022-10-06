/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author: Ivan Zheng
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {
        long input = Long.parseLong(args[0]);
        int x = 0;
        int y = 0;
        while(input != 0) {
            x += input % 10;
            input = input/10;
            y += input % 10;
            input = input/10;
        }
        int z;
        z = ((x%10)+(((y%10)*3)%10))%10;

        System.out.println(z);
    }
}