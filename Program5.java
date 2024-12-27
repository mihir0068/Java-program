import java.util.Scanner;

class BankSimulation {
    public double balance;

    public BankSimulation(double initialBalanace) {
        this.balance = initialBalanace;
    }

    public void deposite(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("--------------------------");
            System.out.println("Balance after deposite:" + balance);
            System.out.println("--------------------------");

        } else {
            System.out.println("Invalid Amount!! This amount can't be deposited");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("That Much amount not in the account!!");
        } else {
            balance -= amount;
            System.out.println("\nWithdrawn Successfully!!");
            System.out.println("--------------------------");
            System.out.println("Balance After Withdraw:" + balance);
            System.out.println("--------------------------");

        }
    }

    public void checkBalance() {
        System.out.println("--------------------------");
        System.out.println("Current Balance: " + balance);
        System.out.println("--------------------------");

    }
}

public class Program5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Banking system");
        BankSimulation bank = new BankSimulation(1000);

        while (true) {
            System.out.println("\n\nEnter Choice...");
            System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Amount to deposite:");
                    double depositeAmt = sc.nextDouble();
                    bank.deposite(depositeAmt);
                    break;

                case 2:
                    System.out.println("Enter Amount to Withdraw:");
                    double withdrawAmt = sc.nextDouble();
                    bank.withdraw(withdrawAmt);
                    break;

                case 3:
                    bank.checkBalance();
                    break;

                case 4:
                    System.exit(1);
                    break;
            }
        }
    }
}
