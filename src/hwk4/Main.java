/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hwk4;

/**
 *
 * @author agottlieb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    //Andrew Gottlieb
    //Csc 2310
    //02-14-2011
    //Hwk4
    public static void main(String[] args) {
        //Creates an object called acct.1 references the third construtor in
        //the Account class displays balance value after money is deposited
        // into or withdrawn from the account
        System.out.println("Creating an Account for John Smith with 400 " +
        "dollars using a three argument construtor:");
        Account acct1 = new Account(400,"john","smith");
        System.out.println("Depositing $400 into account");
        acct1.deposit(400);
        System.out.println(acct1);
        System.out.println("Withdrawing 100 from the account:");
        acct1.withdraw(100);
        System.out.println(acct1);
        //Creates an object called acct.2 references the second construtor in
        //the Account class displays balance value after money is deposited
        // into or withdrawn from the account
        System.out.println("Creating an account for Andrew Gottlieb with $300 "+
        "using a two argument construtor:");
        Account acct2 = new Account("andrew", "gottlieb");
        System.out.println("depositing 300 dollars in the account:");
        acct2.deposit(300);
        System.out.println(acct2);
        System.out.println("Withdrawing 100 dollars from the account:");
        acct2.withdraw(100);
        System.out.println(acct2);
        //Creates an object called acct.3 references the first construtor in
        //the Account class displays balance value after money is deposited into
        // or withdrawn from the account
        System.out.println("creating an account for Doc Sebi with 0 dollars"+
        " using a default construtor:");
        Account acct3 = new Account();
        System.out.println("depositing 100 dollars in Sebi account");
        acct3.deposit(100);
        System.out.println(acct3);
        System.out.println("Withdrawing 50 dollars from Sebi account");
        acct3.withdraw(50);
        System.out.println(acct3);



        
        


        

        
        


    }

}
