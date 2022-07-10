class CustomerDetails4{
// id, name,address,foodOrdered are instance variables, member variables, attributes of Customer //class. To access these attributes we require the objectname.attributename.
    int id;
    String name;
    String address;
    String foodOrdered;

    public static void main(String args[]) {
     CustomerDetails4 customer=new CustomerDetails4();
     CustomerDetails4 customer2=new CustomerDetails4();
     customer.id=1;
     customer.name="Ravi";
     customer.address="A/15 Netaji Nagar, Kolkata";
     customer.foodOrdered="sweets";
     customer2.id=2;
     customer2.name="Suresh";
     customer2.address="54/1 Marine Drive,Mumbai";
     customer2.foodOrdered="Pizza";
     System.out.println(customer.id);
     System.out.println(customer.name);
     System.out.println(customer.address);
     System.out.println(customer.foodOrdered);
     System.out.println(customer2.id);
     System.out.println(customer2.name);
     System.out.println(customer2.address);
     System.out.println(customer2.foodOrdered);
     
    }
  }