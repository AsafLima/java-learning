public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
		if (agencia <= 0) {
			this.setAgencia(agencia);
			return;
		}
		if (numero <= 0) {
			this.setNumero(numero);
			return;
		}
		total++;
		System.out.println("Criando conta " + numero);
		//System.out.println("Total de contas: " + total);
	}

	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor && valor > 0) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Saldo insuficiente");
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor && valor > 0) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Vai dar merda");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Vai dar merda");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() {
		return total;
	}
}