
public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account(1122, 20000, 4.5);
		a.withdraw(3000);
		a.deposit(3000);
		System.out.println("Balance = " + a.getBalance() + " Dobanda" + a.getAnnualInterestRate() / 12 + " Data = "
				+ a.getDateCreated());
	}
}
