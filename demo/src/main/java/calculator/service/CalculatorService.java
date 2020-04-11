package calculator.service;

import org.springframework.stereotype.Service;

import calculator.model.CalculatorModel;
import java.math.BigDecimal;

@Service
public class CalculatorService {

	public BigDecimal add(CalculatorModel calculatorModel) {
		return calculatorModel.getA().add(calculatorModel.getB());
	}

	public BigDecimal subtract(CalculatorModel calculatorModel) {
		return calculatorModel.getA().subtract(calculatorModel.getB());
	}

	public BigDecimal multiply(CalculatorModel calculatorModel) {
		return calculatorModel.getA().multiply(calculatorModel.getB());
	}

	public double divide(CalculatorModel calculatorModel) {
		if (calculatorModel.getA().intValue() == 0)
			return 0;
		if (calculatorModel.getB().intValue() == 0)
			return Double.POSITIVE_INFINITY;
		return calculatorModel.getA().doubleValue() / calculatorModel.getB().doubleValue();
	}

	public CalculatorModel reset(CalculatorModel calculatorModel) {
		calculatorModel.setA(BigDecimal.ZERO);
		calculatorModel.setB(BigDecimal.ZERO);
		return calculatorModel;
	}
}
