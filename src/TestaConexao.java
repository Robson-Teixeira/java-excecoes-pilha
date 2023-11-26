
public class TestaConexao {

	public static void main(String[] args) {

		/* Método convencional

		Conexao conexao = null;

		try {
			conexao = new Conexao();
			conexao.leDados();
		} 
		catch (IllegalStateException ex) {
			System.out.println("Exceção - " + 
					ex.getClass().getSimpleName() + ": " + ex.getMessage());
			ex.printStackTrace();
		} 
		finally {
			conexao.close();
		}
		
		*/
		
		// Implementação válida a partir do Java 1.7
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		}
		catch (IllegalStateException ex) {
			System.out.println("Exceção - " + 
					ex.getClass().getSimpleName() + ": " + ex.getMessage());
			ex.printStackTrace();
		}

	}

}
