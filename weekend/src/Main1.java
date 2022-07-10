import java.util.Scanner;

class Main1{
   public static void main(String args[]) {
    int num[]=new int[10];
    int sum=0;
    Scanner scan=new Scanner(System.in);
    for(int i=0;i<num.length;i++){
     System.out.println("Enter the number");
     num[i]=scan.nextInt();
     sum+=num[i];
    }
    System.out.println(sum);
  }
}