package javabrains;

public class BankAccount {
	private String accountHolder;
	private int balance;

	public BankAccount(String accountHolder, int initBalance) {
		this.accountHolder = accountHolder;
		this.balance = initBalance;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int amount) {
		this.balance += amount;
	}

	public void withdraw(int amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
		}
	}

	public void transfer(BankAccount destinationAccount, int amount) {
		if (amount <= this.balance) {
			destinationAccount.deposit(amount);
			this.withdraw(amount);
		}
	}

}
