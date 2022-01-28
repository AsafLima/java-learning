public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public Conta() {

	}

	public Conta(int agencia, int numero) {
		if (agencia < 1) {
			throw new IllegalArgumentException("Agencia inválida");
		}
		if (numero < 1) {
			throw new IllegalArgumentException("Numero da conta inválido");
		}
		this.agencia = agencia;
		this.numero = numero;
		total++;
		// System.out.println("Criando conta " + numero);
		// System.out.println("Total de contas: " + total);
	}

	public abstract void deposita(double valor);

	public void saca(double valor) throws SacaException {
		if (this.saldo < valor || valor <= 0) {
			throw new SacaException("Saldo: " + this.saldo + ", valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SacaException {
		this.saca(valor);
		destino.deposita(valor);
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
		return Conta.total;
	}
}