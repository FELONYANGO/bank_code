import java.util.Scanner;

public class CurrentAccount extends SavingsAccount {


    Scanner input = new Scanner(System.in);

    @Override
    public void balance(double bal) {
        super.balance(bal);
    }

    public void activity() {
        balance(balance);
        System.out.println("select an option below:\n1. Yes\n2. No ");
        int option = input.nextInt();
        if (option == 1) {
            withdraw();
        } else {
            System.out.println("Thank you for choosing us.");
        }
    }
}
