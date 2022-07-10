class Customer6 {
// id,name and address are the instance variables of the Customer class
// or member variables
     int id;
     String name;
     String address;

  
    public static void main(String args[]) {
// To access the member variables of a class, we need to create the object first and then
// we try to access the members with the help of dot(.) operator
    Customer6 customer=new Customer6();
  // new Customer6() is creating a new object and the address of the newly create object is
  // stored in the reference variable customer.
  // Scanner input=new Scanner(System.in);
  // input is a reference variable which is holding/storing the address of the newly created
  // object of Scanner class.(new Scanner(System.in))  
  // If we have Employee class and we need to create the object, what
  // is the syntax of doing that?
  // Employee emp=new Employee();
  // Customer6 customer;  We are declaring a reference variable of Customer type
  // customer=new Customer6(); // We created an object of Customer class and stored the 
  // address of newly created object in the reference variable customer.;
     customer.id=1;
     customer.name="Rajesh";
     customer.address="6/1 Jawahar Road, Kolkata";
     System.out.println(customer.id);
     System.out.println(customer.name);
     System.out.println(customer.address);

    }
 }