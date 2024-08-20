package one.secondprogram;

public class ClassesChallenge {
    public static void main(String[] args) {
        
        Bank_account account = new Bank_account();
        account.setEmail("saitrishalsonti080@gmail.com");
        // System.out.println(account.getEmail());

        int balance = account.setAccountBalance(2000);
        account.setAccountBalance(account.depositIntoAccount(balance, 3500));

        System.out.println(account.withDrawFunds(3000));
        System.out.println(account.getAccountBalance());
    }
}
