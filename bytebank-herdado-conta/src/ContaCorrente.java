
public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override   // -> SIGNIFICA QUE O METODO SERA SOBREESCRITO
	public boolean saca(double valor) {
		double valorAsacar = valor + 0.2;
		return super.saca(valorAsacar);
	}

	@Override
	public void deposita(double valor) {
		if (valor > 0) {
			super.saldo += valor;
		}
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

}
