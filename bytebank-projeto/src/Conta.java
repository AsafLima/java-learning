
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private static int total;
	private Cliente cliente;

	public Conta(int agencia, int numero) {
		if (agencia > 0) {
			this.agencia = agencia;
		} else {
			System.out.println("Agencia inválida");
			return;
		}
		if (numero > 0) {
			this.numero = numero;
		} else {
			System.out.println("Número inválido");
			return;
		}
		total++;
		System.out.println("Criando conta " + numero);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public static int getTotal() {
		System.out.print("Total de contas criadas: ");
		return total;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		} else {
			System.out.println("Valor inválido");
			return;
		}
	}

	public void sacar(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente");
			return;
		}
	}

	public void traferir(double valor, Conta conta) {
		if(this.saldo >= valor && valor > 0) {
			this.saldo -= valor;
			conta.saldo += valor;
		}else {
			System.out.println("Valor inválido");
			return;
		}
	}

}
