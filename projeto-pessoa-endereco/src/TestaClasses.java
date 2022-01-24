
public class TestaClasses {
	public static void main(String[] args) {
		
		Pessoa asaf = new Pessoa();
		asaf.nome = "Asaf Lima";
		asaf.cpf = "222.222.222-22";
		asaf.idade = 18;
		asaf.endereco.estado = "Amazonas";
		asaf.endereco.cidade = "Serra da Saudade";
		asaf.endereco.pais = "Noruega";
		asaf.endereco.cep = "04872-842";
		
		System.out.println(asaf.nome);
		System.out.println(asaf.endereco.cidade);
		
	}
}
