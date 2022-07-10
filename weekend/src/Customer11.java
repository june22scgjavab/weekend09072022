class Customer11 {
     private int id;
     private String name;
     private String address;

   private void setData(){
     id=1;
     name="Akash";
     address="A/122 Alam Nagar Lucknow";
   }

   private void dispData(){
    System.out.println(id);
    System.out.println(name);
    System.out.println(address);
   }

  public static void main(String args[]) {
     Customer11 customer=new Customer11();
    // In this approach we are not directly accessing the member variables
    // though we have a liberty of doing so.
    // The below code will also work. 
       customer.id=0;
       System.out.println(customer.id); //0
       customer.setData();
       customer.dispData();
    }
 }