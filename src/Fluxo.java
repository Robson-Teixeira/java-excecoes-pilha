
public class Fluxo {

	public static void main(String[] args) {

		System.out.println("Início de main");

		try {
			metodo1();
		} 
		catch (ArithmeticException | NullPointerException ex) {
			System.out.println("Exceção - " + 
					ex.getClass().getSimpleName() + ": " + 
					ex.getMessage());
			ex.printStackTrace();
		}

		System.out.println("Fim de main");

	}

	private static void metodo1() {

		System.out.println("Início de metodo1");

		metodo2();

		System.out.println("Fim de metodo1");

	}

	private static void metodo2() {

		System.out.println("Início de metodo2");

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			// int a = i / 0; // ArithmeticException: / by zero
			Conta conta = null;
			conta.deposita(); // NullPointerException: Cannot invoke "Conta.deposita()" because "conta" is null
		}

		System.out.println("Fim de metodo2");
	}

}
