import java.util.Scanner;  
public class UserInputDemo2 {
   public static void main(String args[]) {
    Scanner scanner=new Scanner(System.in); 
    String name;
    System.out.println("Enter the name");
    name=scanner.nextLine();
    // nextLine can accept a string with spaces in between which cannot 
    // be done with next() method
    System.out.println("The value of name is: "+name);
   
   }
 }