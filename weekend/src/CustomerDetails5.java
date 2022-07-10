class CustomerDetails5{
// id, name,address,foodOrdered are instance variables, member variables, attributes of Customer //class. To access these attributes we require the objectname.attributename.
    int id;
    String name;
    String address;
    String foodOrdered;
    
   // setData, dispData, main
    void setData(){
     id=1;
     name="Akash";
     address="Delhi";
     foodOrdered="Pizza";
    }

    void dispData(){
     System.out.println(id);
     System.out.println(name);
     System.out.println(address);
     System.out.println(foodOrdered);
    }    

    public static void main(String args[]) {
     CustomerDetails5 customer=new CustomerDetails5();
     customer.setData();
     customer.dispData();
       
    }
  }
