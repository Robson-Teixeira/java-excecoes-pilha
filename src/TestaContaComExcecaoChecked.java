
public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {

		Conta conta = new Conta();

		try {
			conta.deposita();
		} 
		catch (MyException ex) {
			System.out.println("Exceção - " + ex.getClass().getSimpleName() + ": " + ex.getMessage());
			ex.printStackTrace();
		}

	}

}
