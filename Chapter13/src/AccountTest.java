class Account1{
	private int regNumber;
	private String name;
	private int balance;
	
	public String getName(){	return name;	}
	public void setName(String name){	this.name = name;}
	public int getBalance(){	return balance;}
	public void setBaalance(int balance){	this.balance = balance;}
	}

public class AccountTest1 {
	public static void main(String[] args) {
		Account1 obj = new Account1();
		obj.setName("Tom");
		obj.setBaalance(100000);
		System.out.println("이름은 "+obj.getName()+" 통장 잔고는"+obj.getBalance()+"입니다.");
		
	}

}

