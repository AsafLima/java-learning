
public class Carro {

	private int ano;
	private String modelo;
	private double preco;
	private static int total;

	public Carro(int ano, String modelo, double preco) {
		if (ano >= 1891) {
			this.ano = ano;
		} else {
			System.out.println("Ano inválido. Usaremos 2017!");
			this.ano = 2017;
		}
		if (modelo != null) {
			this.setModelo(modelo);
		} else {
			System.out.println("Modelo não informado, usaremos Gol!");
			this.modelo = "Gol";
		}
		if (preco > 0) {
			this.setPreco(preco);
		} else {
			System.out.println("Preço inválido. Usaremos 40000");
			this.preco = 40000;
		}
		total++;
		System.out.println("Criando carro " + modelo);
	}

	public Carro(String modelo, double preco) {
		this(2017, modelo, preco);
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public static int getTotal() {
		return total;
	}

}
