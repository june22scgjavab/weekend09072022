class Customer8 {
     int id;
     String name;
     String address;

  // setData and dispData are two member methods
  // setData is to store the data
  // dispData is to display data
   void setData(){
     id=1;
     name="Akash";
     address="A/122 Alam Nagar Lucknow";
    
   }

   void dispData(){
    System.out.println(id);
    System.out.println(name);
    System.out.println(address);
   }

  public static void main(String args[]) {
     Customer8 customer=new Customer8();
    // In this approach we are not directly accessing the member variables
    // though we have a liberty of doing so.
    // The below code will also work. 
       customer.id=0;
       System.out.println(customer.id); //0
       customer.setData();
       customer.dispData();
    }
 }