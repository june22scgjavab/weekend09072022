import java.util.Scanner;
class Main2{

   public static int add(int n[]){
     int sum=0;
   for(int i=0;i<n.length;i++){
       sum+=n[i];
     }
     return sum;    

   }

   public static void main(String args[]) {
    //int num[]={11,15,23,45,67,89,80};
    int num[]=new int[10];
    
    Scanner scan=new Scanner(System.in);
   for(int i=0;i<num.length;i++){
     System.out.println("Enter the number");
     num[i]=scan.nextInt();

    }
     int sm=add(num);
    System.out.println(sm);
    // System.out.println(add(num));
  }
}
 