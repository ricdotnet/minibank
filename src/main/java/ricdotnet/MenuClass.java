package ricdotnet;

import java.util.*;

public class MenuClass {

    Scanner input = new Scanner(System.in); //scanner for user inputs
    //int option; //otpion input variable

    //method to create a menu
    public void getMenu(){
        System.out.print("##### THE MENU #####\n"
        + "1 - Open a Bank Account.\n"
        + "2 - List all Bank Accounts..\n"
        + "3 - View and Edit a specific Bank Account.\n"
        + "##### ##### #####\n"
        + "Enter an option: ");
    }

    //method for account edit menu
    public void accountMenu(){
        System.out.print("##### ACCOUNT MENU #####\n"
        + "1 - Deposit Money.\n"
        + "2 - Withdraw Money.\n"
        + "##### ##### #####\n"
        + "Enter an option: ");
    }
    
}
