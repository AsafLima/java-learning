
public class TesteConexao {

	public static void main(String[] args) {
		
		try (Conexao con = new Conexao()) {
			con.leDados();
		} catch (Exception ex) {
			ex.printStackTrace();
		} // N APARECE O "FECHANDO CONEXAO" PQ DA ERRO NO CONSTRUTOR DO OBJETO
		  // SENDO ASSIM O OBJETO NÃO EXISTE PARA CHAMAR O METODO CLOSE
		
		
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException ex) {
//			System.out.println("Erro na conexão");
//		} finally {
//			if (con != null) {
//				con.close();	
//			}
//		}
		
	}

}
