// Every program in java has got to be in a class

public class Pay {
    // The main method is the entry point of the program and the interpreter looks for this
    public static void main(String[] args) {
        // Command line inputs come inside the program thru args
        double hoursWorked = Double.parseDouble(args[0]); // declare a variable of type double
        double wage = Double.parseDouble(args[1]);

        if(wage < 0 || hoursWorked < 0) {
            System.out.println("Error, ur bad?");
            System.exit(401);
        }
        double pay = hoursWorked * wage;
        System.out.println("Your $$$ is " + pay);

    }
}
