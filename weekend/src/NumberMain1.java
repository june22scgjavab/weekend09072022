import java.util.Scanner;
public class NumberMain1 {
public static void main(String args[]) {
    Number1 number=new Number1();
    int num[]=new int[10];
    Scanner scan=new Scanner(System.in);
   for(int i=0;i<num.length;i++){
     System.out.println("Enter the number");
     num[i]=scan.nextInt();

    }
     number.setNum(num);
     int sm=number.add();
    System.out.println(sm);
  }

}