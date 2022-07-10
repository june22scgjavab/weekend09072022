import java.util.Scanner;
public class ContinueWithLoop {
    public static void main(String args[]) {
    int num;
    int count=0;
    Scanner scanner=new Scanner(System.in);
    for(int i=0;i<10;i++) {
    System.out.println("Enter the number");
    num=scanner.nextInt();
    if(num%2==0)
    {
     count++;
    }
    else{
          continue;
        } 
     System.out.println("This is the "+count);
   } // end of for
    System.out.println("Total number of even numbers "+count);
 }   // end of main
}   // end of class
