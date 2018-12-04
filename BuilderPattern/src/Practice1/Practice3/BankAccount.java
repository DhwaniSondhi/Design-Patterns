package Practice3;

public class BankAccount {
	
	private long accountNumber;//mandatory
	private String owner;
	private String branch;
	private double balance;
	private double interestRate;
	
	BankAccount(long accountNumber){
		this.accountNumber=accountNumber;
	}
	
	public long getAccountNumber(){
		return this.accountNumber;
	}
	public void setAccountNumber(long accountNumber){
		this.accountNumber=accountNumber;
	}
	public String getOwner(){
		return this.owner;
	}
	public void setOwner(String owner){
		this.owner=owner;
	}
	public String getBranch() {
		return this.branch;
	}
	public void setBranch(String branch){
		this.branch=branch;
	}
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public double getInterestRate() {
		return this.interestRate;
	}
	public void setInterestRate(double interestRate){
		this.interestRate=interestRate;
	}
	public String toString() {
		return "AccountNumber: "+this.accountNumber+
				"\nOwner: "+this.owner+
				"\nBranch: "+this.branch+
				"\nBalance: "+this.balance+
				"\nInterest Rate: "+this.interestRate;
	}
}
