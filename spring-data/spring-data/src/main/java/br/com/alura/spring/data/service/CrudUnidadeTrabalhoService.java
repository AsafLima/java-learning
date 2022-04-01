package br.com.alura.spring.data.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.alura.spring.data.orm.UnidadeTrabalho;
import br.com.alura.spring.data.repository.UnidadeTrabalhoRepository;

@Service
public class CrudUnidadeTrabalhoService {

	private Boolean system = true;
	private UnidadeTrabalhoRepository repository;
	
	public CrudUnidadeTrabalhoService(UnidadeTrabalhoRepository repository) {
		this.repository = repository;
	}
	
	public void inicial(Scanner scanner) {
		while(system) {
			System.out.println("Qual ação de UnidadeTrabalho deseja executar");
			System.out.println("0 - SAIR");
			System.out.println("1 - SALVAR");
			System.out.println("2 - VISUALIZAR");
			System.out.println("3 - DELETAR");
			System.out.println("4 - ATUALIZAR");
			
			int action = scanner.nextInt();
			switch (action) {
			case 1:
				salvar(scanner);
				break;
			case 2:
				visualizar();
				break;
			case 3:
				deletar(scanner);
				break;
			case 4:
				atualizar(scanner);
				break;
			default:
				system = false;
				break;
			}
		}
	}

	private void atualizar(Scanner scanner) {
		System.out.println("Digite o id: ");
		int id = scanner.nextInt();
		System.out.println("Digite o novo nome");
		String nome = scanner.next();
		System.out.println("Digite o endereço");
		String endereco = scanner.next();

		UnidadeTrabalho unidade = new UnidadeTrabalho(nome, endereco);
		unidade.setId(id);
		
		repository.save(unidade);
		System.out.println("Atualizado");
	}

	private void deletar(Scanner scanner) {
		System.out.println("Insira o id: ");
		int id = scanner.nextInt();
		
		repository.deleteById(id);
		System.out.println("Deletado");
	}

	private void visualizar() {
		Iterable<UnidadeTrabalho> unidades = repository.findAll();
		unidades.forEach(unidade -> System.out.println(unidade));
	}

	private void salvar(Scanner scanner) {
		System.out.println("Nome da unidade: ");
		String descricao = scanner.next();
		System.out.println("Endereço: ");
		String endereco = scanner.next();
		
		UnidadeTrabalho unidadeTrabalho = new UnidadeTrabalho(descricao, endereco);
		
		repository.save(unidadeTrabalho);
		System.out.println("Salvo");
	}
	
}
