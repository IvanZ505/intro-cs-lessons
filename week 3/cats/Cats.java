public class Cats {
    public static void main(String[] args) {
        int anaCats;
        int ellenCats;

        anaCats = Integer.parseInt(args[0]);
        ellenCats = Integer.parseInt(args[1]);

        if (anaCats < 0 || ellenCats < 0) {
            System.out.println("Error: Negative cat");
        } else {
            int totalcats = anaCats + ellenCats;
            System.out.println("Total cats is: " + totalcats);
        }
    }
}
