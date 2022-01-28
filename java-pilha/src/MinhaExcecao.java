// Quando estende de RuntimeException � unchecked
// -> n�o s�o verificados pelo compilador
// -> pode dar o "throw <nome da excecao>" dboa

// Quando estende de Exception � checked
// -> tem que usar "throws <nome da excecao>" na declara��o do metodo...

// na hora de executar n�o tem diferen�a

public class MinhaExcecao extends Exception { // checked

	public MinhaExcecao(String msg) {
		super(msg);
	}

}
