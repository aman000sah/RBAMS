import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List <BankAccount> accountDetails = new ArrayList<>();

    public Customer(String name){
        this.name = name;
    }

    public void addAccount(BankAccount account) {
        accountDetails.add(account);
    }

    public List<BankAccount> getAccountInfo(){
        return accountDetails;
    }
}
