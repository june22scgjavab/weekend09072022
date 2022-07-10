public class EmployeeDepartmentMain7 {
   public static void main(String args[]){
    Employee7 employee=new Employee7();
    Department dept=new Department();
    employee.setEmpId("E0001");
    employee.setEmpName("Gajendra");
    employee.setContactNo(9834533441L);
    employee.setAddress("A/122 Netaji Nagar Delhi");
    dept.setDeptId(1);
    dept.setDeptName("stores");
    dept.setManager(employee);
    System.out.println(dept.getDeptId());
    System.out.println(dept.getDeptName());
    System.out.println(dept.getManager()); // You wont be able to read the employeeDetails Employee1@cac736f
    employee=dept.getManager();
    System.out.println(employee.getEmpId());
    System.out.println(employee.getEmpName());
    System.out.println(employee.getContactNo());
    System.out.println(employee.getAddress());
   }
}  