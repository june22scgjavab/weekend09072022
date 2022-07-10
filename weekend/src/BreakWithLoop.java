import java.util.Scanner;
public class BreakWithLoop {
    public static void main(String args[]) {
    int num;
    int sum=0;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the number");
    while(true) {
     System.out.println("Enter the number");
     num=scanner.nextInt();
     if(num==0){
      break;
     }
      sum+=num;
    }
    System.out.println(sum);
   }
 }