package mk.ukim.finki.np.av4.mysolution.calculator;

public class UnknownOperatorException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnknownOperatorException(char operator) {
		super(String.format("%c is unknown operation", operator));
	}
}