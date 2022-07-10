 public class DataMain2 {
  public static void main(String args[]) {
   Data2 data=new Data2();
   System.out.println("Before invoking the setData() method");
   data.displayData();
   System.out.println("Afer setData() method is called");
   data.setData(1,"XYZ",true,12.23f);
   data.displayData();
  }
}