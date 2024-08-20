package one.secondprogram;

public class Bank_account {
    
    //account initialization
    private int AccountNumber;
    private int Accountbalance;
    private String CustomerName;
    private String Email;
    private int PhoneNumber;

    //getter methods
    public int getAccountNumber(){
        return AccountNumber;
    }

    public int getAccountBalance(){
        return Accountbalance;
    }

    public String getCustomerName(){
        return CustomerName;
    }

    public String getEmail(){
        return Email;
    }

    public int getPhoneNumber(){
        return PhoneNumber;
    }

    //setter methods
    public int setAccountNumber(int AccountNumber){
        this.AccountNumber = AccountNumber;
        return AccountNumber;
    }

    public int setAccountBalance(int Accountbalance){
        this.Accountbalance = Accountbalance;
        return Accountbalance;
    }

    public String setCustomerName(String CustomerName){
        this.CustomerName = CustomerName;
        return CustomerName;
    }

    public String setEmail(String Email){
        this.Email = Email;
        return Email;
    }

    public int setPhoneNumber(int PhoneNumber){
        this.PhoneNumber = PhoneNumber;
        return PhoneNumber;
    }

    //deposit method
    public int depositIntoAccount(int currentBalance, int NewCashToDeposit){
        int TotalBalance = 0;
        TotalBalance += currentBalance+NewCashToDeposit;
        return TotalBalance;
    }

    //withDraw method
    public String withDrawFunds(int withDrawAmount){
        
        if(this.Accountbalance<=0){
            return "No money in ur acoount please check once";
        }

        else if(withDrawAmount>this.Accountbalance){
            return "insufficient ammount";
        }
        else{
            this.Accountbalance = this.Accountbalance-withDrawAmount;
        }
        return "The amount is withdrawed"; 
    }
}
