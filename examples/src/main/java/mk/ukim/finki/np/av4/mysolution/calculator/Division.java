package mk.ukim.finki.np.av4.mysolution.calculator;

public class Division implements Operation {
	public double calc(double a, double b) {
		if (b == 0)
			throw new DivisionByZero();
		return a / b;
	}
}