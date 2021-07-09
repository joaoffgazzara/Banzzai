package Objects;

public class ContaEstudantil extends Conta {
	
	private double limiteEstudantil;

	public ContaEstudantil(int numeroConta, double saldo, double limiteEstudantil) {
		super(numeroConta, saldo);
		this.limiteEstudantil = limiteEstudantil;
	}

	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	
	
}
