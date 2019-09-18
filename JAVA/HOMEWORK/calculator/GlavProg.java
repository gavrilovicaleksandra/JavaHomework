package domaci_1209_kalkulator;

public class GlavProg {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		double result=new Double(calc.add(6).sub(2).mul(3).div(5).value());
		System.out.println(result);

	}

}
