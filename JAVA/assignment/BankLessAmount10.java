import java.util.*;

class Account{
	long accNum;
	String name;
	double amount;
	long phoneNum;
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Account(long accNum, String name, double amount, long phoneNum) {
		super();
		this.accNum = accNum;
		this.name = name;
		this.amount = amount;
		this.phoneNum = phoneNum;
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", name=" + name + ", amount=" + amount + ", phoneNum=" + phoneNum + "]";
	}
	
}
public class BankLessAmount10 {

	public static void main(String[] args) {
		
		List<Account> list=new ArrayList<Account>();
		list.add(new Account(95554,"Kalyani",50000,94456444));
		list.add(new Account(45545,"Anusha",8000,94456444));
		list.add(new Account(23154,"Renuka",50000,94456444));
		list.add(new Account(33568,"Manikanta",9000,94456444));
		list.add(new Account(89855,"Prasad",50000,94456444));
		list.add(new Account(65566,"Aditya",50000,94456444));
		for(Account ac:list) {
			if(ac.getAmount()<10000) {
				System.out.println(ac);
			}
			
		}
	}

}
