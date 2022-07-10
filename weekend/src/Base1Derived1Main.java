
  public class Base1Derived1Main{
  
  public static void main(String args[])
  {
       Base1 base=new Base1();
       base.setBase(10);
       base.dispBase();    //10
       base.disp();
       Derived1 derived=new Derived1();
       derived.setBase(100);
       derived.dispBase();    //100
       derived.setDerived();
       derived.dispDerived();
       derived.disp();
  }
 }