import java.util.Scanner;
class ArrayDemo6 {
  public static void main(String args[]) {
  String names[]=new String[5];
  Scanner scan=new Scanner(System.in);
  for(int i=0;i<names.length;i++){
     System.out.println("Enter the name");
     names[i]=scan.next();
   }
  System.out.println("The values");
   for(int i=0;i<names.length;i++){
     System.out.println(names[i]);
    } 
  }
}