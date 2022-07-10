 public Base5(int i){
    System.out.println("I am the parameter constructor of the base");
  }
 
  }
  public class Derived5 extends Base5 {
     public Derived5(int a,int b){
     super(a);
     System.out.println("I am the parameterized constructor of the subclass");
    } 
 }
 
  