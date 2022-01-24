
public class TesteReferencias {
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Segunda: "+segundaConta.saldo);
		System.out.println("Primeira: "+primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("É a mesma conta brow");
		}
		
		System.out.println(primeiraConta);
		
		primeiraConta.deposita(500);
		System.out.println(primeiraConta.saldo);
		
	}
}
