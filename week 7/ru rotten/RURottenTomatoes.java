import java.util.Arrays;

/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author: Ivan Zheng, ivan.z@rutgers.edu, iz60
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {

        int reviewers = Integer.parseInt(args[0]);
        int num_movies = Integer.parseInt(args[1]);

        int[][] movie_ratings = new int[reviewers][num_movies];

        int arg = 2;
        for(int x =0; x<movie_ratings.length; x++) {
            for(int y=0; y<movie_ratings[x].length; y++) {
                int temp = Integer.parseInt(args[arg]);
                movie_ratings[x][y] = temp;
                arg++;
            }
        }


        double largest_avg = 0;
        int largest_index = 0;
//        for(int x = 0; x<movie_ratings.length; x++) {
//           System.out.println(Arrays.toString(movie_ratings[x]));
//            }

        int x = 0;

        for(int y = 0; y < movie_ratings[0].length; y++) {
            double avg = 0;
            int z = 0;
            while(z<movie_ratings.length) {
                avg += movie_ratings[z][y];
                z++;
            }
            avg = avg / reviewers;
//            System.out.printf("Avg Index %d: %f", y, avg);
//            System.out.println();
            if(avg >largest_avg) {
                largest_avg = avg;
                largest_index = y;
            }
            x++;
    }

        System.out.println(largest_index);
    }
}
