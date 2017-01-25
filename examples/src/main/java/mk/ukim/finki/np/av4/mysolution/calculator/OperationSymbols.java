package mk.ukim.finki.np.av4.mysolution.calculator;

public enum OperationSymbols {
	PLUS('+'), MINUS('-'), MULTIPLY('*'), DIVISION('/');

	private char value;

	private OperationSymbols(char value) {
		this.value = value;
	}

	public char getValue() {
		return value;
	}
}