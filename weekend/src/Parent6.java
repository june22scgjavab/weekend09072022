public class Parent6{
    private int num1;
    
     public Parent6(){
      num1=2000;
      System.out.println("I am the parameterless constructor of the Parent class");
     }

     public Parent6(int num1){
       this.num1=num1;
       System.out.println("I am the parameterized constructor of parent");
   }
    public int getNum1(){
     return num1;
    }
 }

  