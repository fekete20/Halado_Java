package console;

import java.math.BigDecimal;
import java.util.Scanner;

import calculator.model.CalculatorModel;
import calculator.service.CalculatorService;

public class ConsoleApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculatorService g = new CalculatorService();
		CalculatorModel m = new CalculatorModel();
		double eredmeny = 0;

		System.out.println("Adja meg az elvégzendő műveletet műveleti jellel!");

		m.setOp(sc.next());
		m.setA(sc.nextBigDecimal());

		m.setB(sc.nextBigDecimal());
		sc.close();

		System.out.println(m.getOp() + " " + m.getA() + " " + m.getB());

		switch (m.getOp()) {
		case "+":
			eredmeny = g.add(m).doubleValue();
			break;
		case "-":
			eredmeny = g.subtract(m).doubleValue();
			break;
		case "*":
			eredmeny = g.multiply(m).doubleValue();
			break;
		case "/":

			eredmeny = g.divide(m);
			break;
		default:
			System.out.println("elegem van");

		}

		System.out.println("Eredmény: " + eredmeny);

	}

}
