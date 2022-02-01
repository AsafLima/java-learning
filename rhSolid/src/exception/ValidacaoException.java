package exception;

public class ValidacaoException extends RuntimeException{ //unchecked, estende RuntimeException
	
	private static final long serialVersionUID = 1L;
	
	public ValidacaoException(String msg) {
		super(msg);
	}
	
}
