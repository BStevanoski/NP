package mk.ukim.finki.np.av4.mysolution.calculator;

public class Calculator {
	private double result;
	private final OperationFactory operationFactory;

	private final String EQUATION_FORMAT = "result %c %f = %f";
	private final String RESULT_FORMAT = "result = %f";
	private final String UPDATED_FORMAT = "updated result = %f";

	public Calculator() {
		result = 0;
		operationFactory = new OperationFactory();
	}

	public String printResult() {
		return String.format(RESULT_FORMAT, result);
	}

	public double getResult() {
		return result;
	}

	public String execute(char operator, double value) throws UnknownOperatorException {
		Operation operation = operationFactory.makeOperation(operator);
		updateResult(operation, value);
		return createEquationString(operator, value);
	}

	private String createEquationString(char operator, double value) {
		return String.format(EQUATION_FORMAT, operator, value, result);
	}

	private void updateResult(Operation operation, double value) {
		result = operation.calc(result, value);
	}

	@Override
	public String toString() {
		return String.format(UPDATED_FORMAT, result);
	}
}
