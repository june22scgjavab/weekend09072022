import java.util.Scanner;  

public class UserInputDemo1 {
   public static void main(String args[]) {
    Scanner scanner=new Scanner(System.in); //Scanner is a predefined class
    // and we are creating an object of scanner class by writing new Scanner(System.in)
    // and that object's reference is stored in the reference variable scanner
   // Scanner scan=new Scanner(System.in); // in is an object of InputStream which is with System class
   // In c programming int *ptr; int num=10; ptr=&num;  
    int num;
    String name;
    float score;
    System.out.println("Enter the number");
    num=scanner.nextInt();
    System.out.println("Enter the name");
    name=scanner.next();  // For String
    System.out.println("Enter the score");
    score=scanner.nextFloat();
    System.out.println("The value of num is: "+num);
    System.out.println("The value of name is: "+name);
    System.out.println("The value of score is: "+score);
   }
 }