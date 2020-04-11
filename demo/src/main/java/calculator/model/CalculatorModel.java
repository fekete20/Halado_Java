package calculator.model;

import java.math.BigDecimal;

public class CalculatorModel {

	private BigDecimal a;
	private BigDecimal b;
	private String op;

	public CalculatorModel() {

	}

	public CalculatorModel(String op) {
		this.op = op;
	}

	public CalculatorModel(BigDecimal a, BigDecimal b) {
		this.a = a;
		this.b = b;
	}

	public BigDecimal getA() {
		return a;
	}

	public void setA(BigDecimal a) {
		this.a = a;
	}

	public BigDecimal getB() {
		return b;
	}

	public void setB(BigDecimal b) {
		this.b = b;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}
}
