package chapters.ch3.withConstructorAndDouble;

import java.util.Scanner;

public class AccountTest {
	public static void main (String[] args) {
		// create two Account objects
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);
		
		// display initial value
		System.out.printf("account1[%s] has: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("account2[%s] has: $%.2f%n", account2.getName(), account2.getBalance());
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Deposit for acct1[%s]: ", account1.getName());
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1[%s] balance%n%n", depositAmount, account1.getName());
		account1.deposit(depositAmount);
		
		//display balances
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
		System.out.printf("%n");
		
		System.out.printf("Deposit for acct2[%s]: ", account2.getName());
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2[%s] balance%n%n", depositAmount, account2.getName());
		account2.deposit(depositAmount);
		
		//display balances
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
	}
}
