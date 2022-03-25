package br.com.alura.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		
		PreparedStatement stm = connection
				.prepareStatement("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
		stm.execute();
		ResultSet rst = stm.getResultSet();
		while(rst.next()) {
			Integer id = rst.getInt("ID");
			String nome = rst.getString("NOME");
			String descricao = rst.getString("DESCRICAO");
			System.out.println("Produto " + id + " = " + nome + " | " + descricao);
		}
		
		connection.close();
	}
	
}

//Quando o retorno do statement for uma lista, 
//o .execute() retornará true... ou quando for um ResultSet
//Porém se não for, retornará false

//o .next() retorna true se tiver um próximo item na lista