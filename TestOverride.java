import java.time.LocalDate;

public class TestOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Account ref = new Account();
		
		
		
	ref.withdraw(600); 
	
		ref=new SavingsAccount();
		
		
		
	ref.withdraw(900);
		ref=new FixedDepositAccount();
	
		if(ref instanceof FixedDepositAccount) {
			System.out.println("Yes it is pointing to FixedDepsoitAccount ");
		}
		else {
			System.out.println("No, it is NOT pointing to FixedDepositAccount ");
		}
		
		System.out.println("----------------------");
	
		
		if(ref instanceof SavingsAccount) {
			System.out.println("Yes it is pointing to SavingsAccount ");
		}
		else {
			System.out.println("No, it is NOT pointing to SavingsAccount ");
		}
		
		System.out.println("----------------------");
		
		if(ref instanceof Account) {
			System.out.println("Yes it is pointing to Account ");
		}
		else {
			System.out.println("No it is not pointing to Account");
		}
	ref.withdraw(500);
		
		
	
		if(ref instanceof Account) {
			
		}
		
	}

}
abstract class Withdrawing 
{
	 abstract void withdraw(float amt); 
}
class Recurring extends Withdrawing
{
	void withdraw(float x) {
		
	}
}
class Account extends Withdrawing {
	float balance=5000;
	void withdraw(float y) {
		System.out.println("Account:withdraw()");
		balance=balance-y;
	}
}
class SavingsAccount extends Account {
	
	void calculateSimpleInterest() {
		
	}
	void withdraw(float a) {
		System.out.println("SavingsAccount:withdraw()");
		if(balance < a) {
			throw new RuntimeException("funds insufficient...");
		}
		balance=balance-a;
	}
}
class FixedDepositAccount extends SavingsAccount {
	int tenureYear=2022;  
	void withdraw(float a) {
		int currentYear = LocalDate.now().getYear();
		if(tenureYear != currentYear) {
			throw new RuntimeException("Account not matured...cannot withdrwa....");
		}
		System.out.println("FixedDepositAccount:withdraw()");
		balance=balance-a;
	}
	void withdrawing(float a) { }
	

/*public class TestOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}

