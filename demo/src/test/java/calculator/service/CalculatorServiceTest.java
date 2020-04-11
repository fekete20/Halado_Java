package calculator.service;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import calculator.model.CalculatorModel;

import java.math.BigDecimal;

class CalculatorServiceTest {

	@Test
	void testAdd() {
		CalculatorModel calculatorModel = mock(CalculatorModel.class);
		CalculatorService calculatorService = new CalculatorService();

		calculatorModel.setA(BigDecimal.valueOf(5.7));
		calculatorModel.setB(BigDecimal.valueOf(6.1));
		when(calculatorModel.getA()).thenReturn(BigDecimal.valueOf(5.7));
		when(calculatorModel.getB()).thenReturn(BigDecimal.valueOf(6.1));
		// System.out.println(calculatorModel.getA() + "\t" + calculatorModel.getB());

		assertEquals(calculatorService.add(calculatorModel).doubleValue(), 11.8);

	}

	@Test
	void testSubtract() {
		CalculatorModel calculatorModel = mock(CalculatorModel.class);
		CalculatorService calculatorService = new CalculatorService();
		calculatorModel.setA(BigDecimal.valueOf(5.7));
		calculatorModel.setB(BigDecimal.valueOf(6.1));
		when(calculatorModel.getA()).thenReturn(BigDecimal.valueOf(5.7));
		when(calculatorModel.getB()).thenReturn(BigDecimal.valueOf(6.1));

		// System.out.println(calculatorModel.getA() + "\t" + calculatorModel.getB());
		// when(calculatorService.subtract(calculatorModel)).thenReturn(0.4);

		assertEquals(calculatorService.subtract(calculatorModel).doubleValue(), -0.4);
	}

	@Test
	void testMultiply() {
		CalculatorModel calculatorModel = mock(CalculatorModel.class);
		CalculatorService calculatorService = new CalculatorService();
		calculatorModel.setA(BigDecimal.valueOf(5.7));
		calculatorModel.setB(BigDecimal.valueOf(6.1));
		when(calculatorModel.getA()).thenReturn(BigDecimal.valueOf(5.7));
		when(calculatorModel.getB()).thenReturn(BigDecimal.valueOf(6.1));

		assertEquals(calculatorService.multiply(calculatorModel).doubleValue(), 34.77);
	}

	@Test
	void testDivide() {
		CalculatorModel calculatorModel = mock(CalculatorModel.class);
		CalculatorService calculatorService = new CalculatorService();

		calculatorModel.setA(BigDecimal.valueOf(5.7));
		calculatorModel.setB(BigDecimal.valueOf(6.1));
		when(calculatorModel.getA()).thenReturn(BigDecimal.valueOf(5.7));
		when(calculatorModel.getB()).thenReturn(BigDecimal.valueOf(6.1));

		assertEquals(calculatorService.divide(calculatorModel), 0.9344262295081968);

		// assertEquals(calculatorService.divide(calculatorModel).doubleValue(),
		// 0.9344262295081967);

		calculatorModel.setB(BigDecimal.ZERO);
		when(calculatorModel.getB()).thenReturn(BigDecimal.ZERO);

		assertEquals(calculatorService.divide(calculatorModel), Double.POSITIVE_INFINITY);

		calculatorModel.setA(BigDecimal.ZERO);
		calculatorModel.setB(BigDecimal.valueOf(6.1));
		when(calculatorModel.getA()).thenReturn(BigDecimal.ZERO);
		when(calculatorModel.getB()).thenReturn(BigDecimal.valueOf(6.1));

		assertEquals(calculatorService.divide(calculatorModel), 0);

	}

}
