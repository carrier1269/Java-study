package chap3;

public class BankAccount00 {

	public static void main(String[] args) {
		BankAccount yoon = new BankAccount();
		BankAccount park = new BankAccount();
		
		yoon.deposit(5000);
		park.deposit(3000);
		
		yoon.withdraw(2000);
		park.withdraw(2000);
		
		yoon.checkMyBalance();
		park.checkMyBalance();
		

	}

}
