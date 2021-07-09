package Objects;

public class Conta {
	
	private String titular;
	private int numeroConta;
	private double saldo;
	
	
	public Conta(int numeroConta, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}


	/*public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}*/


	public int getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}


	public double getSaldo() {
		return saldo;
	}


	/*public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	*/
	
	public void deposito (double valorDeposito){
		if(valorDeposito <= 0) {
			System.out.println("Operação inválida.");
		}
		else {
		this.saldo += valorDeposito;
		System.out.println("Deposito realizado com sucesso.");
		}
	}
	
	public void saque (double valorSaque) {
		if(valorSaque <= 0) {
			System.out.println("Operação inválida.");
		}
		else if (valorSaque>saldo) {
			System.out.println("Saldo insuficiente.");
		}
		else {
		this.saldo -= valorSaque;
		System.out.println("Operação realizada com sucesso.");
		}
	}
}
