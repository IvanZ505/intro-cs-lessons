public class arrays {
    public static void main(String[] args) {
        int[][] array = new int[4][4];

        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length-1; j++) {
                double k = Math.random();
                int l;
                if(k < 0.5) {
                    l = 0;
                } else {
                    l = 1;
                }
                array[i][j] = l;
            }
        }

        int zerocnt = 0;
        int onecnt = 1;
        for(int o=0; o<array.length; o++) {
            for(int p=0; p<array[p].length-1; p++) {
                if(array[o][p] == 0) {
                    zerocnt++;
                } else if (array[o][p] == 1) {
                    onecnt++;
                }
            }
        }
        System.out.printf("There is %d zeroes, and %d ones.", zerocnt, onecnt);
    }
}
