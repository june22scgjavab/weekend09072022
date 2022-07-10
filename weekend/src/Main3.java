import java.util.Scanner;
class Main3{
  private int num[];
  private int sum;

 public void setNum(int num[])
  {
     this.num=num;
  }

 public int add(){
   
    for(int i=0;i<num.length;i++){
       sum+=num[i];
     }
     return sum;   
   }

public static void main(String args[]) {
    Main3 m=new Main3();
    int num[]=new int[10];
    Scanner scan=new Scanner(System.in);
   for(int i=0;i<num.length;i++){
     System.out.println("Enter the number");
     num[i]=scan.nextInt();

    }
     m.setNum(num);
     int sm=m.add();
    System.out.println(sm);
  }

}