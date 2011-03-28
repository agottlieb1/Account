/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hwk4;

/**
 *
 * @author agottlieb
 */
//Andrew Gottlieb
//Csc 2310
//02-14-2011
//Hwk4
//This is an Account class which stores a first name, last name and
//balance of a person's account
public class Account {
// The 3 variables that will be used to represent the state of the account.
    private double balance;
    private String firstName;
    private String lastName;


// This default construtor will be referenced by the acct3 object in the
//  main
    public Account() {
        balance = 0;
        firstName = "Doc";
        lastName = "Sebi";
    }
 // This construtor requires 2 parameters first and last name and sets the
 //  balance to zero references acct2 object in the main.
    public Account ( String fName, String lName) {
        balance = 0;
        firstName = stringCap(fName) ;
        lastName = stringCap (lName);
    }
 // This construtor requires 3 arguments  firstName, lastName, and balance it
 // will be used in acct3 object in the main.
    public Account (double initialBalance, String fName , String lName) {
        balance = initialBalance;
        firstName =stringCap(fName) ;
        lastName = stringCap(lName) ;
    }
 // This getter method returns the value of the firstName variable
    public String getFirstName() {
        return firstName;
    }
//  This getter method returns the value of the lastName variable
    public String getLastName(){
        return lastName;
    }
// This getter method returns the value of the balance variable
     public double getBalance() {
        return balance;
    }
// This method makes sure only positive dollar amounts are deposited in
// the account.
     public void deposit (double amount) {
        if (amount<=0.0)
            amount = 0.0;
        else
            balance += amount;
// This method makes sure the withdrawl amount is not negative and
// that there is enough money in the account to withdraw if not a 35 dollar fee
// plus the withdraw amount will be deducted from the account.
   }
    public void withdraw (double amount) {
        if (amount > 0.0 && balance >= amount)
           balance -= amount;
        else if (amount > balance)
          balance= balance -amount -35;
    }
// The methods setBalance,setFname, and setLName are the setter methods

    public void setBalance(double newBalance){
       balance = newBalance;

    }

    public void setFirstName(String newFirstName) {
        firstName =  stringCap(newFirstName);
    }

    public void setLastName(String newLastName) {
        lastName = stringCap(newLastName);
    }
// This method capitalizes the first letter of a string and leaves the other
// letters lower case.

    private String stringCap(String strToCap ) {
      String firstLetterCap = strToCap.substring(0, 1).toUpperCase();
      String otherLetter=strToCap.substring(1).toLowerCase();
      
      return firstLetterCap + otherLetter;
         
        
    }
// Override of toString method it Displays the account's last name, first name
// and balance in the main.

    public String toString(){
        return lastName + "," + firstName + "\t" + balance;
    }
   
}
