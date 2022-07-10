class Employee3 {

	String employeeId;
	String employeeName;
	int salary;
	int bonus;
	int jobLevel;

	public void calculateSalary() {
		if (this.jobLevel >= 4) {
			this.bonus = 100;
		} else {
			this.bonus = 50;
		}
		this.salary += this.bonus;
	}
}