import java.util.HashMap;

public class BankingSystem {

    private HashMap < Integer, Account> accounts = new HashMap<>();


    public void addAccount (Account account) {
        accounts.put(account.getId(),account);
    }

    public void deposit(double amount, Account user) {
    user.setBalance(user.getBalance()+amount);
    accounts.put(user.getId(),user);
        System.out.println("Transaction successful, Your Balance on your " + user.getAccountNumber() +  " account is  " + user.getBalance());

    }

    public void withdraw(double amount, Account user) throws Exception {
        if (amount > user.getBalance()) {
            throw new Exception("Not enough funds");
        } else {
            user.setBalance(user.getBalance()-amount);
            System.out.println("Transaction successful, Your Balance on your " + user.getAccountNumber() +  " account is  " + user.getBalance());
        }
    }
}
