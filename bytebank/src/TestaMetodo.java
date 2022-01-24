
public class TestaMetodo {
	public static void main(String[] args) {

		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;

		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		System.out.println();

		boolean conseguiuRetirar = contaDoPaulo.saca(10);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		System.out.println();

		boolean conseguiuRetirar2 = contaDoPaulo.saca(1000);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar2);
		System.out.println();

		//////////////////////////////////////////////////

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		boolean sucessoTransferencia = contaDaMarcela.transfere(500, contaDoPaulo);
		if (sucessoTransferencia) {
			System.out.println("Transferencia com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}

		System.out.println("Marcela: " + contaDaMarcela.saldo);
		System.out.println("Paulo: " + contaDoPaulo.saldo);
		System.out.println();
		
		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println(contaDoPaulo.titular);

	}
}
