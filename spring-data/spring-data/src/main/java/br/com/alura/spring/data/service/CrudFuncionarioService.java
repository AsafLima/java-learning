package br.com.alura.spring.data.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.alura.spring.data.orm.Cargo;
import br.com.alura.spring.data.orm.Funcionario;
import br.com.alura.spring.data.orm.UnidadeTrabalho;
import br.com.alura.spring.data.repository.CargoRepository;
import br.com.alura.spring.data.repository.FuncionarioRepository;
import br.com.alura.spring.data.repository.UnidadeTrabalhoRepository;

@Service
public class CrudFuncionarioService {

	private Boolean system = true;
	protected final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	protected final FuncionarioRepository funcionarioRepository;
	protected final CargoRepository cargoRepository;
	private final UnidadeTrabalhoRepository unidadeTrabalhoRepository;
	
	public CrudFuncionarioService(FuncionarioRepository funcionarioRepository, CargoRepository cargoRepository, UnidadeTrabalhoRepository unidadeTrabalhoRepository) {
		this.funcionarioRepository = funcionarioRepository;
		this.cargoRepository = cargoRepository;
		this.unidadeTrabalhoRepository = unidadeTrabalhoRepository;
	}
	
	public void inicial(Scanner scanner) {
		while(system) {
			System.out.println("Qual ação de funcionario deseja executar");
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
	
	private void salvar(Scanner scanner) {
		System.out.println("Nome: ");
		String nome = scanner.next();
		System.out.println("Cpf: ");
		String cpf = scanner.next();
		System.out.println("Salario: ");
		BigDecimal salario = scanner.nextBigDecimal();
		System.out.println("Digite a data de contratação: ");
		String dataContratacao = scanner.next();
		System.out.println("Digite o cargoId: ");
		Integer cargoId = scanner.nextInt();
		
		List<UnidadeTrabalho> unidades = unidade(scanner);
		
		Funcionario func = new Funcionario(nome, cpf, salario);
		func.setDataContratacao(LocalDate.parse(dataContratacao, formatter));
		Optional<Cargo> cargo = cargoRepository.findById(cargoId);
		func.setCargo(cargo.get());
		func.setUnidadeTrabalho(unidades);
		
		funcionarioRepository.save(func);
		System.out.println("Salvo");
	}
	
	private void atualizar(Scanner scanner) {
		AtualizarFuncionarioService atualizar = 
				new AtualizarFuncionarioService(funcionarioRepository, 
						cargoRepository, unidadeTrabalhoRepository);
		atualizar.atualizar(scanner);
	}
	
	protected List<UnidadeTrabalho> unidade(Scanner scanner){
		Boolean isTrue = true;
		List<UnidadeTrabalho> unidades = new ArrayList<>();
		while(isTrue) {
			System.out.println("Digite o unidadeId (Para sair digite 0)");
			Integer unidadeId = scanner.nextInt();
			
			if(unidadeId != 0) {
				Optional<UnidadeTrabalho> unidade = unidadeTrabalhoRepository.findById(unidadeId);
				unidades.add(unidade.get());
			} else {
				isTrue = false;
			}
		}
		return unidades;
	}

	private void visualizar() {
		Iterable<Funcionario> funcionarios = funcionarioRepository.findAll();
		funcionarios.forEach(func -> System.out.println(func));
	}
	
	private void deletar(Scanner scanner) {
		System.out.println("Id: ");
		Integer id = scanner.nextInt();
		
		funcionarioRepository.deleteById(id);
		System.out.println("Deletado");
	}
	
}
