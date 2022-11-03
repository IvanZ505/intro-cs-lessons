import java.awt.*;

public class PlayingWithPicture {
    // function to convert to grayscale

    public static Color grayscale(Color c) {
        // Get the RGB values of the  individual pixel passed in.
        int rgb_r = c.getRed();
        int rgb_g = c.getGreen();
        int rgb_b = c.getBlue();

        // compute luminous
        double lumi = 0.299 * rgb_r + 0.587 * rgb_g + 0.114 * rgb_b;
        int roundlumi = (int) Math.round(lumi);

        // Sets all the RGB values to the lumi value.
        return new Color(roundlumi, roundlumi, roundlumi);
    }
    public static void main(String[] args) {

        // reference to an object of type picture
        // The object is a 2D array of pixels and each pixel is a color object
        Picture picture = new Picture("hu_ghost.jpg");

        for(int col = 0; col<picture.width(); col++) {
            for(int row = 0; row<picture.height(); row++) {
                Color origPixelColor = picture.get(col, row);
                Color grayPixelColor = grayscale(origPixelColor);
                // Set the pixel at the column and row
                picture.set(col, row, grayPixelColor);

            }
        }
        // invoking the show method.
        picture.show();
        StdOut.printf("%d x %d : %d overall pixels\n", picture.width(), picture.height(), picture.width() * picture.height());
    }
}
