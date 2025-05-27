public abstract class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    protected double balance;

    BankAccount(String name, String accountNumber, double balance ) {
        this.accountHolderName = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void withdraw(double amount) throws InsufficientBalanceException;

    public void deposit(double amount) throws InvalidAmountException {
        if(amount <= 0){
            throw new InvalidAmountException("Invalid Amount. Please Try Again!");
        } else {
            balance += amount;
            System.out.println("Successfully Deposited. Your balance is: " + balance);
        }
    }

    public void displayAccount() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
