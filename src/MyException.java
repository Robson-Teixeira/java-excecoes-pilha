
// Exception é checked, então:
	// 1 - Deve-se tratar a exceção no try/catch 
	// 2 - Incluir throws 'exceção' após assinatura do método que a lança
// Do contrário a compilação não é realizada

// RuntimeException é unchecked, então, não precisa explicitar como o caso acima para uma compilação com sucesso
public class MyException extends Exception {

	public MyException() {
		super();
	}

	public MyException(String s) {
		super(s);
	}

}
