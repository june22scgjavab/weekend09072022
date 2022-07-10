import java.util.Scanner; 
public class NumberMain {
   public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    Number number=new Number();
    System.out.println("Enter the number");
    int num=scan.nextInt();
    number.setNumber(num);
   // System.out.println(number.isEvenMethod());
   /* boolean b=number.isEvenMethod();
    if(b) or if(b==true)or if(number.isEvenMethod()==true) or if(number.isEven())*/
    if(number.isEvenMethod()) // if the condition is true if(true) {}
    {
    System.out.println("The number is even");	
    }
    else
    {
    	System.out.println("The number is odd");
    }
  }
}  