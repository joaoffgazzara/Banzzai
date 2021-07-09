package Objects;

public class ContaEspecial extends Conta {

	private double limiteEspecial;

	public ContaEspecial(int numeroConta, double saldo, double limiteEspecial) {
		super(numeroConta, saldo);
		this.limiteEspecial = limiteEspecial;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	
	

}
