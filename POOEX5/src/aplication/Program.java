package aplication;

import java.util.Locale;
import java.util.Scanner;

import data.Account;

public class Program {

	public static void main(String[] args) {
		
		double Value;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Entre com o numero da conta: ");
		int accountNumber = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Entre com o nome do titular da conta: ");
		String name = sc.nextLine();
		
		System.out.println("Deseja realizar um deposito inicial ? (1 para sim/2 para não) : ");
		int controlVariable = sc.nextInt();
		
		if ( controlVariable == 1) {
			System.out.println("Entre com o valor inicial R$ : ");
			Value = sc.nextDouble();
			
		}
		else {
			Value = 0;
		}
		
		Account account = new Account(name, accountNumber, Value);
		
		System.out.println("Dados atuais da conta: "+ account);
		
		
		System.out.println("Entre com um valor para deposito: R$");
		Value = sc.nextDouble();
		
		account.setValueAccount(Value);
		
		System.out.println("Dados atuais da conta: "+ account);
		
		System.out.println("Entre com um valor para sacar: R$");
		Value = sc.nextDouble();
		
		Account.Saque(Value);
		
		System.out.println("Dados atuais da conta: "+ account);
			
		
		sc.close();

	}

}
