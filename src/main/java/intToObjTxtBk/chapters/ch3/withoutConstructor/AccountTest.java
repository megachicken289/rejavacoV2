package java.intToObjTxtBk.chapters.ch3.withoutConstructor;

import java.util.Scanner;

public class AccountTest
{
    public static void main(String[] args)
    {
        // create a Scanner obj to obtain input from the command window
        Scanner input = new Scanner(System.in);

        // create an Account object and assign it to myAccout
        Account myAccount = new Account();
        Account myAccount1 = new Account();

        // display initial value of name (null)
        System.out.println("Initial name is: " + myAccount.getName());

        // prompt for and read name
        System.out.printf("Please enter the name: ");
        String theName = input.nextLine();     // read the line of text
        myAccount.setName(theName);             // put theName in myAccount
        System.out.println();   // blankline

        // display the name stored in the object myAccount
        System.out.println("Name in object myAccount: " + myAccount.getName());
    }
}
