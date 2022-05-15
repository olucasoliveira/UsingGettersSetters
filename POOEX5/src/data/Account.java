package data;

public class Account {
	
	private String name;
	private int accountNumber;
	private static double valueAccount;
	
	public Account(String name, int accountNumber, double Value) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.valueAccount = Value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValueAccount() {
		return valueAccount;
	}

	public void setValueAccount(double Value) {
		this.valueAccount += Value;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	public static double Saque(double Value) {
		return valueAccount = valueAccount - Value - 5;

	}
	
	public String toString() {
		return "Numero da conta: "
				+accountNumber
				+", Nome do titular: "
				+name
				+", Saldo: R$ "
				+valueAccount;
		
	}
	
	
}


