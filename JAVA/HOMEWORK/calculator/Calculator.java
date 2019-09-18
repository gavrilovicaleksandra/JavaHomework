package domaci_1209_kalkulator;

public class Calculator {

	private double value, add, sub, div, mul;

	public Calculator() {

	}

	public Calculator add(double x) {
		value = value + x;
		return this;

	}

	public Calculator sub(double x) {
		value = value - x;
		return this;
	}

	public Calculator div(double x) {
		value = value / x;
		return this;

	}

	public Calculator mul(double x) {
		value = value * x;
		return this;

	}

	public double value() {
		return value;

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("add").append(add).append("sub").append(sub).append("mul").append(mul).append("div").append(div)
				.append("value").append(value);
		return sb.toString();
	}

}
