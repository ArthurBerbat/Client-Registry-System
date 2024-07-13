 package base;

public class Conta {
	private int number;
	private double balance;
	private String name;
	private String email;
	private int phone_number;
	
	public Conta(int number, double balance, String name, String email, int phone_number) {
		super();
		this.number = number;
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.phone_number = phone_number;
	}
	
	 
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public void deposit(double value) {
		if(value < 0) {
			System.out.println("invalid amount, for withdraws chose withdraws");
		}
		else {
		balance = balance + value;
			System.out.println("Your courent balance is "+ balance);
		}
	}
	
	public void whitraw(double value) {
		if(balance < value || balance < 0) {
			System.out.println("you do nat have foundings for this Whidraw!");
		}
		else {
			balance = balance - value;
			System.out.println("Your courent balance is "+ balance);
		}
	}
	
}
