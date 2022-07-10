public class Child3 extends Parent3 {
    private int num2;

    public Child3() {
      // super();  // this is called implicitly and meant for invoking the parent class parameterless constructor
       num2=200;
       System.out.println("I am the parameterless constructor of the Child class");
      }

    public int getNum2(){
     return num2;      
    }
  }

 