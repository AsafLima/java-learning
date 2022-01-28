// Quando estende de RuntimeException é unchecked
// -> não são verificados pelo compilador
// -> pode dar o "throw <nome da excecao>" dboa

// Quando estende de Exception é checked
// -> tem que usar "throws <nome da excecao>" na declaração do metodo...

// na hora de executar não tem diferença

public class MinhaExcecao extends Exception { // checked

	public MinhaExcecao(String msg) {
		super(msg);
	}

}
