class Customer10 {
     public int id;
     public String name;
     public String address;

   public void setData(){
     id=1;
     name="Akash";
     address="A/122 Alam Nagar Lucknow";
   }

   public void dispData(){
    System.out.println(id);
    System.out.println(name);
    System.out.println(address);
   }

  public static void main(String args[]) {
     Customer10 customer=new Customer10();
    // In this approach we are not directly accessing the member variables
    // though we have a liberty of doing so.
    // The below code will also work. 
       customer.id=0;
       System.out.println(customer.id); //0
       customer.setData();
       customer.dispData();
    }
 }