
public class TesteSaca {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(123, 321);

		cc.deposita(200.0);

		try {
			cc.saca(210.0);
		} catch (SacaException ex) {
			System.out.println("Ex: " + ex.getMessage());
		}

		System.out.println(cc.getSaldo());

	}

}
