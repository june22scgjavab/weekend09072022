public class Child6 extends Parent6 {
    private int num2;

    public Child6(int num1,int num2) {
      // super(num1); // we have to explicitly invoke the parent class parameterized constructor  
      // If we are not writing super(num1) explicitly , super() is carried out implicitly
       this.num2=num2;
       System.out.println("I am the parameterized constructor of the Child class");
      }

    public int getNum2(){
     return num2;      
    }
  }

 