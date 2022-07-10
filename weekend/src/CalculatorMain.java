public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.setData(1, 2);
		// result is a local variable to main method
		// and it is not same as that in the result
		// class, there it is one of the instance
		// variable
		int result=calc.add();
        System.out.println(result);
        System.out.println(calc.add());
	}

}