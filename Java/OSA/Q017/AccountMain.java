package Q017;

public class AccountMain {

	public static void main(String[] args) {


		CheckingAccount acct = new CheckingAccount((int)(Math.random() * 1000));
		
		// acct.amount=0;//line n1
		//acct.changeAmount(-acct.getAmount());
		acct.changeAmount(-acct.amount);
		System.out.println(acct.getAmount());
		
		

	}

}
