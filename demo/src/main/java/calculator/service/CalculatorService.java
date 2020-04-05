package calculator.service;

import org.springframework.stereotype.Service;

import calculator.model.CalculatorModel;

@Service
public class CalculatorService {

	public double add(CalculatorModel m) {
		return m.getA() + m.getB();
	}

	public double subtract(CalculatorModel m) {
		return m.getA() - m.getB();
	}

	public double multiply(CalculatorModel m) {
		return m.getA() * m.getB();
	}

	public double divide(CalculatorModel m) {
		if (m.getA() == 0)
			return 0;
		if (m.getB() == 0)
			return Double.POSITIVE_INFINITY;
		return (double) m.getA() / m.getB();
	}

	public CalculatorModel reset(CalculatorModel m) {
		m.setA(0);
		m.setB(0);
		return m;
	}
}
