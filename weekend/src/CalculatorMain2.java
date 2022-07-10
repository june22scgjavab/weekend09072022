public class CalculatorMain2 {

	public static void main(String[] args) {
		Calculator2 calc=new Calculator2();
		calc.setData(1, 2);
                // The below result declaration is local to the main method and it is not the same local variable in add method of the Calculator2 class.
		int result=calc.add();
                System.out.println(result);
                System.out.println(calc.add());
	}

}