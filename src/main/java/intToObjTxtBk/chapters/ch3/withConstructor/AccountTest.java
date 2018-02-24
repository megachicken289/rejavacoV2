package intToObjTxtBk.chapters.ch3.withConstructor;

import java.util.Scanner;

public class AccountTest
{
    public static void main(String[] args)
    {
        // create two Account objects
        Account account1 = new Account("Jane Green");
        Account account2 = new Account("John Blue");

        // display initial value for each Account
        System.out.println("account1 name is: " + account1.getName());
        System.out.println("account2 name is: " + account2.getName());
    }
}
