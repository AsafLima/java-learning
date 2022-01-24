
public class MultiplosDeTres {
	public static void main(String[] args) {
		
		for(int multiplo=1; multiplo <= 100; multiplo++) {
			if(multiplo % 3 == 0) {
				System.out.println(multiplo + ", ");
			}
		}
		for (int i=3; i < 100; i += 3) {
			System.out.print(i + ", ");
		}
	}
}
