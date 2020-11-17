package ricdotnet;

import java.util.*;

public class MiniBank {

    static Scanner input = new Scanner(System.in); //scanner to ask user inputs
    static Random rand = new Random();

    static MenuClass menus = new MenuClass(); //create a menu object from MenuClass

    static int option; //option variable for menu selection
    static int account; //account selection
    static int accountoption; //variable int for account menu

    static String accountname; //name variable for account name
    static int accountnumber; //account number variable to store account number after generated
    static double accountbalance; //account balance starter
    static int accountid = 001; //start and account counter in 001
    static double ammounttoadd; //ammount to deposit double variable

    static boolean start = true; //while loop condition

    static ArrayList<BankAccount> accounts = new ArrayList<BankAccount>(); //create an array list to store accounts
    //static ArrayList<Integer> accountNumbers = new ArrayList(); //ArrayList for account numbers
    //static ArrayList<String> accountHolders = new ArrayList(); //ArrayList for account holder names

    //method to generate account number (6 digit)
    public static int generateAccountNumber(){
        int number = 100000 + rand.nextInt(899999);
        return number;
    }

    public static String getAccName(){
        return accountname;
    }
    public static int getAccNumber(){
        return accountnumber;
    }
    public static double getAccBalance(){
        return accountbalance;
    }
    public static int getAccId(){
        return accountid;
    }

    public static void main(String[] args) {

        while(true){

            menus.getMenu();
            option = input.nextInt(); //record user input
            
            if(option == 1){
                System.out.println();
                System.out.print("Adding an Account.\n"
                        + "You only need to ender your details and the account number will be automatically generated.\n"
                        + "Please enter the name (First and Last seperated by a space).\n");
                System.out.print("Name: ");
                accountname = input.next() + " " + input.next();
                accountnumber = generateAccountNumber();
                accountbalance = 350;
                 //create and add the account on the arraylist
                BankAccount newaccount = new MiniBank(getAccId(), getAccName(), getAccNumber(), getAccBalance());
                accounts.add(newaccount);
                accountid++;
                //accountNumbers.add(accountnumber);
                //accountHolders.add(accountname);
                    
                System.out.println("Account added successfully!");
                System.out.println();
                System.out.print("##### NEW ACCOUNT INFORMATION #####\n"
                    + "Account Holder: " + accountname + "\n"
                    + "Account Number: " + accountnumber + "\n"
                    + "##### ##### #####\n");
                System.out.println();
                    
                /*//print the menu
                menu.getMenu();
                option = input.nextInt();*/

            }else if(option == 2){

                if(accounts.isEmpty()){
                    System.out.println("There are no bank accounts to show right now.");
                }else{
                    System.out.println();
                    System.out.print("##### Accounts #####\n"
                        + "ROW - ACCOUNT HOLDER :: ACCOUNT NUMBER :: BALANCE\n");
                    for(BankAccount account:accounts){
                        account.getBankAccounts();
                    }
                    System.out.println();
                }
        
            }else if(option == 3){

                System.out.print("\nSelect a bank account: ");
                account = input.nextInt();
                System.out.println();

                try{ //try and catch error for invalid accounts

                    BankAccount selectedaccount = accounts.get(account-1); //get account object

                    System.out.print(accounts.get(account-1)+"\n"); //print selected account information
                    System.out.println();
                    menus.accountMenu(); //print account menu from MenuClass.java
                    accountoption = input.nextInt();

                    if(accountoption == 1){
                        System.out.println();
                        System.out.println("Depositing Money.........");
                        System.out.print("How much would you like to deposit?\n"
                        + "Ammount: £");
                        ammounttoadd = input.nextDouble();
                        BankAccount account = (BankAccount) selectedaccount; //veryfies if the account exists
                        account.addBalance(ammounttoadd);
                    }else if(accountoption == 2){
                        System.out.println("Withdrawing Money........");
                    }
                
                }catch(Exception e){
                    System.out.println("That bank account does not exist.");
                }

            }

        }

    }//end of main method
}//end of main class