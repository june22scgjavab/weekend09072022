 public class Data4 {
   private int num;
   private String name;
   private boolean b;
   private float f;

  // The following is the parameterless constructor
  public Data4(){
   num=1;
   name="INFOSYS";
   b=true;
   f=100.00f;
  }

  // The following is a parameterized constructor
 // Can we have the same name for the parameters as of the instance variables?
 // Yes but we have work more.
  public Data4(int n1, String name1, boolean b1, float f1){
    num=n1;
    name=name1;
    b=b1;
    f=f1;
  }

  public void displayData(){
   System.out.println(num);
   System.out.println(name);
   System.out.println(b);
   System.out.println(f);
  }

  public void setData(int n1, String name1, boolean b1, float f1){
   num=n1; 
   name=name1;
   b=b1;
   f=f1;
 }
}
