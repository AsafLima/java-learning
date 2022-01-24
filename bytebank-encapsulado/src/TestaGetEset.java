
public class TestaGetEset {
	public static void main(String[] args) {

		Conta conta = new Conta(1337 , 24226);

		System.out.println(conta.getNumero());
		System.out.println();

		Cliente paulo = new Cliente();
		// conta.titular = paulo;
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		System.out.println();
		
		conta.getTitular().setProfissao("Programador");
		System.out.println(conta.getTitular().getProfissao());
		System.out.println();
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setCpf("222.222.222-22");
		System.out.println(titularDaConta.getCpf());

	}
}
