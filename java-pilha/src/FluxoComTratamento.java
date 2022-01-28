
public class FluxoComTratamento {

	public static void main(String[] args) {
		// no main nao precise do <throws "excecao">
		// -> porque tem o tratamento (try catch)
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (Exception ex) { // captura qualquer excecao
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcecao {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaExcecao {
		System.out.println("Ini do metodo2");

//		Conta c = new Conta();   -> Não compila
//		throw c;                 -> throw só para exeções

//		ArithmeticException ex = new ArithmeticException("Deu errado");
//		throw ex;

		// MODO MAIS ENXUTO
		throw new MinhaExcecao("Deu merda");

		// System.out.println("Fim do metodo2"); -> nao compila por causa
		// da excessão...
	}
}
