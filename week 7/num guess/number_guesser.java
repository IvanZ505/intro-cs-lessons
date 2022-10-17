public class number_guesser {
    public static void main(String[] args) {
        int num = (int) (Math.random() *1000) + 1;
        System.out.println(num);

        StdOut.println("What is your guess (Between 1-1000): ");
        int guess_num = 1;
        int x = 0;
        //guess_num++;
        while(x != num) {
            x = StdIn.readInt();
            if(x < 1 || x > 1000) {
                guess_num++;
                StdOut.println("Incorrect bounds, reenter a number between (1,1000): ");

            }
            if(x> num) {
                guess_num++;
                StdOut.println("Lower....");
                StdOut.printf("Input Guess #%d:", guess_num);
                StdOut.println();
                //x = StdIn.readInt();
            } else if(x< num) {
                guess_num++;
                StdOut.println("Higher....");
                StdOut.printf("Input Guess #%d:", guess_num);
                StdOut.println();
                //x = StdIn.readInt();
            }
        }
            guess_num++;
            StdOut.printf("You guessed the number! The number was %d, and you took %d attempts.", num, guess_num);
    }
}
