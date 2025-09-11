package Task3;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ATM {
    private Account acct;
    private Scanner s;

    public ATM(Account acct) {
        this.acct = acct;
        this.s = new Scanner(System.in);
    }

    public void run() {
        System.out.println("Hello, " + acct.getName() + "!");
        while (true) {
            showMenu();
            try {
                int choice = s.nextInt();
                switch (choice) {
                    case 1:
                        showBal();
                        break;
                    case 2:
                        dep();
                        break;
                    case 3:
                        wdw();
                        break;
                    case 4:
                        showHist();
                        break;
                    case 5:
                        System.out.println("Thank you. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid. Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter a number.");
                s.next(); // clear invalid input
            }
        }
    }

    private void showMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. History");
        System.out.println("5. Exit");
        System.out.print("Enter choice: ");
    }

    private void showBal() {
        System.out.println("Your balance is: Rs." + acct.getBal());
    }

    private void dep() {
        System.out.print("Deposit amount: Rs.");
        try {
            double amt = s.nextDouble();
            if (acct.deposit(amt)) {
                System.out.println("Rs." + amt + " deposited successfully.");
            } else {
                System.out.println("Invalid amount. Positive numbers only.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Enter a number.");
            s.next();
        }
    }

    private void wdw() {
        System.out.print("Withdraw amount: Rs.");
        try {
            double amt = s.nextDouble();
            if (acct.withdraw(amt)) {
                System.out.println("Rs." + amt + " withdrawn successfully.");
            } else {
                System.out.println("Failed. Insufficient funds or invalid amount.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Enter a number.");
            s.next();
        }
    }
    
    private void showHist() {
        List<String> hist = acct.getHist();
        if (hist.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("\nTransaction History:");
            for (String trans : hist) {
                System.out.println("- " + trans);
            }
        }
    }
    
    public static void main(String[] args) {
        Account myAcct = new Account("S. Gupta", 1500.00);
        ATM atm = new ATM(myAcct);
        atm.run();
    }
}
