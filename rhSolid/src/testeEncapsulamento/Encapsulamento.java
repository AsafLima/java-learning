package testeEncapsulamento;

public class Encapsulamento {
	// double apenas para fins didaticos
	private double salario;
	
	public Encapsulamento(double salario) {
		System.out.println("Validando sal�rio...");
		this.salario = salario;
	}

	public void reajustarSalario(double aumento){
		double percentualReajuste = (aumento/salario)*100;
	    if(percentualReajuste > 40) {
			throw new IllegalArgumentException("Percentual de reajuste deve ser inferior a 40%");
		}
		this.salario += aumento;
	}
	
	public double getSalario() {
		return salario;
	}
}
