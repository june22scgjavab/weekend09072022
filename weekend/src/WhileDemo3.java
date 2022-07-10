import java.util.Scanner;  
public class WhileDemo3 {
   public static void main(String args[]) {
    Scanner scanner=new Scanner(System.in); 
    int num=1,sum=0;
    while(num>0)
      {    
    System.out.println("Enter the number");
    num=scanner.nextInt();
    //sum=sum+num;
      sum+=num;
     }
    System.out.println(sum);
  }
}