package Practice3;
import java.util.Random;

public abstract class BankAccountBuilder {
	
	BankAccount bankAccount;	
	Random rand=new Random(10000000);
	
	public void createAccount() {
		bankAccount=new BankAccount(rand.nextLong());
	}
	public abstract BankAccount getBankDetails();
	public abstract BankAccountBuilder withOwner(String owner);
	public abstract BankAccountBuilder atBranch(String branch);
	public abstract BankAccountBuilder setBalance(double balance);
	public abstract BankAccountBuilder setROI();
}
