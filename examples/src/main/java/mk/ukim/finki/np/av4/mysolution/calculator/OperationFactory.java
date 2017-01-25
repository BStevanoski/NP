package mk.ukim.finki.np.av4.mysolution.calculator;

public class OperationFactory {
	public Operation makeOperation(char operator) throws UnknownOperatorException {
		if (operator == OperationSymbols.PLUS.getValue()) {
			return new Addition();
		} else if (operator == OperationSymbols.MINUS.getValue()) {
			return new Substraction();
		} else if (operator == OperationSymbols.MULTIPLY.getValue()) {
			return new Multiplication();
		} else if (operator == OperationSymbols.DIVISION.getValue()) {
			return new Division();
		} else {
			throw new UnknownOperatorException(operator);
		}
	}
}