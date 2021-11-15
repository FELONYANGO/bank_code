import java.util.Scanner;

public class SavingsAccount {
    double balance = 200;
    Scanner scanner = new Scanner(System.in);

    public void savings() {

        System.out.println("Reply with\n1.Deposit\n2.Withdraw\n3.Check balance");

        int input = scanner.nextInt();
        if (input == 1) {
            Deposit();

        } else if (input == 2) {
            withdraw();
        } else if (input == 3) {
            balance();
        } else {
            System.out.println("wrong input");
        }
    }

    public void balance() {
        System.out.println(balance);
    }

    public void balance(double bal) {
        bal = balance;
        System.out.println("Your balance is: " + bal + "\n Do you wish to transact?, select an option below");
    }

    public void withdraw() {
        System.out.println("Enter amount to withdraw");
        int widh = scanner.nextInt();
        balance -= widh;
        System.out.println("Amount " + widh + " has been withdrawn, new balance " + balance);

    }

    public void Deposit() {
        System.out.println("Enter amount to deposit");
        int deposit = scanner.nextInt();
        balance += deposit;
        System.out.println(deposit + " has been deposited to your account successfully");
    }
}