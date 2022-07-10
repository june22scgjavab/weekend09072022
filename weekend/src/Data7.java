public class Data7 {
   private int num;
   private String name;
   private boolean b;
   private float f;

  // The following is the parameterless constructor
  public Data7(){
  /* num=1;
   name="INFOSYS";
   b=true;
   f=100.00f; */
   this(1,"INFOSYS",true,100.00f);
  }

  public Data7(int num, String name, boolean b, float f){
    this.num=num;
    this.name=name;
    this.b=b;
    this.f=f;
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

 