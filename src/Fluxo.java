
public class Fluxo {

	public static void main(String[] args) {

		System.out.println("Início de main");

		try {
			metodo1();
		} 
		catch (Exception ex) {
			System.out.println("Exceção - " + ex.getClass().getSimpleName() + ": " + ex.getMessage());
			ex.printStackTrace();
		}

		System.out.println("Fim de main");

	}

	private static void metodo1() throws MyException {

		System.out.println("Início de metodo1");

		metodo2();

		System.out.println("Fim de metodo1");

	}

	private static void metodo2() throws MyException {

		System.out.println("Início de metodo2");

		throw new MyException("MyException");

		// System.out.println("Fim de metodo2");
	}

}
