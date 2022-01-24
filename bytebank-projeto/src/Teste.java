
public class Teste {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1377, 244624);
		Conta conta2 = new Conta(6264, 782212);
		Conta conta3 = new Conta(7141, 902214);
		System.out.println();
		
		conta.setCliente(new Cliente("João Pedro", "222.222.222-22", "Policial"));
		conta2.setCliente(new Cliente("Ana Clara", "333.333.333-33", "Arquiteta"));
		conta3.setCliente(new Cliente("Rodrigo Alvez", "555.555.555-55", "Programador"));
		
		System.out.println(conta.getCliente().getNome());
		System.out.println(conta2.getCliente().getNome());
		System.out.println(conta3.getCliente().getNome());
		System.out.println();
		
		conta.depositar(1000);
		conta2.depositar(3000);
		conta3.depositar(2500);
		conta.sacar(400);
		conta2.traferir(1000, conta3);
		conta3.sacar(200);
		conta3.traferir(150, conta);
	
		System.out.println(conta.getSaldo());
		System.out.println(conta2.getSaldo());
		System.out.println(conta3.getSaldo());
		System.out.println();
		
		System.out.println(Conta.getTotal());
		
	}
}
