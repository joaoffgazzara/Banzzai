package Objects;

public class ContaCorrente extends Conta {
	
	private int contTalao;
	
	public ContaCorrente(int numeroConta, double saldo, int contTalao) {
		super(numeroConta, saldo);
		this.contTalao = contTalao;
	}

	public int getContTalao() {
		return contTalao;
	}

	public void setContTalao(int contTalao) {
		this.contTalao = contTalao;
	}

	
	
	
}
