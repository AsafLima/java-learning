package br.com.alura.jdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();
		
		Statement stm = connection.createStatement();
		stm.execute("INSERT INTO PRODUTO (nome,descricao) VALUES ('MOUSE', 'MOUSE SEM FIO')",
				Statement.RETURN_GENERATED_KEYS);
		
		ResultSet rst = stm.getGeneratedKeys();
		while(rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("O id criado foi: " + id);
		}
		
		connection.close();
	}
	
}

// O '1' colocado dentro do rst.getInt() se refere a
// primeira coluna da tabela, que é o id
// A cada vez que rodar essa classe, ele coloca um novo produto
// repetido porém com um novo id