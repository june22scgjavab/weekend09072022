public class Data5 {
   private int num;
   private String name;
   private boolean b;
   private float f;

  //The assignment to variable num has no effect
  public Data5(int num, String name, boolean b, float f){
    num=num;
    name=name;
    b=b;
    f=f;
  }

  public void displayData(){
   System.out.println(num);
   System.out.println(name);
   System.out.println(b);
   System.out.println(f);
  }


}

 