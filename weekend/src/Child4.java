public class Child4 extends Parent4 {
    private int num2;

    public Child4(int num1,int num2) {
       super(num1); // we have to explicitly invoke the parent class parameterized constructor  
       this.num2=num2;
       System.out.println("I am the parameterized constructor of the Child class");
      }

    public int getNum2(){
     return num2;      
    }
  }

 