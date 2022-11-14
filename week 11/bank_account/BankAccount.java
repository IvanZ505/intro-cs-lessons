public class BankAccount {
    private double balance;
    private String user_name;
    private String user_email;

    public BankAccount(double balance,String user_name,String user_email) {
        this.balance = balance;
        this.user_name = user_name;
        this.user_email = user_email;
    }

    public void addBal(double amount) {
        this.balance += amount;
        StdOut.printf("Your new balance: %s", this.balance);
        startup();
    }
    public void withdraw(double amount) {
        if(amount > balance) {
            StdOut.println("Error: You do not have that much money!");
        } else {
            this.balance -= amount;
        }
        startup();
    }

    public void startup() {
        StdOut.println("Welcome to Josh's Bank.");
        StdOut.println("""
                How can we help you today?\s
                 1) Check Bal\s
                 2) Deposit\s
                 3) Withdraw\s
                 4) Change Information\s""");

        int selection = StdIn.readInt();
        switch (selection) {
            case 1 -> checkAcc();
            case 2 -> {
                StdOut.println("How much would you like to deposit? ");
                addBal(StdIn.readDouble());
            }
            case 3 -> {
                StdOut.println("How much would you like to withdraw? ");
                withdraw(StdIn.readDouble());
            }
            case 4 -> loadAcc();
            default -> {
                StdOut.println("Bad choice!");
                startup();
            }
        }
    }
    public void checkAcc() {
        StdOut.println("Balance: " + this.balance);
        StdOut.println("Name: " + this.user_name);
        StdOut.println("Email: " + this.user_email);
        startup();
    }
    public void loadAcc() {
        StdOut.println("What would you like to change?\n 1) Email \n 2) Name");
        int a = StdIn.readInt();
        if (a == 1) {
            StdOut.println("Enter your Old email: ");
            String email = StdIn.readString();
            if(email.equals(this.user_email)) {
                StdOut.println("Enter your New email: ");
                String new_email = StdIn.readString();
                this.user_email = new_email;
                StdOut.printf("Your new email is: %s", new_email);
            }
        } else if (a == 2) {
            StdOut.println("Enter your Old name: ");
            String name = StdIn.readString();
            if(name.equals(this.user_name)) {
                StdOut.println("Enter your New name: ");
                String new_name = StdIn.readString();
                this.user_name = new_name;
                StdOut.printf("Your new name is: %s", new_name);
            } else {
                StdOut.println("Incorrect name!");
            }
        }
        startup();
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(69000, "Ivan", "ivan.z@rutgers.edu");

        account1.startup();

    }
}
