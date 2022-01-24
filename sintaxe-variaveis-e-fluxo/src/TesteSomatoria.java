
public class TesteSomatoria {
	public static void main(String[] args) {

		int contador = 0;
		int total = 0;
		int valores = 0;

		while (contador <= 10) {
			valores = total;
			total = total + contador;
			System.out.println(contador + " + " + valores + " = " + total);
			contador++;
		}

	}
}
