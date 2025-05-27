import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Rural Bank of Nepal");
        System.out.print("Enter customer name: ");

        String custName = sc.nextLine();
        Customer customerName = new Customer(custName);

        SavingAccount custSavingAcc = new SavingAccount(custName, "SAV123", 150000);
        CurrentAccount custCurrentAcc = new CurrentAccount(custName, "CUR123", 200000);

        customerName.addAccount(custSavingAcc);
        customerName.addAccount(custCurrentAcc);

        boolean exit = false;

        while(!exit){
            System.out.println("\nChoose operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Add Interest (Savings only)");
            System.out.println("4. View Accounts");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            try {
                if (choice == 1) {
                    BankAccount selAcc = accType(custSavingAcc, custCurrentAcc);
                    displayBalance(selAcc);
                    System.out.println("Please Enter your Amount: ");
                    int depositAmt = sc.nextInt();
                    exit = true;
                    selAcc.deposit(depositAmt);


                } else if (choice == 2) {
                    BankAccount selAcc = accType(custSavingAcc, custCurrentAcc);
                    displayBalance(selAcc);
                    System.out.println("Please Enter your Amount: ");
                    int depositAmt = sc.nextInt();

                    exit = true;
                    selAcc.withdraw(depositAmt);

                } else if (choice == 3) {
                    custSavingAcc.addIntrest();
                    System.out.println("Successfully intrest added. Thank you!");
                    System.out.println("Your updated balance is: " + custSavingAcc.getBalance());
                    exit = true;
                } else if (choice == 4) {
                    BankAccount selAcc = accType(custSavingAcc,custCurrentAcc);
                    selAcc.displayAccount();
                    exit = true;

                } else if (choice == 5) {
                    System.out.println("Thank you for using RBAMS!");
                    exit = true;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static BankAccount accType(BankAccount saving, BankAccount current){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select account type:");
        System.out.println("1. Savings");
        System.out.println("2. Current");
        System.out.print("Enter choice: ");
        int accountType = scanner.nextInt();

        return accountType == 1 ? saving : current;
    }

    public static void displayBalance(BankAccount account){
        System.out.println("Dear, " + account.getAccountHolderName());
        System.out.println("Current balance: " + account.getBalance());
        System.out.println("******************************************");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("******************************************");
    }
}
