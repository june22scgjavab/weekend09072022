 public class Derived1 extends Base1 {
    private int num2;
   /* In the following method in setDerived method we are trying to access the private '
     member of the base class and trying to set the value as 10 */
    public void setDerived(){
        //num=10; private members of the base class is not accessible by the derived class
        num2=20;
    }          
   
   public void dispDerived(){
     disp();  // So this line will show error because disp() is the
     // private member of the base class
     dispBase(); // Yes we can access dispBase as it is a public
     // member of the base class. We dont require object of the
     // base class to access it from the derived class.
    //System.out.println(num);
    System.out.println(num2);
   }
 }