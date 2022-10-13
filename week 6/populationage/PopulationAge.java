
public class PopulationAge {
    public static void main(String[] args) {
        int nbrPeople = StdIn.readInt();

        for(int i = 0; i < nbrPeople; i++) {
            StdOut.println((int) (Math.random()*120));
        }
    }
}
