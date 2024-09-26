package oop.ex;

public class AcoountMain {
	public static void main(String[] args) {
		
		Account account = new Account();
		account.deposit(10000);
		account.wirhdraw(9000);
		account.wirhdraw(2000);
		System.out.println("잔고: " +account.balance);
	}

}



