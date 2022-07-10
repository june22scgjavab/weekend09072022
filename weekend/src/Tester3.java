class Tester3 {

	public static void main(String args[]) {

		Employee3 employee = new Employee3();
		employee.employeeId = "C101";
		employee.employeeName = "Steve";
		employee.salary = 650;
		employee.jobLevel = 4;

		employee.calculateSalary();

		System.out.println("Employee Details");
		System.out.println("Employee Id: " + employee.employeeId);
		System.out.println("Employee Name: " + employee.employeeName);
		System.out.println("Salary: " + employee.salary);

	}
}