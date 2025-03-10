import java.util.Scanner;

public class BankAccount {
    // Attributes of the BankAccount class
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor to initialize BankAccount object
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Rs." + amt + " deposited successfully.");
        }
        else {
            System.out.println("Invalid!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("Rs." + amt + " withdrawn successfully.");
        }
        else if (amt > balance) {
            System.out.println("Insufficient balance.");
        }
        else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Current balance: Rs." + String.format("%.2f", balance));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String accountHolder = sc.nextLine();

        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accountHolder, accountNumber, balance);

        while (true) {
            System.out.println("\nChoose an option: ");
            System.out.println("1 -> Deposit");
            System.out.println("2 -> Withdraw");
            System.out.println("3 -> Display Balance");
            System.out.println("4 -> Exit");
            int operation = sc.nextInt();

            switch (operation) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


/*
I/P -> Enter Account Holder Name: Sanya
Enter Account Number: 2345678
Enter Initial Balance: 4000

Choose an option:
1 -> Deposit
2 -> Withdraw
3 -> Display Balance
4 -> Exit
2
Enter amount to withdraw: 400
O/P -> Rs.400.0 withdrawn successfully.

Choose an option:
1 -> Deposit
2 -> Withdraw
3 -> Display Balance
4 -> Exit
3
O/P -> Current balance: Rs.3600.00

Choose an option:
1 -> Deposit
2 -> Withdraw
3 -> Display Balance
4 -> Exit
4
O/P -> Thank you for using the ATM. Goodbye!

 */