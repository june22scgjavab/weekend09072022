public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setId(1);
		employee.setName("Raghav");
		employee.setDesignation("Manager");
		employee.setDepartment("Sales");
		employee.setBasic(23000);
		//System.out.println(employee.getId());
		int id=employee.getId();
		System.out.println(id);
		//System.out.println(employee.getName());
		String name=employee.getName();
		System.out.println(name);
		System.out.println(employee.getDesignation());
		System.out.println(employee.getDepartment());
		System.out.println(employee.getBasic());

	}

}