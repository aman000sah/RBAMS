public class SavingAccount extends BankAccount{
    public SavingAccount(String name, String accountNumber, double balance){
        super(name, accountNumber, balance);
    }
    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if(amount > balance){
            throw new InsufficientBalanceException("Withdrawal failed. Insufficient balance!");
        } else{
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }

    private static final double intrestRate = 0.12;

    public void addIntrest() {
        double intrest = balance * intrestRate;
        System.out.println("Your intrest is " + intrest + ". Your total balance is " + balance);
    }
}

