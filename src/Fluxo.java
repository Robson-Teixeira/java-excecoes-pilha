
public class Fluxo {

	public static void main(String[] args) {

		System.out.println("Início de main");

		metodo1();

		System.out.println("Fim de main");

	}

	private static void metodo1() {

		System.out.println("Início de metodo1");

		try {
			metodo2();
		} 
		catch (ArithmeticException ex) {
			System.out.println("Exceção - ArithmeticException: " + ex);
		}

		System.out.println("Fim de metodo1");

	}

	private static void metodo2() {

		System.out.println("Início de metodo2");

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = i / 0; // ArithmeticException: / by zero
		}

		System.out.println("Fim de metodo2");
	}

}
