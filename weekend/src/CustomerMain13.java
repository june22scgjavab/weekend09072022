class CustomerMain13{
  // id and setData and dispDAta
	// are the private members of Customer class
	// that is reason they are not accessible
	// from main method which is in a different class
	// called CustomerMain7
  public static void main(String args[]) {
     Customer13 customer=new Customer13();
   
       customer.id=0;
       System.out.println(customer.id); 
       customer.setData();
       customer.dispData();
    }
 }