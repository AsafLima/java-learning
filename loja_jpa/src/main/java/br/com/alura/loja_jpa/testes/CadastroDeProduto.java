package br.com.alura.loja_jpa.testes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.loja_jpa.dao.CategoriaDAO;
import br.com.alura.loja_jpa.dao.ProdutoDAO;
import br.com.alura.loja_jpa.modelo.Categoria;
import br.com.alura.loja_jpa.modelo.Produto;
import br.com.alura.loja_jpa.util.JPAUtil;

public class CadastroDeProduto {

	public static void main(String[] args) {
		cadastrarProduto();
		
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDAO produtoDAO = new ProdutoDAO(em);
		
		Produto p = produtoDAO.buscarPorId(1l);
		System.out.println(p.getPreco());
		
		List<Produto> todos = produtoDAO.buscarPorNomeDaCategoria("CELULARES");
		todos.forEach(p2 -> System.out.println(p.getNome()));
		
		BigDecimal precoDoProduto = produtoDAO.buscarPrecoDoProdutoComNome("Xiaomi Redmi");
		System.out.println("Preço do produto: " + precoDoProduto);
	}

	private static void cadastrarProduto() {
		Categoria celulares = new Categoria("CELULARES");
		Produto celular = new Produto("Xiaomi Redmi", "Muito legal", 
				new BigDecimal("800"), celulares);
		
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDAO produtoDAO = new ProdutoDAO(em);
		CategoriaDAO categoriaDAO = new CategoriaDAO(em);
		
		em.getTransaction().begin();
		
		categoriaDAO.cadastrar(celulares);
		produtoDAO.cadastrar(celular);
		
		em.getTransaction().commit();
		em.close();
	}
	
}

//Testando os estados da entidades...
//
//Categoria celulares = new Categoria("CELULARES");
//EntityManager em = JPAUtil.getEntityManager();
//
//em.getTransaction().begin();
//
//em.persist(celulares);
//celulares.setNome("XTPO");
//em.flush();
//em.clear();
//
//celulares = em.merge(celulares);
//celulares.setNome("1234");
//em.flush();
//
//em.remove(celulares);
//em.flush();
//
//em.getTransaction().commit();
//em.close();
