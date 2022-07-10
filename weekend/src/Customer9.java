class Customer9 {
     int id;
     String name;
     String address;

  // setData and dispData are two member methods
  // setData is to store the data
  // dispData is to display data
  /* void setData(){
     id=1;
     name="Akash";
     address="A/122 Alam Nagar Lucknow";
    
   } */

   void setData(int id1, String name2, String address2)
  {
     id=id1;
     name=name2;
     address=address2;     
  }

   void dispData(){
    System.out.println(id);
    System.out.println(name);
    System.out.println(address);
   }

  public static void main(String args[]) {
     Customer9 customer1=new Customer9();
     Customer9 customer2=new Customer9(); 
       
      
       customer1.setData(1,"Ram","A/32 Indira Colony Delhi");
       customer1.dispData();
       customer2.setData(2,"Ratan","22/2 Delhi");
       customer2.dispData();
    }
 }

