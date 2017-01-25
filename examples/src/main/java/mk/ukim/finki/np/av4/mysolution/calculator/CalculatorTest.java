package mk.ukim.finki.np.av4.mysolution.calculator;

import java.util.Scanner;


public class CalculatorTest {
    static final char RESULT = 'r';
    static final String SEPARATOR = " || ";
    static final String FINAL_RESULT_FORMAT = "final result = %f";
    static final String YES_NO_MESSAGE = "(Y/N)";

    public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        while (true) {
            Calculator calculator = new Calculator();
            System.out.println(calculator.printResult());
            while (true) {
            	
            	System.out.println(getAllOperationsString());
                String line = scanner.nextLine();
                char choice = getCharLower(line);
                if (choice == RESULT) {
                    System.out.println(String.format(FINAL_RESULT_FORMAT, calculator.getResult()));
                    break;
                }
                String[] parts = line.split("\\s+");
                char operator = parts[0].charAt(0);
                double value = Double.parseDouble(parts[1]);
                try {
                    String result = calculator.execute(operator, value);
                    System.out.println(result);
                    System.out.println(calculator);
                } catch (UnknownOperatorException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println(YES_NO_MESSAGE);
            String line = scanner.nextLine();
            char choice = getCharLower(line);
            if (choice == 'n') {
                break;
            }
        }
    }

    static char getCharLower(String line) {
        if (line.trim().length() > 0) {
            return Character.toLowerCase(line.charAt(0));
        }
        return '?';
    }
    
    static String getAllOperationsString() {
    	StringBuilder stringBuilder = new StringBuilder();
    	stringBuilder.append("Supported operations: ");
    	for(OperationSymbols symbol : OperationSymbols.values()) {
    		stringBuilder.append(symbol.getValue());
    		stringBuilder.append(SEPARATOR);
    	}
    	return stringBuilder.substring(0, stringBuilder.length() - SEPARATOR.length()).toString();
    }
}