
public class TestaConexao {

	public static void main(String[] args) {

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
			conexao.fecha();
		}

	}

}
