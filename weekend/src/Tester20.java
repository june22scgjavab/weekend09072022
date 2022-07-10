public class Tester20 {

	public static void main(String args[]) {
		Customer20 customer = new Customer20();
		/*
		 * customer.customerId = "C101"; customer.customerName = "Jack";
		 * customer.contactNumber = 9870345687L; customer.address =
		 * "D089, St. Louis Street, Springfield";
		 * 
		 * System.out.println("Displaying customer details");
		 * System.out.println("Customer Id : " + customer.customerId);
		 * System.out.println("Customer Name : " + customer.customerName);
		 * System.out.println("Contact Number : " + customer.contactNumber);
		 * System.out.println("Address : " + customer.address);
		 */
		customer.setCustomerId("E0001");
		customer.setCustomerName("Tom");
		customer.setContactNumber(1234567890);
		customer.setAddress("Hyderabad");
		System.out.println(customer.getCustomerId());
		System.out.println(customer.getCustomerName());
		System.out.println(customer.getContactNumber());
		System.out.println(customer.getAddress());
		
	}
}