
public class Conexao implements AutoCloseable {

	public Conexao() {
		System.out.println("Abrindo conexao");
		throw new IllegalStateException(); // nem vai chamar o close
											// pq o objeto nem vai construir
	}

	public void leDados() {
		System.out.println("Recebendo dados...");
		throw new IllegalStateException();
	}

	@Override
	public void close() {
		System.out.println("Fechando conexao");
	}

}
