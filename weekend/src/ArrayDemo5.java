import java.util.Scanner;
class ArrayDemo5 {
  public static void main(String args[]) {
  int numbers[]=new int[5];
  Scanner scan=new Scanner(System.in);
  for(int i=0;i<numbers.length;i++){
     System.out.println("Enter the number");
     numbers[i]=scan.nextInt();
   }
  System.out.println("The values");
  for(int i=0;i<numbers.length;i++){
   System.out.println(numbers[i]);
  } 
  }
}