
public class PopulationAge {
    public static void main(String[] args) {
        int nbrPeople = 12; // StdIn.readInt();

        for(int i = 0; i < nbrPeople; i++) {
            StdOut.println((int) (Math.random()*120));
        }

        int sum = 0;
        int count = 0;
        while(!StdIn.isEmpty()) {
            sum += StdIn.readInt();
            count++;
        }

        double avg = sum / count;
        StdOut.printf("Average of ages is: %d",avg);
    }
}
