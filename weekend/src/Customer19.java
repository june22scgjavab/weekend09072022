class Customer19 {
	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;
	public Customer19() {
		System.out.println("Parameterless constructor called");
	}
	public Customer19(String cId, String cName, long contact, String add) {
		System.out.println("Parameterized constructor called");
		customerId = cId;
		customerName = cName;
		contactNumber = contact;
		address = add;
	}
}
