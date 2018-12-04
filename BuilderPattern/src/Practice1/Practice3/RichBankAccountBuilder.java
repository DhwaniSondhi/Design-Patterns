package Practice3;

public class RichBankAccountBuilder extends BankAccountBuilder {
	
	
	
	@Override
	public BankAccount getBankDetails() {
		return this.bankAccount;
	}
	@Override
	public BankAccountBuilder withOwner(String owner){
		bankAccount.setOwner(owner);
		return this;
	}
	@Override
	public BankAccountBuilder atBranch(String branch){
		bankAccount.setBranch(branch);
		return this;
	}
	@Override
	public BankAccountBuilder setBalance(double balance){
		bankAccount.setBalance(balance);
		return this;
	}
	@Override
	public BankAccountBuilder setROI() {
		bankAccount.setInterestRate(1.05);
		return this;
	}
	
	

}
