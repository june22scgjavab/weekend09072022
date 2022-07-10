public class DataMain {
  public static void main(String args[]) {
   Data data=new Data();
   System.out.println("Before invoking the setData() method");
   data.displayData(); //0 null false 0.0
   System.out.println("Afer setData() method is called");
   data.setData(1,"XYZ",true,12.23f);
   data.displayData();
  }
}