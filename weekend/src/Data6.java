public class Data6 {
   private int num;
   private String name;
   private boolean b;
   private float f;

  //this is representing the current object
  // writing this.num means num is an instance variable
  // related to the current object.
  public Data6(int num, String name, boolean b, float f){
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


}

 