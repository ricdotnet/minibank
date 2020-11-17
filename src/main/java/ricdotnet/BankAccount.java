package ricdotnet;

public class BankAccount {

    private String accountname;
    private int accountnumber;
    private double accountbalance;
    private int accountid;

    public BankAccount(int accid, String accname, int accnumber, double accbalance){
        accountid = accid;
        accountname = accname;
        accountnumber = accnumber;
        accountbalance = accbalance;
    }

    public void addBalance(double ammounttoadd){
        accountbalance = accountbalance + ammounttoadd;
        System.out.println("The new balance on " + accountnumber + " is £" + accountbalance + "\n");
    }

    public void getBankAccounts(){
        System.out.println(accountid + " :: " + accountname + " :: " + accountnumber + " :: £" + accountbalance);
    }

    //Array Objects to print as String
    public String toString(){
        return accountid + " :: " + accountname + " :: " + accountnumber + " :: £" + accountbalance;
    }
    
}