
public class TestaValores {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		System.out.println();
		
		Conta conta2 = new Conta(3355, 21365);
		System.out.println();
		
		Conta conta3 = new Conta(3567, 13535);
		System.out.println();
		
		System.out.println("Total de contas: " + Conta.getTotal());
		
		// CONTA ESTA INCONSISTENTE
		// conta.setAgencia(-50);
		// conta.setNumero(-330);
		
		//System.out.println(conta.getAgencia());
		
	}
}
