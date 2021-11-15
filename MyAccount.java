import java.util.Scanner;

public class MyAccount {

    public static void main(String[] args) {
        SavingsAccount save = new SavingsAccount();
        FixedDeposit fixed = new FixedDeposit();
        CurrentAccount current = new CurrentAccount();

        int pin = 2000;
        System.out.println("Welcome To Cooperative  mobile banking services \n Please enter your pin");
        Scanner input = new Scanner(System.in);
        int AUTH = input.nextInt();

        if (AUTH == pin) {
            int option = 0;
            System.out.println("Enter \n1. Savings account\n2. Fixed deposit account\n3. Current account");
            option = input.nextInt();
            if (option == 1) {
                save.savings();
            } else if (option == 2) {
                fixed.Deposit();
            } else if (option == 3) {
                current.activity();
            }


        } else
            System.out.println("Incorrect pin");
    }


}
