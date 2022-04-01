package br.com.alura.spring.data.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import br.com.alura.spring.data.orm.Cargo;
import br.com.alura.spring.data.orm.Funcionario;
import br.com.alura.spring.data.orm.UnidadeTrabalho;
import br.com.alura.spring.data.repository.CargoRepository;
import br.com.alura.spring.data.repository.FuncionarioRepository;
import br.com.alura.spring.data.repository.UnidadeTrabalhoRepository;

public class AtualizarFuncionarioService extends CrudFuncionarioService{

	public AtualizarFuncionarioService(FuncionarioRepository repository, CargoRepository cargoRepository, UnidadeTrabalhoRepository unidadeTrabalhoRepository) {
		super(repository, cargoRepository, unidadeTrabalhoRepository);
	}

	public void atualizar(Scanner scanner) {
		Boolean isTrue = true;

		System.out.println("Digite o id: ");
		Integer id = scanner.nextInt();
		
		Funcionario funcionario = (funcionarioRepository.findById(id).get());
		
		List<String> atualizado = new ArrayList<>();
		
		while(isTrue) {
			System.out.println("Qual campo deseja alterar?");
			System.out.println("0 - CANCELAR OU FINALIZAR");
			System.out.println("1 - NOME");
			System.out.println("2 - CPF");
			System.out.println("3 - SALARIO");
			System.out.println("4 - DATA DE CONTRATACAO");
			System.out.println("5 - CARGO");
			System.out.println("6 - UNIDADE");
			
			int action = scanner.nextInt();
			switch (action) {
			case 1:
				atualizarNome(scanner, funcionario);
				atualizado.add("Nome");
				break;
			case 2:
				atualizarCpf(scanner, funcionario);
				atualizado.add("Cpf");
				break;
			case 3:
				atualizarSalario(scanner, funcionario);
				atualizado.add("Salario");
				break;
			case 4:
				atualizarDataContratacao(scanner, funcionario);
				atualizado.add("DataContratacao");
				break;
			case 5:
				atualizarCargo(scanner, funcionario);
				atualizado.add("Cargo");
				break;
			case 6:
				atualizarUnidade(scanner, funcionario);
				atualizado.add("UnidadeTrabalho");
				break;
			default:
				isTrue = false;
				break;
			}
		}
		
		funcionarioRepository.save(funcionario);
		System.out.println(atualizado + " ATUALIZADOS");
	}

	private void atualizarSalario(Scanner scanner, Funcionario funcionario) {
		System.out.println("Salario: ");
		BigDecimal salario = scanner.nextBigDecimal();
		
		funcionario.setSalario(salario);
	}

	private void atualizarNome(Scanner scanner, Funcionario funcionario) {
		System.out.println("Novo nome: ");
		String nome = scanner.next();
		
		funcionario.setNome(nome);
	}

	private void atualizarCpf(Scanner scanner, Funcionario funcionario) {
		System.out.println("Cpf: ");
		String cpf = scanner.next();
		
		funcionario.setCpf(cpf);
	}

	private void atualizarDataContratacao(Scanner scanner, Funcionario funcionario) {
		System.out.println("Digite a data de contratação: ");
		String dataContratacao = scanner.next();

		funcionario.setDataContratacao(LocalDate.parse(dataContratacao, formatter));
	}

	private void atualizarCargo(Scanner scanner, Funcionario funcionario) {
		System.out.println("Digite o novo cargoId");
		Integer id = scanner.nextInt();

		Optional<Cargo> cargo = cargoRepository.findById(id);
		funcionario.setCargo(cargo.get());
	}

	private void atualizarUnidade(Scanner scanner, Funcionario funcionario) {
		List<UnidadeTrabalho> unidades = unidade(scanner);
		funcionario.setUnidadeTrabalho(unidades);
	}
	
}