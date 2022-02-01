
public class TesteEncapsulamento {
	public static void main(String[] args) {
		
		Encapsulamento func = new Encapsulamento(5000.0);
		System.out.println(func.getSalario());
		
		func.reajustarSalario(2500.0);
		System.out.println(func.getSalario());
		
	}
}
