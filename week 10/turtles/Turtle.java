import java.awt.*;

/*
    This is an abstract data type that describes a turtle.
 */
public class Turtle {
    /*
        Instance variables
           Instance variable have values that together identify an object
           Instance variables are accessible from any of the methods in the class
        The private tag makes it so it can only be accessed by the Turtle class.
        It HIDES the variable.
    */

    // the x and y coordinates of the turtle
    private double x;
    private double y;

    // direction in which the turtle is facing
    private double angle;
    // the color of the turtle
    private Color color;

    /*
        Constructors Time!!
     */

    // The Default constructor: No arguments, just instantiates the turtle!

    // This guy is not a custom turtle, but a preset turtle
    public Turtle() {
        // Initializing the instance variables
        x = 0.0;
        y = 0.0;
        angle = 45.0;
        color = new Color(0,100,155);
    }

    // This one is a custom turtle.
    public Turtle(double xVal, double yVal, double orientation, Color turtleColor) {
        // OR USE this.x in order to differentiate if you want to call xVal-x.
        // This means you are stepping into the object.
        x = xVal;
        y = yVal;
        angle = orientation;
        color = turtleColor;
    }

    // Instance methods, methods that extend a class and give it function (The operations)
    // They do nt have the word static
    // Instance methods manipulate instance variables

    // convert our ADT to a string
    public String toString() {
        String str = "Turtle(" +  x + " " + y + ") Direction: " + angle + "Color: " + color.toString();
        return str;
    }

    // Turn left by updating the turn angle by delta degrees
    public void turnLeft(double delta) {
        // No one can change angle by itself, but can update it by using turn left.
        angle += delta; // the instance variable is being updated
    }

    // Move the turtle forward by step size.
    // Draws a line from old x,y to new x,y
    public void moveForward(double stepSize) {
        double oldX = x;
        double oldY = y;

        // I have moved the turtle
        x += stepSize*Math.cos(Math.toRadians(angle));
        y += stepSize*Math.sin(Math.toRadians(angle));

        StdDraw.setPenColor(color);
        StdDraw.line(oldX, oldY, x, y);
    }

    public void drawTurtle() {
        StdDraw.setPenColor(color);
        StdDraw.filledCircle(x, y, 0.01);
    }


    public static void main(String[] args) {
        // This is the default turtle
        Turtle t1 = new Turtle();
        // This is the custom turtle
        Turtle t2 = new Turtle(0.5, 0.9, 75.0, new Color(0, 100, 155));

        // the turtle be movin ong ong frfr
        StdDraw.setPenColor(t2.color);
        t2.drawTurtle();
        t2.turnLeft(180);
        t2.moveForward(0.5);
        t2.turnLeft(50);
        t2.moveForward(0.3);
        t2.drawTurtle();

        t1.drawTurtle();
        t1.moveForward(0.3);
        t1.drawTurtle();

        StdOut.println(t1.toString());
        StdOut.println(t2.toString());
    }
}
