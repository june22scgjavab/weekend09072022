import java.util.Scanner;

public class EmployeeMain6 {
   public static void main(String args[]) {
   Employee6 employees[]=new Employee6[2];  // We have created two reference variables to store two objects
   Scanner scan=new Scanner(System.in);
   String cityNames[]=new String[2];
   // of employee class 
   // int num[]=new int[2];
   // String str[]=new String[2];
   for(int i=0;i<employees.length;i++)
   {
	   employees[i]=new Employee6();
	   System.out.println("Enter the id for the employee");
	   //int id=scan.nextInt();
	   // employees[i].setId(id);
	   employees[i].setId(scan.nextInt());
	  
	   System.out.println("Enter the name");
	   employees[i].setName(scan.next());
	   for(int j=0;j<cityNames.length;j++)
	   {
		   System.out.println("Enter the city name");
		   cityNames[j]=scan.next();
	   }
       employees[i].setCityNames(cityNames);
   
   }
   for(Employee6 emp : employees)
   {
	   System.out.println(emp.getId());
	   System.out.println(emp.getName());
	   //System.out.println(emp.getCityNames());
       cityNames=emp.getCityNames();
       for(String cityName : cityNames)
       {
    	   System.out.println(cityName);
       }
   }
   
   
   
  
  }
}