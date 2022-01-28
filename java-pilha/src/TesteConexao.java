
public class TesteConexao {

	public static void main(String[] args) {
		
		try (Conexao con = new Conexao()) {
			con.leDados();
		} catch (Exception ex) {
			System.out.println("ERRO NA CONEXAO");
		}
		
		//-----------------------------------------
		
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
