
  public class Data2 {
   private int num;
   private String name;
   private boolean b;
   private float f;

  // The following is a parameterless constructor
 // 
  public Data2(){
    num=100;
    name="Tom";
    b=true;
    f=100.50f;
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