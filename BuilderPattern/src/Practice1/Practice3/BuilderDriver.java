package Practice3;

public class BuilderDriver {
	
	public static void main(String[] args) {
		RichBankAccountBuilder richBankAccountBuilder=new RichBankAccountBuilder();
		PoorBankAccountBuilder poorBankAccountBuilder=new PoorBankAccountBuilder();
		
		Explorer explorer=new Explorer(richBankAccountBuilder);
		//explorer.createAccountWithOwner("Dhwani");
		explorer.createAccount()
				.atBranch("Branch")
				.withOwner("Dhwani")
				.setBalance(1000)
				.setROI();
		//explorer.createAccountWithOwnerWithBalanceBranch("Dhwani", 1000, "Branch");
		System.out.println(explorer.getAccountDetails());
	}

}
