public class Classroom {
    public static void main(String[] args) {
        System.out.print("How many students in this class? ");
        int nbrStudents = StdIn.readInt();

        String[] inLine = new String[nbrStudents];
        for(int i = 0; i < inLine.length; i++) {
            System.out.printf("Enter Student %d's name: ",i);
            inLine[i] = StdIn.readString();
        }
        System.out.println();
        for(String stu : inLine) {
            System.out.print(stu + " - ");
        }

        System.out.print("# rows: ");
        int rows = StdIn.readInt();
        System.out.print("# cols: ");
        int col = StdIn.readInt();

        String[][] room = new String[rows][col];

        int i = 0;
        for(int x = 0; x<room.length; x++) {
            for(int y = 0; y<room[x].length; y++) {
                room[x][y] = inLine[i];
                i++;
            }

        }

    }
}
