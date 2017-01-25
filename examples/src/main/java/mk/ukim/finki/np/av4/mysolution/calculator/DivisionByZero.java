package mk.ukim.finki.np.av4.mysolution.calculator;

public class DivisionByZero extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DivisionByZero() {
		super("Division by ZERO not defined");
	}
}