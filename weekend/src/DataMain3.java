 public class DataMain3 {
  public static void main(String args[]) {
   Data3 data=new Data3(1,"Umesh",true,23.45f);
   System.out.println("Before invoking the setData() method");
   data.displayData();
   System.out.println("Afer setData() method is called");
   data.setData(1,"XYZ",true,12.23f);
   data.displayData();
   data.setData(1, "ABC", true, 12.23f);
   data.displayData();
   data=new Data3(5,"Amandeep",false,34.56f);
   // so the object which is created in line3 is not longer usable in the code
   // as the address of the objected created in line3 is overwritten by the
   // address of the object created in line11
   Data3 data1=new Data3(6,"Nidhi",false,45.5f);
   // If we dont want to replace the address by the newly created object then we 
   // can take other reference variable instead of taking the reference variable
   // which is already holding the address of another object
  }
}