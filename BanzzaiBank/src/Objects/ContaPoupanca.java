package Objects;

public class ContaPoupanca extends Conta{

	private int diaAniversarioPoupanca;
	
	public ContaPoupanca(int numeroConta, double saldo, int diaAniversarioPoupanca) {
		super(numeroConta, saldo);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}

	public int getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}

	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}
	
	
}
