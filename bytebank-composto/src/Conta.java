public class Conta {
	private double saldo;
	public int agencia;
	public int numero;
	public Cliente titular;

	public void deposita(double valor) {
		System.out.println("Depositando " + valor + " reais");
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			System.out.println("Sacando " + valor + " reais");
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Saldo insuficiente");
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

}