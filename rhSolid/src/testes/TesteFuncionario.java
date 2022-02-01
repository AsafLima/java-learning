package testes;

import model.Funcionario;
import model.Cargo;
import java.math.BigDecimal;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario asaf = new Funcionario("Asaf", "222.222.222-22", Cargo.GERENTE, new BigDecimal(5000));
		asaf.atualizarSalario(new BigDecimal(3000));
		System.out.println(asaf.getSalario());

	}

}
