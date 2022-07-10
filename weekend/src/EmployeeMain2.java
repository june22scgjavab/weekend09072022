public class EmployeeMain2 {
	public static void main(String[] args) {
		Employee2 employee1=new Employee2();
                Employee2 employee2=new Employee2();
		employee1.setId(1);
		employee1.setName("Raghav");
		employee1.setDesignation("Manager");
		employee1.setDepartment("Sales");
		employee1.setBasic(23000);
                employee2.setId(2);
                employee2.setName("Akash");
                employee2.setDesignation("AsstManager");
                employee2.setDepartment("Sales");
                employee2.setBasic(20000);
		//System.out.println(employee1.getId());
		int id=employee1.getId();
		System.out.println(id);
		//System.out.println(employee1.getName());
		String name=employee1.getName();
		System.out.println(name);
		System.out.println(employee1.getDesignation());
		System.out.println(employee1.getDepartment());
		System.out.println(employee1.getBasic());
               employee2.setBasic(20000);
		System.out.println(employee2.getId());
		System.out.println(employee2.getName());
		System.out.println(employee2.getDesignation());
		System.out.println(employee2.getDepartment());
		System.out.println(employee2.getBasic());

	}

}