package testes;

import java.math.BigDecimal;
import model.Cargo;
import model.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario asaf = new Funcionario("Asaf", "222.222.222-22", Cargo.GERENTE, new BigDecimal(5000));
		asaf.atualizarSalario(new BigDecimal(70000000.0));
		System.out.println(asaf.getSalario());

	}

}
