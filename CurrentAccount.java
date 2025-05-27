public class CurrentAccount extends BankAccount {
    private static final double overDraftLimit = 50000;

    CurrentAccount(String name, String accNumber, double balance){
        super(name, accNumber, balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if(amount > balance + overDraftLimit){
            throw new InsufficientBalanceException("Withdrawal failed. Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }
}
