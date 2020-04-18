package console;

import java.util.Scanner;

import calculator.model.CalculatorModel;
import calculator.service.CalculatorService;

public class ConsoleApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculatorService calculatorService = new CalculatorService();
		CalculatorModel calculatorModel = new CalculatorModel();
		double result = 0;

		System.out.println("Adja meg az elvégzendő műveletet műveleti jellel kezdve!");

		calculatorModel.setOp(sc.next());
		calculatorModel.setA(sc.nextBigDecimal());
		calculatorModel.setB(sc.nextBigDecimal());
		sc.close();

		System.out.println("A következő művelet lesz elvégezve: " + calculatorModel.getOp() + " "
				+ calculatorModel.getA() + " " + calculatorModel.getB());

		switch (calculatorModel.getOp()) {
		case "+":
			result = calculatorService.add(calculatorModel).doubleValue();
			break;
		case "-":
			result = calculatorService.subtract(calculatorModel).doubleValue();
			break;
		case "*":
			result = calculatorService.multiply(calculatorModel).doubleValue();
			break;
		case "/":

			result = calculatorService.divide(calculatorModel);
			break;
		default:
			System.err.println("Nem definiált művelet.");

		}

		System.out.println("Eredmény: " + result);

	}

}
