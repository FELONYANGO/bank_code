import java.util.Scanner;

public class FixedDeposit extends SavingsAccount {
    double amount = 0;
    Scanner input = new Scanner(System.in);

    @Override
    public void Deposit() {
        super.Deposit();
        System.out.println("Enter period in months: ");
        int period = input.nextInt();
        double interest = (period / 12) * balance;
        amount = interest + balance;
        System.out.println("Amount after " + period + " months will be " + amount);
    }
}
