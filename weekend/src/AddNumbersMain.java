 import java.util.Scanner;

public class AddNumbersMain{
      public static void main(String args[]) {
      AddNumbers an=new AddNumbers();
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the number till which we have to add");	
      int num=scan.nextInt();
      int res=an.addValues(num);
      System.out.println("The sum as: "+res);
     }
   }