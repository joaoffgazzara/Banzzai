package Objects;

public class ContaEmpresarial extends Conta {
	
	private double limiteEmpresarial;

	public ContaEmpresarial(int numeroConta, double saldo, double limiteEmpresarial) {
		super(numeroConta, saldo);
		this.limiteEmpresarial = limiteEmpresarial;
	}

	public double getLimiteEmpresarial() {
		return limiteEmpresarial;
	}

	public void setLimiteEmpresarial(double limiteEmpresarial) {
		this.limiteEmpresarial = limiteEmpresarial;
	}
	
	
}
