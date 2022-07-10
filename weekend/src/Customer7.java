class Customer7 {
     int id;
     String name;
     String address;
  public static void main(String args[]) {
    Customer7 customer1=new Customer7();
    Customer7 customer2=new Customer7();
    int id=3; // local variables(id,name and address) to the main
    // method are local to the main method and they have
    // any relationship with the id,name and address of Customer
    // class 
    String name="Nitin" ;
    String address="Mumbai";
    customer1.id=1;
    customer1.name="Rajesh";
    customer1.address="6/1 Jawahar Road, Kolkata";
    customer2.id=2;
    customer2.name="Sudha";
    customer2.address="A/1 Netaji Nagar, Kolkata";
    customer2.id=2;
    System.out.println(customer1.id);
    System.out.println(customer1.name);
    System.out.println(customer1.address);
    System.out.println(id);
    System.out.println(name);
    System.out.println(address);
    System.out.println(customer1.id);
    System.out.println(customer1.name);
    System.out.println(customer1.address);  
    System.out.println(customer2.id);
    System.out.println(customer2.name);
    System.out.println(customer2.address);  

    }
 }