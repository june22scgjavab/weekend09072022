public class Customer18 {
     private int id;
     private String name;
     private String address;
//  id1, name1 and address1 are parameters and local variables to the setData method.
// We cannot access them in any other method of Customer11
   public void setData(int id1, String name1, String address1){
     id=id1;
     name=name1;
     address=address1;
   }

   public void dispData(){
    System.out.println(id);
    System.out.println(name);
    System.out.println(address);
   }
}
