package Practice3;

/**
 * Director
 */
public class Explorer {
	
	
	BankAccountBuilder bankAccountBuilder;
	Explorer(BankAccountBuilder bankAccountBuilder){
		this.bankAccountBuilder=bankAccountBuilder;
	}
	
	public BankAccount getAccountDetails(){
		return bankAccountBuilder.getBankDetails();
	}
	public BankAccountBuilder createAccount() {
		bankAccountBuilder.createAccount();
		return bankAccountBuilder;
	}
	/*public BankAccountBuilder branch(String branch) {
		bankAccountBuilder.atBranch(branch);
		return bankAccountBuilder;
		
	}
	public BankAccountBuilder owner(String owner) {
		bankAccountBuilder.withOwner(owner);
		return bankAccountBuilder;
	}
	public BankAccountBuilder balance(double balance) {
		bankAccountBuilder.setBalance(balance);
		return bankAccountBuilder;
	}*/
	
	
}
